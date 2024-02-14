package service;

import java.util.List;

import entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}
