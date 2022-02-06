package collect;

public class User {
	private String name;
	private String id;
	private String pw;
	
	public User() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		String str = name + ", " + id + "," + pw + "/";
		return str;
	}
}
