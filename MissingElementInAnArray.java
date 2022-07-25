package week3.Day1.Assignments;

import java.util.Arrays;


public class MissingElementInAnArray {

	public static void main(String[] args) {
		//Given Input String
		int[] array1={1,2,4,6,8,9};

		// Print the elements 
		System.out.print("\nGiven array Elements : \n");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}

		//Sort the given array
		Arrays.sort(array1);

		//Initialize array2 to store the missing elements
		int[] array2 = new int[array1[array1.length - 1] + 1];

		// Make array2[i]=1 if i is present in the array
		for(int i = 0; i < array1.length; i++)
		{

			// If the element is present
			// make array2[array1[i]]=1
			array2[array1[i]] = 1;
		}
		System.out.println("\nThe missing element is:" );
		// Print the indices where array2[i]=0
		for(int i = array1[0]; i <= array1[array1.length - 1]; i++)
		{
			if (array2[i] == 0)
			{
				System.out.print(i + " ");
			}
		}

	}

}