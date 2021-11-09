import java.util.Scanner;
import java.util.TreeMap;

public class Day20 {
	
	public static void mapExample() {
		Scanner scanner = new Scanner(System.in);
		
		// Create the map
		TreeMap<String, Double> menuMap = new TreeMap<String, Double>();
		
		// Add some entries
		menuMap.put("coffee", 1.75);
		menuMap.put("tea", 1.25);
		menuMap.put("boba", 3.50);
		menuMap.put("juice", 6.75);
		menuMap.put("popcorn", 3.25);
		menuMap.put("cupcake", 5.00);
		
		// Show the user all the entries
		for (String k : menuMap.keySet()) {
			System.out.printf("$%.2f   %s\n", menuMap.get(k), k);
		}
		
		double total = 0;
		while (true) {
			System.out.print("Pick a menu item (blank to stop): ");
			String choice = scanner.nextLine();
			if (choice.isEmpty())
				break;
			
			if (menuMap.containsKey(choice)) {
				double price = menuMap.get(choice);
				System.out.println("Ok, adding that to your order.");
				total += price;
				System.out.printf("You current total: $%.2f\n", total);
			} else {
				System.out.println("We don't have any " + choice + "!!");
			}
		}
		
		System.out.println("Have a nice day!");
	}
	
	public static void hashExample() {
		final int TABLE_SIZE = 7;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Type anything: ");
			String userText = scanner.nextLine();
			int bucketNumber = Math.abs(userText.hashCode()) % TABLE_SIZE;
			System.out.println("That goes in bucket #" + bucketNumber);
		}
	}
		
	

	public static void main(String[] args) {
		// mapExample();
		hashExample();

	}

}
