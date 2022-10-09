package addressBookMain;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

import java.util.stream.Collectors;
public class Address_Book {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice: ");
		System.out.println(
				"1-Add\n2-Display\n3-Edit\n4-Delete\n5-Count Person By City\n6-Count Person By State\n7-Sorted By Name\n8-Exit");
				"1-Add\n2-Display\n3-Edit\n4-Delete\n5-Count Person By City\n6-Count Person By State\na-Sort By Name\nb-Sort By City\nc-Sort By State\nd-Sort By Zip\n7-Exit");
		char input = sc.nextLine().charAt(0);
		switch (input) {
		case '1':-54,11 +54,20 @@ public static void main(String[] args) {
			String state = sc.nextLine();
			ab.searchByCity(state);
			break;
		case '7':
		case 'a':
			ab.sortByFirstName();
			break;
		case 'b':
			ab.sortByCity();
			break;
		case 'c':
			ab.sortByState();
			break;
		case 'd':
			ab.sortByZip();
			break;

		case '8':
		case '7':
			System.exit(0);
		}

@@ -264,4 +273,29 @@ void sortByFirstName() {
	persons.stream().sorted((p1, p2) -> p1.FirstName.compareTo(p2.FirstName)).forEach(y -> y.display());
}

// Sort Contacts In AddressBook By City Using collection
void sortByCity() {
	System.out.println("Sorted Contacts In Address Book By City");
	List<PersonInfo> SortByCity = persons.stream().sorted((p1, p2) -> p1.City.compareTo(p2.City))
			.collect(Collectors.toList());
	SortByCity.forEach(y -> y.display());
}

// Sort Contacts In AddressBook By State Using collection
void sortByState() {
	System.out.println("Sorted Contacts In Address Book By State");
	List<PersonInfo> SortByState = persons.stream().sorted((p1, p2) -> p1.State.compareTo(p2.State))
			.collect(Collectors.toList());
	SortByState.forEach(y -> y.display());
}

// Sort Contacts In AddressBook By ZipCode Using collection
void sortByZip() {
	System.out.println("Sorted Contacts In Address Book By Zip");
	List<PersonInfo> SortByState = persons.stream()

			.sorted((p1, p2) -> Long.valueOf(p1.Zip).compareTo(Long.valueOf(p2.Zip))).collect(Collectors.toList());
	SortByState.forEach(y -> y.display());
}

}
}
