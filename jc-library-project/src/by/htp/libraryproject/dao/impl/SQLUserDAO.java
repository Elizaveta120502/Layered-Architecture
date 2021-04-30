package by.htp.libraryproject.dao.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;

import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.dao.UserDAO;
import by.htp.libraryproject.dao.exeption.DAOException;

public class SQLUserDAO implements UserDAO {

	@Override
	public void signIn(String login, String password) throws DAOException {
		
		try {
			FileReader reader = new FileReader("User.txt");
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		}

	}

	@Override
	public void registration(User user) throws DAOException {
		
		try {
			FileReader userread = new FileReader("User.txt");
		} catch (FileNotFoundException u) {
			throw new DAOException(u);
		}

	}

}
