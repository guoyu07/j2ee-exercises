package domainJstl;

import java.util.ArrayList;
import java.util.List;

public class Names {
	private List<String> firstNames;

	public Names(String... firstNames) {
		this.firstNames = new ArrayList<>();
		for(String firstName : firstNames) {
			this.firstNames.add(firstName);
		}
	}
	
	public List<String> getFirstNames() {
		return firstNames;
	}
}
