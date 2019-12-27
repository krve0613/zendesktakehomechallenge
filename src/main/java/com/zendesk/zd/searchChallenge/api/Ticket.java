package com.zendesk.zd.searchChallenge.api;
/*
 * {
    "_id": "436bf9b0-1147-4c0a-8439-6f79833bff5b",
    "url": "http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json",
    "external_id": "9210cdc9-4bee-485f-a078-35396cd74063",
    "created_at": "2016-04-28T11:19:34 -10:00",
    "type": "incident",
    "subject": "A Catastrophe in Korea (North)",
    "description": "Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.",
    "priority": "high",
    "status": "pending",
    "submitter_id": 38,
    "assignee_id": 24,
    "organization_id": 116,
    "tags": [
      "Ohio",
      "Pennsylvania",
      "American Samoa",
      "Northern Mariana Islands"
    ],
    "has_incidents": false,
    "due_at": "2016-07-31T02:37:50 -10:00",
    "via": "web"
  },
 */

public class Ticket {
	private String _id = "None";
    private String url = "None";
    private String external_id = "None";
    private String created_at = "None";
    private String type = "None";
    private String subject = "None";
    private String description = "None";
    private String priority = "None";
    private String status = "None";
    private String submitter_id = "None";
    private String assignee_id = "None";
    private String organization_id = "None";
    
    private String[] tags;
    private String has_incidents = "None";
    private String due_at = "None";
    private String via = "None";
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
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubmitter_id() {
		return submitter_id;
	}
	public void setSubmitter_id(String submitter_id) {
		this.submitter_id = submitter_id;
	}
	public String getAssignee_id() {
		return assignee_id;
	}
	public void setAssignee_id(String assignee_id) {
		this.assignee_id = assignee_id;
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
	public String getHas_incidents() {
		return has_incidents;
	}
	public void setHas_incidents(String has_incidents) {
		this.has_incidents = has_incidents;
	}
	public String getDue_at() {
		return due_at;
	}
	public void setDue_at(String due_at) {
		this.due_at = due_at;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	

}
