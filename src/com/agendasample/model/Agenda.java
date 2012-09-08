package com.agendasample.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Agenda implements Serializable {
  private Map<Integer, Person> contacts;

  public Agenda() {
	super();
	contacts = new HashMap<Integer, Person>();
  }
  
  public Agenda(Map<Integer, Person> contacts) {
	super();
	this.contacts = contacts;
  }
  
  public Map<Integer, Person> getContacts() {
    return this.contacts;
  }
  
  public void addContact(Person person) {
	this.contacts.put(person.getDni(), person);
  }
  
  public void deleteContact(Person person) {
	this.contacts.remove(person);
  }
  
  public Person searchContact(int dni) {
	return this.contacts.get(dni);
  }
  
}
