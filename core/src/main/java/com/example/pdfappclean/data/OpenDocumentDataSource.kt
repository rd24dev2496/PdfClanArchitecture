package com.example.pdfappclean.data

import com.example.pdfappclean.domain.Document


interface OpenDocumentDataSource {

  fun setOpenDocument(document: Document)

  fun getOpenDocument(): Document
}