// A(3), B(2), C(1), D(2)



import java.util.ArrayList;


public class HeapPriorityQueue<E> {
	
	private class Entry {
		int priority;
		E value;
		
		// Constructor
		public Entry(int priority, E value) {
			this.value = value;
			this.priority = priority;
		}
	};
	
	// Store the heap as an array list
	private ArrayList<Entry> items;
	
	private int parent(int i) {
		return (i - 1) / 2;
	}
	
	private int left(int i) {
		return 2*i + 1;
	}
	
	private int right(int i) {
		return 2*i + 2;
	}	
	
	
	// Constructor
	public HeapPriorityQueue() {
		items = new ArrayList<Entry>();
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	
	public void insert(int priority, E value) {
		// Create an Entry object
		Entry item = new Entry(priority, value);
		
		// Place the item in the last position
		items.add(item);
		
		// Initialize a "current" index matching the position we just inserted
		int current = items.size() - 1;
		
		// Swap items upward as needed ("bubble up" the new item)
		// TO DO:
		// Implement this set of steps
		
		
	}
	
	public E removeMin() {
		// Edge case: Empty heap!
		if (isEmpty())
			return null;
		
		// Save the value we need to return
		// ** By definition, this is the value in the root item
		E result = items.get(0).value;
		
		// Save the value we now need to place (the last item),
		//  and remove the last position from the array list.
		Entry moved = items.remove(items.size() - 1);
		
		// Initialize a "current" index matching the "bubble" position
		int current = 0;
		
		// Copy items and move current downward as needed,
		//  then copy moved into the final position
		// TO DO:
		// Implement this set of steps
		
		
		return result; 
	}

}


