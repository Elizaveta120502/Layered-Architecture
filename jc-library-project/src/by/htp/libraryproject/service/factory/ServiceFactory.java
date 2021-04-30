package by.htp.libraryproject.service.factory;

import by.htp.libraryproject.service.ClientService;
import by.htp.libraryproject.service.LibraryService;
import by.htp.libraryproject.service.impl.ClientServiceImpl;
import by.htp.libraryproject.service.impl.LibraryServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	private final ClientService clientService = new ClientServiceImpl();
	private final LibraryService libraryService = new LibraryServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public ClientService getCLientService() {
		return clientService;
	}

	public LibraryService getLibraryService() {
		return libraryService;
	}
}