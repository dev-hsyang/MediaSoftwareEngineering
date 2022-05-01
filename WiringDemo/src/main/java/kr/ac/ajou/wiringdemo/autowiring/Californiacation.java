package kr.ac.ajou.wiringdemo.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Californiacation implements ICompactDisc {
	
	private String title = "Californiacation";
	private String artist = "Red Hot Chili Peppers";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
	
}
