package com.example.pdfappclean.interactors
import com.example.pdfappclean.data.DocumentRepository

import com.example.pdfappclean.domain.Document


class RemoveDocument(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke(document: Document) = documentRepository.removeDocument(document)
}