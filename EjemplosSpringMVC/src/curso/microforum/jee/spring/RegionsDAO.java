package curso.microforum.jee.spring;

import java.util.List;
import curso.microforum.jee.spring.Regions;

public interface RegionsDAO {
	
	public List<Regions> list();
	public Regions read(long id);
	public void insert(Regions region);
	
}
