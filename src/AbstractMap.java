

public abstract class AbstractMap<K, V> implements Map<K, V> {
	
	protected static class MapEntry<K,V> {
		K key;
		V value;
		// constructor
		public MapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	abstract public int size();
	abstract public boolean isEmpty();
	abstract public V get(K key);
	abstract public V put(K key, V value);
	abstract public V remove(K key);
}
