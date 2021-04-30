package by.htp.libraryproject.dao.factory;


import by.htp.libraryproject.dao.BookDAO;
import by.htp.libraryproject.dao.UserDAO;
import by.htp.libraryproject.dao.impl.SQLBookDAO;
import by.htp.libraryproject.dao.impl.SQLUserDAO;

public final class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	
	private final BookDAO sqlBookImpl = new SQLBookDAO();
	private final UserDAO sqlUserImpl = new SQLUserDAO();
	
	
	private DAOFactory(){}
	public static DAOFactory getInstance(){
	
		return instance;
	}
	
	public BookDAO getBookDAO(){
	
		return sqlBookImpl;
	}
	
	public UserDAO getUserDAO(){
	
		return sqlUserImpl;
	}
	
	}

	
	

