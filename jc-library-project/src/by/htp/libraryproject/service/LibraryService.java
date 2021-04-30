package by.htp.libraryproject.service;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.service.exception.ServiceException;

public interface LibraryService {

	void addNewBook(Book book)throws ServiceException;

	void addEditedBook(Book book)throws ServiceException;
	

}
