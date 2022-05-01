package net.ubilife.spring.hellomvc;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



/**
 *  Based on tutorial: https://spring.io/guides/gs/serving-web-content/#scratch
 *  
 * 
 */

@Controller
public class HelloController {
	
	/** mapped to: http://localhost:8080/
	 * Show the current time at the server and an input form.
	 * Model is used to pass key-value pairs to the view (template hello.html).
	 * The view (home.html) is determined by the return value.
	 */
	@GetMapping(value = "/")
	public String home(Model model) {

		// get the current time at the server and store it to the model 
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		// return the view name (home.html)
		return "home";
	}
	
	
	/**
	 *  mapped to: http://localhost:8080/hello?name=Teemu
	 *  
	 */
	@GetMapping("/hello")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		// return hello view (hello.html template)
		return "hello";
	}
	
	/** mapped to: http://localhost:8080/goodbye/Teemu
	 * Here we use ModelAndView to pass the view name and the
	 * information at the same time.
	 */
	@GetMapping("/goodbye/{name}")
	public ModelAndView bye(@PathVariable String name) {
		
		// return name data and the bye view (bye.html template)
		ModelAndView mv = new ModelAndView("bye");
		mv.addObject("name", name);
		return mv;
	}
	
	/**
	 * Demonstrates the reception of form data over POST. To call it, just load
	 * the home view (http://localhost:8080/) and fill in the first form.
	 * 
	 * The "name" and "age" POST parameters are mapped to the "name" and "age" 
	 * parameters of the cheers.html template.
	 * 
	 * Notice that here we use @PostMapping because we handle a POST request.

	 */
	@PostMapping(value = "/form_input1")
	public ModelAndView input1(String name, int age) {
		ModelAndView mv = new ModelAndView("cheers");
		mv.addObject("name", name);
		mv.addObject("age", ++age);
		return mv;
	}
	
	/**
	 * Alternative implementation of "cheers" that uses a Person object 	
	 * to carry all form fields.
	 * 
	 * To call it, just load the home view (http://localhost:8080/) 
	 * and fill in the second form.
	 * 
	 * 
	 * @param person
	 * @return
	 */
	@PostMapping(value = "/form_input2")
	public ModelAndView input2(@ModelAttribute Person person) {
		ModelAndView mv = new ModelAndView("cheers2");
		person.setHobbies("Spring programming");
		mv.addObject("person", person);
		return mv;
	}	
	
	/** This method receives JSON objects from an external client. 
	 * 
	 * It modifies the object and returns it back.
	 *  
	 * To call it: http://localhost:8080/api_input
	 * 
	 * @RequestBody is needed to receive an object
	 * 	 @ResponseBody is needed when to return an object
	 *  
	 * @return
	 */
	@PostMapping(value = "/api_input", produces= MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Person input3(@RequestBody Person person) {
		System.out.print("Received a person: "+ person.toString());		
		person.setName("Dr. "+person.getName()); // modify and return
		return person;
	}	
	
}
