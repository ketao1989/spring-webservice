package com.ws.xml.payload;

import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.xml.service.PersonService;
import com.ws.xml.view.Person;

/**
 * Sample Web Service Interface Payload
 * @author Bonec
 *
 */
@Service("personPayload")
@WebService(endpointInterface = "com.ws.xml.payload.PersonPayload", serviceName = "PersonPayload", portName = "PersonPayloadPort")
public class PersonPayloadImpl implements PersonPayload
{
	
	@Autowired
	private PersonService servicePerson;
	
	@WebMethod
	public Person getPerson(@WebParam(name = "id") String id)
	{
		return servicePerson.getPerson(id);
	}

	@WebMethod
	public Set<Person> getPersons()
	{
		return servicePerson.getPersons();
	}

	@WebMethod
	public void addPerson(@WebParam(name = "person") Person person)
	{
		servicePerson.addPerson(person);
	}

	@WebMethod
	public void removePerson(@WebParam(name = "id") String id)
	{
		servicePerson.removePerson(id);
	}
}
