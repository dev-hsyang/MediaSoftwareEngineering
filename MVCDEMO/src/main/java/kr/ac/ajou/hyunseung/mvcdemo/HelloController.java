package kr.ac.ajou.hyunseung.mvcdemo;

import java.util.*;
import java.awt.PageAttributes.MediaType;
import java.text.DateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	//Model
	/*
	@GetMapping(value = "/") // web page의 end point. 즉 주소 입력
	public String home(Model model) {
		
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = format.format(date);
		
		//update model
		model.addAttribute("serverTime", formattedDate);		
		
		return "home";
	}
	*/
	
	// Model
	@GetMapping(value = "/")
	public ModelAndView home() {
		
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = format.format(date);
		
		//update model
		ModelAndView mv = new ModelAndView("home");  // 생성자에서 View 이름을 지정 
		mv.addObject("serverTime", formattedDate);
		
		return mv;
	}
	
	// Model
	// Query parameter
	@GetMapping("/hello")
	public ModelAndView greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			@RequestParam(name = "dog", required = false, defaultValue = "Musti") String name2) {
		
		ModelAndView mv = new ModelAndView("hello");
		
		mv.addObject("personName", name);
		mv.addObject("dogName", name2);
		return mv;
	}
	
	
	
	@GetMapping("/form1")
	public String createForm() {
		return "form_input1";
	}
	
	@GetMapping("/form2")
	public String createForm2() {
		return "form_input2";
	}
	
	// form parameter
	@PostMapping("/formInput-1")
	public ModelAndView formInput1(String name, int age) {
		
		ModelAndView mv = new ModelAndView("cheers");
		mv.addObject("name", name);
		
		//modify input data
		mv.addObject("age", ++age);
		
		return mv;
	}
	
	@PostMapping("/formInput-2")
	public String formInput2(Model model, @ModelAttribute Person person) {
		
		//update model
		person.setHobbies(person.getHobbies() + " and Spring programming!");
		person.setAge(person.getAge());
		person.setName(person.getName());
		
		model.addAttribute("person", person);
		
		return "cheers2";
		
	}
	
	
	// path variables
	@GetMapping("/goodbye/{name}/{name2}")
	public String bye(Model model, @PathVariable String name, @PathVariable String name2) {
		
		model.addAttribute("name", name+ "!");
		model.addAttribute("name2", name2+"@");
	
		return "bye";
	}
	
	@PostMapping(value = "/api_input", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Person input3(@RequestBody Person person) {
		System.out.println("Received a person: " + person.toString());
		person.setName("Dr. " + person.getName());
		return person;
	}
	
	
	
    @GetMapping("/hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){ // json 방식, key : value 방식으로 이루어진 구조를 json 이라고 한다
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // @ResponseBody 에서 객체가 반환이 되면 json convertor 가 객체를 json 스타일로 바꾼다.
    }

    static class Hello{ // json 에서 사용할 클래스
        private String name; // json 의 key 는 name, value 는 이름.

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
	
	
}













