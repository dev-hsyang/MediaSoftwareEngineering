package com.example.wiringDemo.manualwiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WiringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WiringDemoApplication.class, args); //initiating Spring container
		//automatically loads bean @Configurations and wires the beans together
		
		
		
		//Knight knight = new BraveKnight(); -----> Not Spring, just java.
		
		Knight knight = ctx.getBean(BraveKnight.class); //instead of using new(), we use ctx.getBean to return the Bean
		knight.embarkOnQuest();
		
		/* -----------------------------------> Spring Container에 Quest Bean이 한 개 이상일 시, getBean(Quest.class)로 컨테이너에 접근하면 어느 Bean인지 찾지 못한다. ""을 통해 메서드의 이름까지 주어야 한다.
		Quest quest = ctx.getBean(Quest.class);
		quest.embark();
		*/
		
		Quest quest1 = ctx.getBean("dragonQuest", Quest.class);
		quest1.embark();
		
		Quest quest2 = ctx.getBean("princessQuest", Quest.class);
		quest2.embark();
		
		Quest quest3 = ctx.getBean(RescuePrincessQuest.class);
		quest3.embark();
		
		Quest quest4 = ctx.getBean(SlayDragonQuest.class);
		quest4.embark();
	}
}
