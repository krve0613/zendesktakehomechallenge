package com.zendesk.zd.searchChallenge.api;
/*{
    "_id": 1,
    "url": "http://initech.zendesk.com/api/v2/users/1.json",
    "external_id": "74341f74-9c79-49d5-9611-87ef9b6eb75f",
    "name": "Francisca Rasmussen",
    "alias": "Miss Coffey",
    "created_at": "2016-04-15T05:19:46 -10:00",
    "active": true,
    "verified": true,
    "shared": false,
    "locale": "en-AU",
    "timezone": "Sri Lanka",
    "last_login_at": "2013-08-04T01:03:27 -10:00",
    "email": "coffeyrasmussen@flotonic.com",
    "phone": "8335-422-718",
    "signature": "Don't Worry Be Happy!",
    "organization_id": 119,
    "tags": [
      "Springville",
      "Sutton",
      "Hartsville/Hartley",
      "Diaperville"
    ],
    "suspended": true,
    "role": "admin"
  },*/

public class User {
	private String _id ="None";
    private String url ="None";
    private String external_id ="None";
    private String name ="None";
    private String alias ="None";
    private String created_at ="None";
    private String active ="None";
    private String verified ="None";
    private String shared ="None";
    private String locale ="None";
    private String timezone ="None";
    private String last_login_at ="None";
    private String email="None";
    private String phone ="None";
    private String signature ="None";
    private String organization_id ="None";
    
    private String[] tags;
    private String suspended ="None";
    private String role ="None";
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	public String getShared() {
		return shared;
	}
	public void setShared(String shared) {
		this.shared = shared;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getLast_login_at() {
		return last_login_at;
	}
	public void setLast_login_at(String last_login_at) {
		this.last_login_at = last_login_at;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(String organization_id) {
		this.organization_id = organization_id;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getSuspended() {
		return suspended;
	}
	public void setSuspended(String suspended) {
		this.suspended = suspended;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
   /* public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		if(_id == null || _id.contentEquals("")) {
			this._id = "None";
		}
		else {
			this._id = _id;
		}
		
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		if(url == null || url.contentEquals("")) {
			this.url = "None";
		}
		else {
			this.url = url;
		}
		
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		if(external_id == null || external_id.contentEquals("")) {
			this.external_id = "None";
		}
		else {
			this.external_id = external_id;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.contentEquals("")) {
			this.name = "None";
		}
		else {
			this.name = name;
		}
		
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		if(alias == null || alias.contentEquals("")) {
			this.alias = "None";
		}
		else {
			this.alias = alias;
		}
		this.alias = alias;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		if(created_at == null || created_at.contentEquals("")) {
			this.created_at = "None";
		}
		else {
			this.created_at = created_at;
		}
		
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		if(active == null || active.contentEquals("")) {
			this.active = "None";
		}
		else {
			this.active = active;
		}
		
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		if(verified == null || verified.contentEquals("")) {
			this.verified = "None";
		}
		else {
			this.verified = verified;
		}
		
	}
	public String getShared() {
		return shared;
	}
	public void setShared(String shared) {
		if(shared == null || shared.contentEquals("")) {
			this.shared = "None";
		}
		else {
			this.shared = shared;
		}
		
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		if(locale == null || locale.contentEquals("")) {
			this.locale = "None";
		}
		else {
			this.locale = locale;
		}
		
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		if(timezone == null || timezone.contentEquals("")) {
			this.timezone = "None";
		}
		else {
			this.timezone = timezone;
		}
		
	}
	public String getLast_login_at() {
		return last_login_at;
	}
	public void setLast_login_at(String last_login_at) {
		if(last_login_at == null || last_login_at.contentEquals("")) {
			this.last_login_at = "None";
		}
		else {
			this.last_login_at = last_login_at;
		}this.last_login_at = last_login_at;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email == null) {
			System.out.println("hellooooooooooooooooooooooooooooooooo");
			this.email = "None";
		}
		else {
			this.email = email;
		}
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if(phone == null || phone.contentEquals("")) {
			this.phone = "None";
		}
		else {
			this.phone = phone;
		}
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		if(signature == null || signature.contentEquals("")) {
			this.signature = "None";
		}
		else {
			this.signature = signature;
		}
	}
	public String getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(String organization_id) {
		if(organization_id == null || organization_id.contentEquals("")) {
			this.organization_id = "None";
		}
		else {
			this.organization_id = organization_id;
		}
		this.organization_id = organization_id;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		if(tags == null || tags.length <= 0) {
			this.tags = new String[] {"None"};
		}
		else {
			this.tags = tags;
		}
		
	}
	public String getSuspended() {
		return suspended;
	}
	public void setSuspended(String suspended) {
		if(suspended == null || suspended.contentEquals("")) {
			this.suspended = "None";
		}
		else {
			this.suspended = _id;
		}
		
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if(role == null || role.contentEquals("")) {
			this.role = "None";
		}
		else {
			this.role = role;
		}
	}*/
	
	

}
