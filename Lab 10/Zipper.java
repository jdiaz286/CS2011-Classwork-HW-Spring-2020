/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: For this problem, you have some starter code. Save it and run it a 
few times -- you will see that it generates two arrays of equal lengths populated 
with random values in range [0,9]. Your task is to complete the zip() method, which 
takes two equal length arrays and "zips" them. See sample runs below and comments 
in the starter code for further description of what that means.
*/
import java.util.Random;
import java.util.Arrays;

public class Zipper{


	/**
	 * TO DO for LAB 10
	 *
	 * Returns an array which contains "zipped"
	 * contents of arrays a and b.
	 * 
	 * For example, if a is [1, 2] and b is [33, 44]
	 * the returned array is [1, 33, 2, 44]
	 *
	 * (The elements of a are at even indices and 
	 * the elements of b are at odd indices.)
	 */
	public static int[] zip(int[] a, int[] b) {
		// TO DO for LAB 10
        int[] zipped=new int[((a.length)*2)];
		int indexCounter=0;
		int twoTimeUsage=0;
        for(int j=0; j<zipped.length;j++){
			if(j==0){
				zipped[j]=a[indexCounter];
				twoTimeUsage++;
				if(twoTimeUsage==2){
					twoTimeUsage=0;
					indexCounter++;
				}
				continue;
			}
			else if(j%2==0){
				zipped[j]=a[indexCounter];
				twoTimeUsage++;
				if(twoTimeUsage==2){
					twoTimeUsage=0;
					indexCounter++;
				}
				continue;
			}
            else if(j%2!=0){
				zipped[j]=b[indexCounter];
				twoTimeUsage++;
				if(twoTimeUsage==2){
					twoTimeUsage=0;
					indexCounter++;
				}
				continue;
			}
			
        }
		return zipped; // Change this!
	}


	public static void main(String[] args) {

		// Generate an array for at most 5 ints
		int[] arr1 = nextArray(5);
		// Fill out the array with values [0, 9]
		populateArray(arr1, 9);
		System.out.print("arr1 is ");
		System.out.println(Arrays.toString(arr1));

		// Generate an array exactly the same lenght
		// as the one created above
		int[] arr2 = new int[arr1.length];
		populateArray(arr2, 9);
		System.out.print("arr2 is ");
		System.out.println(Arrays.toString(arr2));

		int[] arr3 = zip(arr1, arr2);
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