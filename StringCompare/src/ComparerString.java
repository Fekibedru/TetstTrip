import java.util.ArrayList;

public class ComparerString {

	public ArrayList<String> smallStrings(String[] toFilter, String comparer) {
		//create ArrayList Object
		ArrayList<String> filteredStringList = new ArrayList<String>();
//read the list and compare 
		for (int i = 0; i < toFilter.length; i++) {
			if (toFilter[i].compareTo(comparer) < 0) {
				filteredStringList.add(toFilter[i]);
			}
		}

		return filteredStringList;
	}

	public static void main(String[] args) {
		ComparerString string = new ComparerString();
		String[] unfiltered = { "Niklas", "Oskar", "Lena", "Lukas", "Jems",
				"Markos", "Cecilia", "Stephen", "Peter" };
	
		for (String name : string.smallStrings(unfiltered, "Lennart")) {
			System.out.println(" - " + name);
		}
	}
}
