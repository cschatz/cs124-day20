
public class MyMap<K extends Comparable<K>, V> {
	
	private class Entry implements Comparable<Entry> {
		K key;
		V value;
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public int compareTo(MyMap<K, V>.Entry otherEntry) {
			return key.compareTo(otherEntry.key);
		}
	}
	
	// The main structure we store things in is a BST
	private BST<Entry> tree;
	
	public MyMap() {
		tree = new BST<Entry>();
	}
	
	void put(K key, V value) {
		Entry entry = new Entry(key, value);
		tree.insert(entry);
	}
}
