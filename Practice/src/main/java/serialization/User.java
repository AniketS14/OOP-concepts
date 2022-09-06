package serialization;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 7148561634028749725L;
	private String username;
	private transient String password;

	public void setUserName(String username) {
		this.username = username;
	}

	public String getUserName() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

}
