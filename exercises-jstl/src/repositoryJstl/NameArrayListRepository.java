package repositoryJstl;

import java.util.ArrayList;
import java.util.List;

import domainJstl.Name;

public class NameArrayListRepository implements NameRepository {

	private List<Name> names;
	
	public NameArrayListRepository() {
		names = new ArrayList<>();
		names.add(new Name("Mickey","Mouse"));
		names.add(new Name("Donald","Duck"));
		names.add(new Name("Minnie","Mouse"));
	}

	@Override
	public List<Name> getNames() {
		return names;
	}

}
