package CasinoCopenhagen;

public class User {
	private String name;
	private String cpr;

	private boolean isDealer;

	public User() {
	}

	public User(String name, String cpr) {
		this.name = name;
		this.cpr = cpr;
	}

	public User(String name, String cpr, boolean isDealer) {
		this.name = name;
		this.cpr = cpr;
		this.isDealer = isDealer;
	}

	//get age method here

	@Override
	public String toString() {
		return "User{" +
			"name='" + name + '\'' +
			", cpr='" + cpr + '\'' +
			", isDealer=" + isDealer +
			'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public boolean isDealer() {
		return isDealer;
	}

	public void setDealer(boolean dealer) {
		isDealer = dealer;
	}
}
