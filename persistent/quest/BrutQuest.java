package quest;

import java.util.ArrayList;
import java.util.List;

public class BrutQuest extends Quest {
	
	private String name;
	private String story;
	private boolean started;
	private boolean completed;
	private List<String> illustrations;

	public BrutQuest(String questName) {
		this.name = questName;
		switch (questName) {
		case "demoQuest":
			this.story="sauver le soldat Ryan";
			this.started=true;
			this.completed=false;
			this.illustrations= new ArrayList<String>();
			this.illustrations.add("photo1");
			break;
		case "la dame carcas":
			this.story="carcassonne";
			this.started=false;
			this.completed=false;
			this.illustrations= new ArrayList<String>();
			this.illustrations.add("photo2");
			break;
		default:
			break;
		}
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
