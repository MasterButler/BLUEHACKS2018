package bluehackskalat.likod.modelo.kahoysaloob;

import java.util.ArrayList;

import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;

public class LoginManager {
	private static LoginManager instance;
	private ArrayList<LoginCredentials> loginList;
	
	private LoginManager() {
		loginList = new ArrayList<LoginCredentials>();
		
		LoginCredentials lc1 = new LoginCredentials("wisner@gmail.com", "pass");
		
		loginList.add(lc1);
	}
	
	public static LoginManager getInstance() {
		if(instance == null) {
			instance = new LoginManager();
		}
		return instance;
	}
	
	public LoginCredentials getLoginCredentials(String email) {
		for(LoginCredentials lc : loginList) {
			if(lc.getEmail().equalsIgnoreCase(email)) {
				return lc;
			}
		}
		return null;
	}
	
	public static User loginUser(String email, String password) {
		LoginCredentials lc = getInstance().getLoginCredentials(email);
		if(lc != null) {
			if(lc.isPasswordMatch(password)) {
				return UserManager.getInstance().getUser(email);
			}
		}
		return null;
	}
}
