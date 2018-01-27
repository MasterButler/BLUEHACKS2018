package bluehackskalat.likod.modelo.kahoysaloob;

public class LoginCredentials {
	private String email;
	private String password;
	
	public LoginCredentials(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isPasswordMatch(String password) {
		return (this.password.equals(password)) ? true : false;
	}
	
	public void setPassword(String oldPassword, String newPassword) {
		if(isPasswordMatch(oldPassword)) {
			this.password = newPassword;			
		}
	}

	public boolean isCredentialOfUser(String email) {
		return this.email.equalsIgnoreCase(email) ? true : false;
	}
	
	
}
