package by.htp.libraryproject.controller.command.impl;

import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.ClientService;
import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.factory.ServiceFactory;

public class SignIn implements Command {

	@Override
	public String execute(String request) {
		String login = null;
		String password = null;
		String response = null;
		
		// get parameters from request and initialize the variables login and password
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ClientService clientService = serviceFactory.getCLientService();

		try {
			clientService.signIn(login, password);
			response = "Welcome";
		} catch (ServiceException e) {
			// write log
			response = "Error duiring login procedure";
		}
		return response;
	}

}
