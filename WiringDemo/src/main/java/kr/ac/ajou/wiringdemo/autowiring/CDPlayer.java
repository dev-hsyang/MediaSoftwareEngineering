package kr.ac.ajou.wiringdemo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements IMediaPlayer {
	
//  ******Instance variable based autowiring / field based autowiring
//	@Autowired //  The resistance, Californiacation 둘 다 ICompactDisc를 implement 했기 때문에 바로 autowire가 될 수 없다.
//	@Qualifier("Resistance") //  때문에 이 ICompactDisc cd가 resistance 와 californiacation 중 어느것을 wire받을 것인지 명시한다.
								//  명시는 class name 또는 alternative name으로 한다.
	private ICompactDisc cd;    //  이 cd에는 the Resistance가 wired 되어 있다.
	
	
//  ******Constructor based autowiring
	@Autowired
	public CDPlayer(@Qualifier("Resistance") ICompactDisc cd) {
		this.cd = cd;
	}
	
	@Override
	public void playMedia() {
		cd.play();
	}
}
