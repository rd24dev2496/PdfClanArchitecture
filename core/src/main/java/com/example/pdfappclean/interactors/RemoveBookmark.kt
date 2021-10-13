package com.example.pdfappclean.interactors

import com.example.pdfappclean.data.BookmarkRepository
import com.example.pdfappclean.domain.Bookmark
import com.example.pdfappclean.domain.Document


class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
      .removeBookmark(document, bookmark)
}