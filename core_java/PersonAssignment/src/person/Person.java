package person;

public class Person {
	private int id;
	private String name;

	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public boolean equals(Object o)
	{
		Person p=(Person)o;
		if(this.getId()==p.getId()&&this.getName().equals(p.getName()))
		{
			return true;
		}
		
		return false;
	}

}
