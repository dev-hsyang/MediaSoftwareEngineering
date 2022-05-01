package net.ubilife.spring.randompersonrest;

/** 
 * 
 * @author Teemu
 *
 */
public interface IPersonManager {
	boolean addPerson(Person p);
	Person getRandomPerson();
}
