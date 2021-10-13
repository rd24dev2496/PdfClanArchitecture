package com.example.pdfappclean.interactors

import com.example.pdfappclean.data.BookmarkRepository
import com.example.pdfappclean.domain.Document


class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

  suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}