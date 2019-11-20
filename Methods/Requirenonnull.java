import java.util.Objects;

/*
	Program to demonstrate objects.requireNonNull(object o)
	and objects.requireNonNull(Object o, String mesage)
*/
public class Requirenonnull  <K,V>{
	
	public K key;
	public V value;
	
	public Requirenonnull (K key , V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) {
		this.key = Objects.requireNonNull(key);
	}
	
	public void setValue(V value) {
		this.value = Objects.requireNonNull(value, "No Value");
	}
	
	public static void main(String [] args) {
		Requirenonnull <String, String> p1 = new Requirenonnull <String, String>("GFG", "geeksforgeeks.org");
		p1.setKey("Geeks");
		p1.setValue(null);
	}
}
