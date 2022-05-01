package net.ubilife.spring.randompersonrest;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * This class takes care of storing Person objects in an ArrayList.
 * 
 * The role of this class is a business logic service (hence "@Service") that is called
 * by the controller to perform some operations. This kind of division
 * of responsibilities is quite common in Spring MVC / REST applications.
 * 
 * Note that this class implements the IPersonManager interface. This means that
 *  we could create another manager implementation in the future that could use 
 *  an actual database. The controller or the client do not need to be changed 
 *  as long as the interfaces remain the same!
 * 
 * @author Teemu
 *
 */
@Service
public class PersonManagerImpl implements IPersonManager {

	private ArrayList<Person> persons = new ArrayList<Person>();

	/** Perform initial data insertion.
	 *  @PostConstruct means that the method is called automatically after the bean
	 * has been created.
	 */ 
	@PostConstruct
	private void init() {
		// test data
		persons.add(new Person("Gildong Hong", 22, "Running, Cycling", "Digital Media"));
	}

	/** This method adds a new person to the ArrayList if
	 *  it does not exist yet (and if it is not null).
	 */
	@Override
	public boolean addPerson(Person p) {
		if (p != null && persons.indexOf(p) == -1) {
			persons.add(p);
			return true;
		}
		return false;
	}

	/** Return a random person from the list 
	 * 
	 */
	@Override
	public Person getRandomPerson() {

		if (persons.size() == 0)
			return null;

		int idx = (int) (Math.random() * persons.size());
		return persons.get(idx);

	}

}
