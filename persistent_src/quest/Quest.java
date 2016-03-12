import java.util.List;

public abstract class Quest {
	
	public abstract ListObjective getObjectives();
	public abstract String getName();
	public abstract String getStory();
	public abstract boolean isStarted();
	public abstract boolean isCompleted();
	public abstract List<String> getIllustrations();

}
