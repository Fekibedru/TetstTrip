
public class PrintString {
static int number = 0;

public static void main(String[] args) {
	int number = 2;
	String[] some_strings = {"X", "Y", "Z" };
	number = number - 1;
	some_strings[number] = some_strings[number];
	for(int i = 0; i < some_strings.length; i++) 
		// sees the static variable declared in PrintString class
		System.out.println(some_strings[PrintString.number]);
	//index 2 - index 1 print index 1
	System.out.println(some_strings[number]);
		
	
}
}