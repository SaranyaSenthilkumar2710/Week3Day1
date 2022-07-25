package week3.Day1.Assignments;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";  
		String output = "";

		//Converting string to char array
		char[] chArray = str.toCharArray();
		//Looping thru array in reverse order
		for(int i=chArray.length-1;i>=0;i--) {
			//append each char to another string in reverse order
			output+=str.charAt(i);
		}
		System.out.println("Given String : "+str);
		//checking the string and the reversed string are equal and print result accordingly
		if(str.equalsIgnoreCase(output)) {
			System.out.println("Given String is Palindrome!!");
		}else {
			System.out.println("Given String is not Palindrome!!");
		}


	}

}
