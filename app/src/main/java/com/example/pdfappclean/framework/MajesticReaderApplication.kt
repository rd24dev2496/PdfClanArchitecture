
package com.example.pdfappclean.framework

import android.app.Application
import com.example.pdfappclean.data.BookmarkRepository
import com.example.pdfappclean.data.DocumentRepository
import com.example.pdfappclean.framework.db.InMemoryOpenDocumentDataSource
import com.example.pdfappclean.interactors.*


class MajesticReaderApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    val bookmarkRepository = BookmarkRepository(RoomBookmarkDataSource(this))
    val documentRepository = DocumentRepository(
        RoomDocumentDataSource(this),
        InMemoryOpenDocumentDataSource()
    )

    MajesticViewModelFactory.inject(
        this,
        Interactors(
            AddBookmark(bookmarkRepository),
            GetBookmarks(bookmarkRepository),
            RemoveBookmark(bookmarkRepository),
            AddDocument(documentRepository),
            GetDocuments(documentRepository),
            RemoveDocument(documentRepository),
            GetOpenDocument(documentRepository),
            SetOpenDocument(documentRepository)
        )
    )
  }

}