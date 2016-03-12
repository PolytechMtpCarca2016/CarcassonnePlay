
public class BrutQuestFactory extends QuestFactory {

	@Override
	public Quest buildQuestByName(String questName) {
		return new BrutQuest(questName);
	}

}
