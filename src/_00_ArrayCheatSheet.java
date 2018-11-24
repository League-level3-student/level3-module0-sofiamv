package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] Colors = { "red", "orange", "yellow", "green", "blue" };
		// 2. print the third element in the array
		System.out.println(Colors[2]);
		// 3. set the third element to a different value
		Colors[2] = "brown";
		// 4. print the third element again
		System.out.println(Colors[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < Colors.length; i++) {
			Colors[i] = "rainbows";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < Colors.length; i++) {
			System.out.println(Colors[i]);
		}
		// 7. make an array of 50 integers
		int[] nums = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < Colors.length; i++) {
			Random a = new Random();
			nums[i] = a.nextInt(51);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int tinynum = 51;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < tinynum) {
				tinynum = nums[i];
			}
		}
		System.out.println("the small number is " + tinynum);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// 11. print the largest number in the array.
		int largenum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largenum) {
				tinynum = nums[i];
			}
		}
		System.out.println("the large num is " + largenum);
		// 12. print only the last element in the array
		System.out.println("the last int is " + nums[49]);

	}
}
