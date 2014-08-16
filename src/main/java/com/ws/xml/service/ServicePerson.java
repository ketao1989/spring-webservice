package com.ws.xml.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import com.ws.xml.view.Person;

/**
 * Service Layer
 *  With EHCache Implementation
 * 
 * @author Bonec
 */
@Service
public class ServicePerson implements PersonService
{
	private Set<Person> persons = new HashSet<Person>();

	public Person getPerson(String id)
	{
		Person person = new Person(id, "", "");
		if (persons.contains(person))
		{
			for (Person p : persons)
			{
				if (p.equals(person))
				{
					return p;
				}
			}
		}
		return null;
	}

	public Set<Person> getPersons()
	{
		return persons;
	}

	public void addPerson(Person person)
	{
		persons.add(person);
	}


	public void removePerson(String id)
	{
		persons.remove(new Person(id, "", ""));
	}
}
