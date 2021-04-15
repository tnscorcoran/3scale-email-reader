package app.threescale;

public class UserRequest {
	
	private String access_token;
	private String plan_id;
	private String application_id;
	private String application_key;
	private String redirect_url; 
	private String name;
	private String description;
	private String deed7;
	private String ownerNames;
	private String accessFlags;
	private String applicationContactEmail;
	private String applicationContactName;
	
	
	public UserRequest(String access_token, String plan_id, String application_id, String application_key,
			String redirect_url, String name, String description, String deed7, String ownerNames, String accessFlags,
			String applicationContactEmail, String applicationContactName) {
		super();
		this.access_token = access_token;
		this.plan_id = plan_id;
		this.application_id = application_id;
		this.application_key = application_key;
		this.redirect_url = redirect_url;
		this.name = name;
		this.description = description;
		this.deed7 = deed7;
		this.ownerNames = ownerNames;
		this.accessFlags = accessFlags;
		this.applicationContactEmail = applicationContactEmail;
		this.applicationContactName = applicationContactName;
	}


	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public String getPlan_id() {
		return plan_id;
	}


	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}


	public String getApplication_id() {
		return application_id;
	}


	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}


	public String getApplication_key() {
		return application_key;
	}


	public void setApplication_key(String application_key) {
		this.application_key = application_key;
	}


	public String getRedirect_url() {
		return redirect_url;
	}


	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDeed7() {
		return deed7;
	}


	public void setDeed7(String deed7) {
		this.deed7 = deed7;
	}


	public String getOwnerNames() {
		return ownerNames;
	}


	public void setOwnerNames(String ownerNames) {
		this.ownerNames = ownerNames;
	}


	public String getAccessFlags() {
		return accessFlags;
	}


	public void setAccessFlags(String accessFlags) {
		this.accessFlags = accessFlags;
	}


	public String getApplicationContactEmail() {
		return applicationContactEmail;
	}


	public void setApplicationContactEmail(String applicationContactEmail) {
		this.applicationContactEmail = applicationContactEmail;
	}


	public String getApplicationContactName() {
		return applicationContactName;
	}


	public void setApplicationContactName(String applicationContactName) {
		this.applicationContactName = applicationContactName;
	}


}