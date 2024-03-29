package com.microservice.user_service.Entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contactName;
	private Long userId;
	public Contact() {
		super();
	}
	public Contact(Long cid, String email, String contactName, Long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
