package knight_autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KnightAutowiredMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(KnightAutowiredMain.class, args);
		
		//test Knight
		Knight knight = context.getBean(BraveKnight.class);
		knight.embarkOnQuest();
		
		//test quests
		Quest quest = context.getBean("dragonQuest", Quest.class);
		quest.embark();
		
		quest = context.getBean("princessQuest", Quest.class);
		quest.embark();
		
		context.close();
	}

}
