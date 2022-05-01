package task3;
import java.util.Scanner;

public class ArrayStats {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int numbers = scan.nextInt();
		float[] array = new float[numbers];
		
		for(int i=0; i<numbers; i++) {
			System.out.println("Please give a double: ");
			array[i] = scan.nextFloat();
			System.out.println();
		}
		analyze(array);
		
		
		/*
		for(float i: array) {
			System.out.println(i);
		}
		*/
	}
	
	public static void analyze(float[] array) { 
		float[] array2 = new float[array.length];
		int maxIndex = 0;
		int minIndex = 0;
		float average = 0;
		float min;
		
		for(int i=0; i<array.length; i++) { //copy the input array 
			array2[i] = array[i];
		}
		
		for(int i=0; i<array.length-1; i++) { //Selection Sort
			for(int j = i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
		}
		
		for(int i=0; i<array2.length; i++) { //search max/min index through comparing copied array 
			if(array2[i] == array[0]) {
				minIndex = i;
			}
			if(array2[i] == array[array.length-1]) {
				maxIndex = i;
			}
			average += array2[i];
		}
		
		average /= array.length;

		System.out.println("Min: " + array[0] + " at index " + minIndex );
		System.out.println("Max: " + array[array.length-1] + " at index " + maxIndex );
		System.out.println("Average: " + average);
		
	}

}
