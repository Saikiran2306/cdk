package person_interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import person.Person;

public class PersonIOImpl implements PersonIO {

	@Override
	public List<Person> getPersons() {

		BufferedReader br = null;
		List<Person> persons = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			persons = new ArrayList<Person>();
			System.out.println("Enter the number of persons");
			int num = Integer.parseInt(br.readLine());
			int id;
			String name;
			for (int i = 0; i < num; i++) {
				System.out.println("Enter the person " + (i + 1) + " information");
				System.out.println("Enter person id");
				id = Integer.parseInt(br.readLine());
				System.out.println("Enter person name");
				name = br.readLine();
				persons.add(new Person(id, name));
				System.out.println();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return persons;
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		Person person = null;
		for (Person obj : persons) {
			if (obj.getId() == id) {
				person = obj;
				break;
			}
		}
		return person;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub

		return persons.remove(findById(id, persons));
	}

	@Override
	public Person updatePerson(int id, String name, List<Person> persons) {
		// TODO Auto-generated method stub
		Person person = findById(id, persons);
		if (person != null) {
			person.setName(name);
		}

		return person;
	}

	@Override
	public void displayPersons(List<Person> persons) {
		// TODO Auto-generated method stub

		for (Person person : persons) {
			System.out.println(person.getId() + " : " + person.getName());
		}

	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		// TODO Auto-generated method stub

		if (findById(person.getId(), persons) == null)
			persons.add(person);
		else {
			System.out.println("Person already exists with that Id");
		}

		return persons;
	}

}
