package com.example.pdfappclean.data

import com.example.pdfappclean.domain.Bookmark
import com.example.pdfappclean.domain.Document


interface BookmarkDataSource {

    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}