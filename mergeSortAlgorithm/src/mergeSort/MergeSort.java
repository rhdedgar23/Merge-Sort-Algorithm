package mergeSort;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		
		//Initialization of random number array
		Random random= new Random();
		int[] numbers= new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= random.nextInt(1000000);
		}
		
		//We print the random number array before it's sorted
		System.out.println("Before:");
		printArray(numbers);
		
		//We sort the random number array
		mergeSort(numbers);
		
		//We print the random number array after it's sorted
		System.out.println("\nAfter:");
		printArray(numbers);
	}
	
	

}
