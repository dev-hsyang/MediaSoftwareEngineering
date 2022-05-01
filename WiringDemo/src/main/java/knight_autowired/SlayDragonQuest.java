package knight_autowired;

import org.springframework.stereotype.Component;

@Component("dragonQuest")
public class SlayDragonQuest implements Quest{

	@Override
	public void embark() {
		System.out.println("Embarking on quest to slay a dragon!");
		
	}
}
