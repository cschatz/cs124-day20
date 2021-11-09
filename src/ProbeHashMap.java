
public class ProbeHashMap<K, V> extends AbstractMap<K, V> {

	// The hash table itself
	MapEntry<K, V>[] table;
	// Number of entries
	private int numEntries;
	// Capacity
	private int capacity;
	
	// Constructor
	public ProbeHashMap() {
		capacity = 17;
		numEntries = 1;
		table = new MapEntry<K, V>[capacity];
	}
	
	
	// Determine which bucket a given key goes in
	private int bucket(K key) {
		return key.hashCode() % capacity;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
