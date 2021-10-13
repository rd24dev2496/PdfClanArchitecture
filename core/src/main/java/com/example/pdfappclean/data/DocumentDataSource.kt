package com.example.pdfappclean.data

import com.example.pdfappclean.domain.Document


interface DocumentDataSource {

  suspend fun add(document: Document)

  suspend fun readAll(): List<Document>

  suspend fun remove(document: Document)
}