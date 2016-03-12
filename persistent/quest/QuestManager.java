package quest;

public class QuestManager {
	
	public Quest getQuest(String questName) {
		QuestFactory factory = new BrutQuestFactory();
		return factory.buildQuestByName(questName);
	}
	
	public void returnFromQuestData() {
		
	}

}
