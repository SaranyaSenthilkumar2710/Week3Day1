package week3.Day1.Assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) { 
		//Given Input String
		String str = "changeme";  
		String output = "";
		
		//Converting string to char array
		char[] chArray = str.toCharArray();
		
		//Looping thru array
		for(int i=0;i<chArray.length;i++) {
			//taking odd position char by using mod operator
			if(i%2==0){
				//convert odd position char to uppercase
				output+=Character.toUpperCase(str.charAt(i));
			}
			else{
				output+=str.charAt(i);
			}
		}
		System.out.println("Given String :: "+str);
		System.out.println("Converted string :"+output);
	}	
}
