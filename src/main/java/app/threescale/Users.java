package app.threescale;

public class Users {

	private User [] users;

	public User [] getUsers() {
		return users;
	}

	public void setApplications(User [] users) {
		this.users = users;
	}

	public int getUserCount() {
		
		if(users!=null && users.length>0) {
			return users.length;
		}
		else {
			return 0;
		}
		
	}

	
}
