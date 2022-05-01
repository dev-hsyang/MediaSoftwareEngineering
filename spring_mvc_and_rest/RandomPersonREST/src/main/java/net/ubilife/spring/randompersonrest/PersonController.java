package net.ubilife.spring.randompersonrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles incoming REST requests to the person manager.
 * 
 * Here we use @RestController. It is basically @Controller + @ResponseBody
 * 
 * @author Teemu
 */
@RestController
public class PersonController {

	// Get a copy of the person manager object. 
	// Notice the use of the interface here!
	@Autowired
	private IPersonManager mgr;

	/**
	 * Returns a random Person object in JSON. The client must specify 
	 * "application/json" as the "Accept" header value when making a request.
	 * 
	 * To avoid typos, "application/json" can also be written as constant: 
	 * 
	 * MediaType.APPLICATION_JSON_VALUE
	 *
	 * 
	 */
	@GetMapping(value = "/random",produces = "application/json" )
	public Person randomPerson() {
		return mgr.getRandomPerson();
	}

	/**
	 * This method is called to add a new person to the person manager.
	 * Only JSON is accepted. 
	 * 
	 * In order to test this method, you must make a POST request.
	 * You can do this with a web browser add-ons such as "Postman" for Chrome. 
	 * 
	 * The web request must have the Content-Type header as "application/json'.
	 * 
	 */
	@PostMapping(value = "/add", consumes = "application/json")
	public void addPerson(@RequestBody Person p) {
		System.out.println("Received a person: " + p.getName());
		mgr.addPerson(p);
	}

}













