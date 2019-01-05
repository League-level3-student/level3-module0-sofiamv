package _03_More_Array_Fun;

import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[]bestbagelsandwich = {"bacon", "cream cheese", "lettuce", "tomato", "egg"};
		bah(bestbagelsandwich);
System.out.println(" ");		
		baah(bestbagelsandwich);
		System.out.println(" ");
		baaah(bestbagelsandwich);
		System.out.println(" ");
		baaaah(bestbagelsandwich);
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	}
	public static void bah(String[] strings){
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
		public static void baah(String[] strings1){
		    int yeet = strings1.length-1;		
			for(int i = yeet; i >= 0; i--) {
				System.out.println(strings1[i]);
			}
		}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void baaah(String[] string) {
		for(int i = 0; i < string.length; i+=2) {
			System.out.println(string[i]);
		}
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static Random rra = new Random();
	public static void baaaah(String[] stri) {
		for(int i = 0; i < stri.length; i++) {
			System.out.println(stri[rra.nextInt(stri.length)]);
		}
	}
	}	

