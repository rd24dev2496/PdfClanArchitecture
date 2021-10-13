package com.example.pdfappclean.interactors
import com.example.pdfappclean.data.DocumentRepository

import com.example.pdfappclean.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}