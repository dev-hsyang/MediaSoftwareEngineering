package com.example.wiringDemo.manualwiring;

public class BraveKnight implements Knight {

	private Quest quest;
	
	//dependency injection
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
	

}
