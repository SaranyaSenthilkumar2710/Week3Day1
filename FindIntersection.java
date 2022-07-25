package week3.Day1.Assignments;

public class FindIntersection {
	public static void main(String[] args) {
		//Declaring first array
		int[] array1={3,2,11,4,6,7};
		//Declaring second array
		int[] array2={1,2,8,4,9,7};
		//Iterating first array and print it
		System.out.print("\nFirst array Elements : \n");
		for(int i=0;i<array1.length-1;i++)
        {
			System.out.print(array1[i]+" ");
        }
		//Iterating second array and print it
		System.out.print("\nSecond array Elements : \n");
		for(int j=0;j<array2.length-1;j++)
        {
			System.out.print(array2[j]+" ");
        }
		System.out.println("\nIntersection Elements :");
		//Iterating both the arrays
		 for(int i=0;i<array1.length-1;i++)
	        {
			 for(int j=0;j<array2.length-1;j++)
		        {
				 //checking elements of each array
				 if(array1[i]==array2[j]) {
					 //Printing the Intersected or same element
					 System.out.println(array1[i]);
				 }
		        }
	        }
	}
}
