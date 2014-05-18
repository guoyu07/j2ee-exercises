package repositoryMvc;

import java.util.HashMap;
import java.util.Map;

import domainMvc.StatePair;

public class StateMapRepository implements StateRepository {
	private Map<String,StatePair> statePairs;
	
	public StateMapRepository() {
		statePairs = new HashMap<>();
		addStatePair(new StatePair("California", "CA"));
		addStatePair(new StatePair("Maryland", "MD"));
	}
	
	private void addStatePair(StatePair statePair) {
		statePairs.put(statePair.getName(), statePair);
	}

	@Override
	public StatePair getStatePair(String stateName) {
		if(stateName != null) {
			return statePairs.get(stateName);
		} else {
			return null;
		}
	}
}
