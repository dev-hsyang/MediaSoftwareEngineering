package com.example.wiringDemo.manualwiring;

import org.springframework.context.annotation.*;

@Configuration //annotation
public class KnightConfiguration {
	
	//define beans
	//Manually Wiring!!
	
	@Bean
	public Knight braveKnight() { // return type은 인터페이스로 하자. 추후에 braveKnight가 아닌 다른 하위 클래스로 수정하려고 할때 편리하다.
		return new BraveKnight(dragonQuest());
	}
	
	@Bean(name="princessQuest") // 오버라이딩을 통해 Bean의 이름을 지정해줄수도 있다. 이 Bean은 메서드는 quest()이지만 이름은 princessQuest이다.
	public Quest quest() {
		return new RescuePrincessQuest();
	}

	
	@Bean
	public Quest dragonQuest() {
		return new SlayDragonQuest();
	}
}
