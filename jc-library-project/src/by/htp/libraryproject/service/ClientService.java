package by.htp.libraryproject.service;

import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.service.exception.ServiceException;

public interface ClientService {

	void signIn(String login, String password) throws ServiceException;

	void signOut(String login) throws ServiceException;

	void registration(User user) throws ServiceException;

	

}
