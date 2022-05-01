package kr.ac.ajou.wiringdemo.autowiring;

import org.springframework.stereotype.Component;

@Component("Resistance")  //annotation makes classes discoverable for autowiring
						  //("  ")을 통해 alternative 이름을 부여할 수 있다. qualifier에서 사용 가	
public class TheResistance implements ICompactDisc{
	
	private String title = "The Resistance";
	
	private String artist = "Muse";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
	
	
	
}
