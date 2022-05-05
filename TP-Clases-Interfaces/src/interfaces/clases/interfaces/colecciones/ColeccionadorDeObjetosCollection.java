package interfaces.clases.interfaces.colecciones;

import java.util.Collection;

public class ColeccionadorDeObjetosCollection {

	public Object getFirstFrom(Collection collection) {
		//return collection.get(0);
		return null;
	}
	
	public void addLast(Object element, Collection collection) {
		collection.add(element);
	}
	
	public Collection getSubCollection(Collection collection, int from, int to) {
		//return collection.subList(from, to);
		return null;
	}
	
	public Boolean containsElement(Collection collection, Object element) {
		return collection.contains(element);
	}
}
