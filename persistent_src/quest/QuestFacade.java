
public class QuestFacade {

	private Quest getQuestByName(String questName) {
		QuestManager manager = new QuestManager();
		return manager.getQuest(questName);
	}
	
	public String getQuestData(String questName) {
		// TODO : Formate this field and add illustations
		return getQuestByName(questName).getStory();
	}
	
	public String getListObjectiveData(String questName) {
		// TODO : Maybe needs to be reworked
		return getQuestByName(questName).getObjectives().toString();
	}
	
	public boolean isStartedQuest(String questName) {
		return getQuestByName(questName).isStarted();
	}
	
	public boolean isCompletedQuest(String questName) {
		return getQuestByName(questName).isCompleted();
	}
	
	public void returnFromQuestData() {
		QuestManager manager = new QuestManager();
		manager.returnFromQuestData();
	}
	
}
