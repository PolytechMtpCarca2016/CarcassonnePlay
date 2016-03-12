package objective;


import java.util.ArrayList;
import java.util.List;

import quest.Quest;


public class ListObjective {
	List<Objective> tabObjectives;
	public ListObjective (Quest newQuest) {
		String quest = newQuest.getName();
		tabObjectives = new ArrayList<Objective>();
		switch(quest){
			case "demoQuest":
				tabObjectives.add(new BrutObjective("Chateau contal"));
				tabObjectives.add(new BrutObjective("Basilique st Nazaire"));
				tabObjectives.add(new BrutObjective("Porte Narbonaise"));
				tabObjectives.add(new BrutObjective("Grand puits"));
				tabObjectives.add(new BrutObjective("Place Marcou"));
				
			break;
			default:
				break;
		}
	
	}
	public void addObjective(Objective objective) {
		tabObjectives.add(objective);
	}
	public List<Objective> getListObjective () {
		return tabObjectives;
		
		
	}
	
	
	
	
	
	
	
}
