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
	
	private static void printArray(int [] numbers) {
		for(int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	private static void mergeSort(int [] inputArray) {
		
		int inputLength= inputArray.length;
		//First, we check the input array length.
		//If the array is of length 0 or 1, we have come across an already sorted array. 
		//Therefore we just return. 
		if(inputLength< 2) {
			return;
		}
		
		//Else, just continue dividing the array. 
		//Less memory and time used if we organize it this way. 
		int midIndex= inputLength / 2;
		int [] leftArray= new int[midIndex];
		int [] rightArray= new int[inputLength - midIndex];//for odd number arrays
		
		//We copy the elements of the original input array into the new left and right arrays. 
		for(int i= 0; i< midIndex; i++) {
			leftArray[i]= inputArray[i];
		}
		
		for(int i= midIndex; i< inputLength; i++) {
			leftArray[i]= inputArray[i];
		}
	}
	
	

}
