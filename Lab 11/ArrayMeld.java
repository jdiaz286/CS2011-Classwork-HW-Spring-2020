/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: This problem is a bit similar to Zipper from LAB 10 in that I 
give you some starter code, and you have a to write a method that takes two arrays 
and combines them into one array. But  this one is harder.
*/
import java.util.Random;
import java.util.Arrays;

public class ArrayMeld{


	/**
	 * TO DO for LAB 11
	 *
	 * Returns an array which contains contents
	 * of sorted arrays a and b, such that the result
	 * is also sorted.
	 * 
	 * For example, if a is [1, 3, 8] and b is [2, 4]
	 * the returned array is [1, 2, 3, 4, 8]
	 *
	 */
	public static int[] meld(int[] a, int[] b) {
		
        // Your solution goes here
        int[] meldedArray=new int[a.length+b.length];
        //all variables that control the indexes of a,b, and melded array
        int indexOfA=0;
        int indexOfB=0;
        int meldIndex=0;
        //for loop to get the lowest value in each array
        while(indexOfA<a.length && indexOfB<b.length){
            //done when the index of a is greater than b
            if(a[indexOfA] <= b[indexOfB]){
                meldedArray[meldIndex]=a[indexOfA];
                indexOfA++;
                meldIndex++;
            }
            //done when the index of b is greater than a
            else{
                meldedArray[meldIndex]=b[indexOfB];
                indexOfB++;
                meldIndex++;
			}
			
		}

		// Store remaining elements of first array 
        while (indexOfA < a.length) {
			meldedArray[meldIndex]=a[indexOfA];
			indexOfA++;
			meldIndex++; 
		}
      
        // Store remaining elements of second array 
        while (indexOfB < b.length) {
			meldedArray[meldIndex]=b[indexOfB];
            indexOfB++;
            meldIndex++;
		}
		return meldedArray;  // change this!
	}


	public static void main(String[] args) {

		// Generate two arrays with at most 7 ints
		int[] arr1 = nextArray(7);
		int[] arr2 = nextArray(7);
		
		// Fill out the arrays with values [0, 9]
		populateArray(arr1, 9);
		populateArray(arr2, 9);
		
		// Sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// Print them out:
		System.out.print("arr1 is ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("arr2 is ");
		System.out.println(Arrays.toString(arr2));

		// Merge the arrays:
		int[] arr3 = meld(arr1, arr2);

		//Print out the result:
		System.out.print("arr3 is ");
		System.out.println(Arrays.toString(arr3));
	}

	/**
	 * Creates and returns an empty array for
	 * at most maxLength ints. 
	 */
	public static int[] nextArray(int maxLength) {
		Random r = new Random();
		int length = r.nextInt(maxLength + 1);
		return new int[length];
	}

	/**
	 * Populates array with int values in
	 * [0, maxValue] range. 
	 */
	public static void populateArray(int[] array,
		                             int maxValue) {
		Random r = new Random();
		for (int i = 0; i < array.length;  i++)
			array[i] = r.nextInt(maxValue + 1);
	}
}