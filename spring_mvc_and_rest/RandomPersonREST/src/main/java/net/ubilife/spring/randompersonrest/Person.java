package net.ubilife.spring.randompersonrest;


/**
 * A POJO representing a person.
 * 
 * @author Teemu
 *
 */
public class Person {

	private String name;
	private int age;
	private String hobbies;
	private String major;

	public Person(String name, int age, String hobbies, String major) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
		this.major = major;
	}
	
	public Person() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	

	@Override
	public String toString() {
		return "["+name+"], ["+age+"], ["+hobbies+"], ["+ major+"]";
	}

	/** This equals method compares the field values rather than 
	 *  memory references. It is used by ArrayLists indexOf() to 
	 *  check the equality of two Contact objects.
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			
			Person other = (Person)obj;
			
			return name.equals(other.name) &&
					age == other.age &&
					hobbies.equals(other.hobbies) &&
					major.equals(other.major);
			
		}
		
		return false;
	}
}
