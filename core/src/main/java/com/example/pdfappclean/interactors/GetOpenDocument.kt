package com.example.pdfappclean.interactors
import com.example.pdfappclean.data.DocumentRepository


class GetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke() = documentRepository.getOpenDocument()
}
