package person_interface;

import java.util.List;

import person.Person;

public interface PersonIO {

	List<Person> getPersons();

	Person findById(int id, List<Person> persons);

	boolean removePerson(int id, List<Person> persons);

	Person updatePerson(int id,String name, List<Person> persons); 

	void displayPersons(List<Person> persons); 

	List<Person> addPerson(List<Person> persons, Person person); 

}
