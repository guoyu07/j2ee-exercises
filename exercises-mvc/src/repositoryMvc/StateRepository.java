package repositoryMvc;

import domainMvc.StatePair;

public interface StateRepository {
	public StatePair getStatePair(String stateName);
}
