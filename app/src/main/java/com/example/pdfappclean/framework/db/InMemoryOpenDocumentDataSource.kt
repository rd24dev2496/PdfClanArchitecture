package com.example.pdfappclean.framework.db

import com.example.pdfappclean.data.OpenDocumentDataSource
import com.example.pdfappclean.domain.Document


class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

  private var openDocument: Document = Document.EMPTY

  override fun setOpenDocument(document: Document) {
    openDocument = document
  }

  override fun getOpenDocument() = openDocument
}