package cse_sjc;

import java.util.ResourceBundle;

public class App {
	public int userLogin(String in_user,String in_pwd) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String passward=rb.getString("passward");
		if(in_user.equals(username))&&in_pwd.equals(passward))
			return 1;
		else
			return 0;
	
	}

}
