package com.ws.xml.payload;

import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ws.xml.view.Person;

/**
 * Web Service Interface Payload
 * @author Bonec
 *
 */
@WebService
public interface PersonPayload
{


	@WebMethod
	Person getPerson(@WebParam(name = "id") String id);

	@WebMethod
	Set<Person> getPersons();

	@WebMethod
	void addPerson(@WebParam(name = "person") Person person);

	@WebMethod
	void removePerson(@WebParam(name = "id") String id);

}
