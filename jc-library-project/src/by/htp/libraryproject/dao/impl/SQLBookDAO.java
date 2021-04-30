package by.htp.libraryproject.dao.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.dao.BookDAO;
import by.htp.libraryproject.dao.exeption.DAOException;

public class SQLBookDAO implements BookDAO {

	@Override
	public void AddBook(Book book) throws DAOException {

	}

	@Override
	public void deleteBook(long idBook) throws DAOException {

	}

	@Override
	public void deleteBook(Book book) throws DAOException{

	}

	@Override
	public void MarkAsRead(Book book, String readornot, long idBook) throws DAOException {

	}

	@Override
	public void AddToFavourites(Book book,String favourite, long idBook) throws DAOException {

	}

}
