package test_person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import exception.PersonNotFoundException;
import person.Person;
import person_interface.PersonIO;
import person_interface.PersonIOImpl;

public class TetsPerson {

	public static void main(String[] args) {

		PersonIO personIOImpl = new PersonIOImpl();

		List<Person> persons = personIOImpl.getPersons();
		BufferedReader br = null;
		Person person = null;
		try {
			while (true) {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(
						"\n 1. Add new person \n 2. Update person name \n 3. Find person \n 4. Display persons \n 5. Remove person \n 6. Exit \n");
				System.out.println("Enter your choice");
				int no = Integer.parseInt(br.readLine());
				switch (no) {

				case 1:
					System.out.println("Enter new person details to add");
					System.out.println("Enter person id");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter person name");
					String name = br.readLine();
					System.out.println("New person added");
					personIOImpl.displayPersons(personIOImpl.addPerson(persons, new Person(id, name)));
					break;

				case 2:
					System.out.println("Enter person id and name to update person name");
					System.out.println("Enter person id ");
					id = Integer.parseInt(br.readLine());
					person = personIOImpl.findById(id, persons);
					if (person == null) {
						throw new PersonNotFoundException("Person not found");
					} else {
						System.out.println("Enter the person name");
						name = br.readLine();
						person = personIOImpl.updatePerson(id, name, persons);
						System.out.println("Updated person");
						System.out.println(person);

					}
					break;

				case 3:
					System.out.println("Enter person id to find");
					id = Integer.parseInt(br.readLine());
					person = personIOImpl.findById(id, persons);
					if (person == null) {
						throw new PersonNotFoundException("Person not found");
					} else {
						System.out.println("Person found");
						System.out.println(person);
					}
					break;

				case 4:
					System.out.println("Dispaly all persons details");
					personIOImpl.displayPersons(persons);
					break;

				case 5:
					System.out.println("Enter persond id to remove");
					id = Integer.parseInt(br.readLine());
					if (personIOImpl.removePerson(id, persons)) {
						System.out.println("Person with id " + id + " removed");
					} else {
						System.out.println("Person not exist");
					}
					break;

				case 6:
					System.out.println("Exited...");
					System.exit(0);
					break;
				default:
					System.out.println("Entered invalid choice");
					break;

				}
			}

		} catch (PersonNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
