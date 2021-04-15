package app.threescale;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "links" })

public class User {
	private Map<String, Object> user;

	public Map<String, Object> getUser() {
		return user;
	}

	public void setUsers(Map<String, Object> user) {
		this.user = user;
	}
	
}
