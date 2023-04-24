package aaa.bbb.ccc;

import aaa.bbb.service.UserService;

public class userServiceFactory {

	private static UserService service = null;

	public static UserService getInstance() {

		if (service == null) {
			service = new UserService();
		}

		return service;
	}
	
}
