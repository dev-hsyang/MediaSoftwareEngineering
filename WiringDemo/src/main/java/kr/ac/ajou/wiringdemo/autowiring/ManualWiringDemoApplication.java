package kr.ac.ajou.wiringdemo.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ManualWiringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ManualWiringDemoApplication.class, args);
		
		IMediaPlayer player = ctx.getBean(IMediaPlayer.class); // Component annotation들 중 IMediaPlayer를 할당
		player.playMedia();
		
		
		ICompactDisc cd1 = ctx.getBean("californiacation", ICompactDisc.class); 
		//  ICompactDisc bean (component)가 두개 이기 떄문에, class name 혹은 alternative name으로 명시를 해줘야한다.
		cd1.play();
		
		ICompactDisc cd2 = ctx.getBean("Resistance", ICompactDisc.class);
		cd2.play();
	}

}
