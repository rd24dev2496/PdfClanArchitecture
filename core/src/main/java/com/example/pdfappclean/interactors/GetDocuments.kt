package com.example.pdfappclean.interactors

import com.example.pdfappclean.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke() = documentRepository.getDocuments()
}
