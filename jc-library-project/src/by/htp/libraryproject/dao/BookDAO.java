package by.htp.libraryproject.dao;

import by.htp.libraryproject.bean.Book;


import by.htp.libraryproject.dao.exeption.DAOException;

public interface BookDAO {

	void AddBook(Book book)  throws DAOException;

	void deleteBook(long idBook)  throws DAOException;

	void deleteBook(Book book)  throws DAOException;

	void MarkAsRead(Book book, String readornot, long idBook)  throws DAOException;

	void AddToFavourites(Book book, String favourite, long idBook)  throws DAOException;

}
