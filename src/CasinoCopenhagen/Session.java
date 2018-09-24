package CasinoCopenhagen;

public class Session {
	private String username;
	private String password;
	private boolean isLoggedIn = false;


	public Session() {
	}

	public Session(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Session(String username, String password, boolean isLoggedIn) {
		this.username = username;
		this.password = password;
		this.isLoggedIn = isLoggedIn;
	}

	@Override
	public String toString() {
		return "Session{" +
			"username='" + username + '\'' +
			", password='" + password + '\'' +
			", isLoggedIn=" + isLoggedIn +
			'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		isLoggedIn = loggedIn;
	}
}
