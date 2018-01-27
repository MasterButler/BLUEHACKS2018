package bluehackskalat.likod.modelo.user;

import java.util.ArrayList;

public class UserManager {
	private static UserManager instance;
	private static ArrayList<User> userList;
	
	
	
	private UserManager() {
		userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setName("Wisner");
		user1.setEmail("wisner@gmail.com");
		user1.setContactNo("09979640257");
		user1.setHomeAddress("97 TRAMO, PASAY");
		
		user1.setBDayDate(26);
		user1.setBDayMonth(11);
		user1.setBDayYear(1998);
		
		user1.setFinishedTasks(1);
		user1.setCreditCount(1000);
		
		userList.add(user1);
	}
	
	public static UserManager getInstance() {
		if(instance == null) {
			instance = new UserManager();
		}
		return instance;
	}
	
	public boolean addUser(User user) {
		if(userList.add(user)) {
			return true;
		}
		return false;
	}
	
	public User getUser(String email) {
		for(User u: userList) {
			if(u.getEmail().equalsIgnoreCase(email)) {
				return u;
			}
		}
		return null;
	}
	
	public boolean removeUser(User user) {
		User u = getUser(user.getContactNo());
		if(u != null) {
			if(userList.remove(u)) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<User> getAllUser(){
		return userList;
	}
}
