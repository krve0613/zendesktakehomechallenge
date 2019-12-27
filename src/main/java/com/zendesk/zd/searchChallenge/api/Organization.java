package com.zendesk.zd.searchChallenge.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*{
    "_id": 101,
    "url": "http://initech.zendesk.com/api/v2/organizations/101.json",
    "external_id": "9270ed79-35eb-4a38-a46f-35725197ea8d",
    "name": "Enthaze",
    "domain_names": [
      "kage.com",
      "ecratic.com",
      "endipin.com",
      "zentix.com"
    ],
    "created_at": "2016-05-21T11:10:28 -10:00",
    "details": "MegaCorp",
    "shared_tickets": false,
    "tags": [
      "Fulton",
      "West",
      "Rodriguez",  
      "Farley"
    ]
  },*/


public class Organization {
    private String _id;
    private String url;
    private String external_id;
    private String name;
    private String[] domain_names;
    private String created_at;
    private String details;
    private String shared_tickets;
    private String[] tags;
    
	public String get_id() {
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
	public String[] getDomain_names() {
		return domain_names;
	}
	public void setDomain_names(String[] domain_names) {
		if(domain_names == null || domain_names.length <=0 ) {
			this.domain_names = new String[]{"None"};
		}
		else {
			this.domain_names = domain_names;
		}
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		if(created_at == null || created_at.contentEquals("") ) {
			this.created_at = "None";
		}
		else {
			this.created_at = created_at;
		}
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		if(details == null || details.contentEquals("")) {
			this.details = "None";
		}
		else {
			this.details = details;
		}
		
	}
	public String getShared_tickets() {
		return shared_tickets;
	}
	public void setShared_tickets(String shared_tickets) {
		if(shared_tickets == null || shared_tickets.contentEquals("") ) {
			this.shared_tickets = "None";
		}
		else {
			this.shared_tickets = shared_tickets;
		}
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		if(tags == null || tags.length <=0 ) {
			this.tags = new String[]{"None"};
		}
		else {
			this.tags = tags;
		}
	}
    
    
	
   
    
}
