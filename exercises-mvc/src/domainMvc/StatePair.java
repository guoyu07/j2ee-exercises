package domainMvc;

public class StatePair {
	private String name, abbreviation;

	public StatePair(String name, String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}
