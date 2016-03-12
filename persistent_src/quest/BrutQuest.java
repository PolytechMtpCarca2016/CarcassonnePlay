import java.util.List;

public class BrutQuest extends Quest {
	
	private ListObjective objectives;
	private String name;
	private String story;
	private boolean started;
	private boolean completed;
	private List<String> illustrations;

	public BrutQuest(String questName) {
		this.name = questName;
		switch (questName) {
		case "demoQuest":
			break;
		default:
			break;
		}
	}

	@Override
	public ListObjective getObjectives() {
		return this.objectives;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getStory() {
		return this.story;
	}

	@Override
	public boolean isStarted() {
		return this.started;
	}

	@Override
	public boolean isCompleted() {
		return this.completed;
	}

	@Override
	public List<String> getIllustrations() {
		return this.illustrations;
	}

}
