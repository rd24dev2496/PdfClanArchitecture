package com.example.pdfappclean.interactors

import com.example.pdfappclean.data.BookmarkRepository
import com.example.pdfappclean.domain.Bookmark
import com.example.pdfappclean.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) =
      bookmarkRepository.addBookmark(document, bookmark)
}