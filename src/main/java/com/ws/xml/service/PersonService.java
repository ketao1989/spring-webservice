package com.ws.xml.service;

import java.util.Set;

import com.ws.xml.view.Person;

/**
 * Sample Service Layer INterface
 * @author Bonec
 *
 */
public interface PersonService
{

	Person getPerson(String id);

	Set<Person> getPersons();

	void addPerson(Person person);

	void removePerson(String id);
}
