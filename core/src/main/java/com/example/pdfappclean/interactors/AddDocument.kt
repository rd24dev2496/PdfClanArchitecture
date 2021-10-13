package com.example.pdfappclean.interactors

import com.example.pdfappclean.data.DocumentRepository
import com.example.pdfappclean.domain.Document


class AddDocument(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}
