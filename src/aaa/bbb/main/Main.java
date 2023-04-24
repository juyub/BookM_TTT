package aaa.bbb.main;

import aaa.bbb.top.SelectUI;

public class Main {

	public static void main(String[] args) {
			
		try {
			new SelectUI().execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
	