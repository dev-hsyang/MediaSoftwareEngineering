package knight_autowired;

import org.springframework.stereotype.Component;

@Component("princessQuest")
public class RescuePrincessQuest implements Quest{
	
	public void embark() {
		System.out.println("Embarking on a quest to rescue a princess");
	}

}
