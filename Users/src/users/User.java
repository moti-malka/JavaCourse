package users;

public class User {
	private final String name;
	private String password;
	
	public User(String Name, String Password) {
		this.name = Name;
		this.password = Password;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	
	

}
