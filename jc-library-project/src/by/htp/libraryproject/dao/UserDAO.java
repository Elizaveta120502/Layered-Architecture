package by.htp.libraryproject.dao;

import by.htp.libraryproject.bean.User;

import by.htp.libraryproject.dao.exeption.DAOException;

public interface UserDAO {

	void signIn(String login, String password) throws DAOException;

	void registration(User user) throws DAOException;
}
