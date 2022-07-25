package week3.Day1.Assignments;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//Input String
		String sentence = "We learn java basics as part of java sessions in java week1";
		String result = "";
		String wordsArray[];
		// Split the given sentence to get each word as String array
		wordsArray = sentence.split(" ");
		// Use for loop to remove duplicate words
		for(int i=0; i<wordsArray.length; i++) {
			for(int j=i+1; j<wordsArray.length; j++) {
				if(wordsArray[i].equals(wordsArray[j])) {
					//if same word occurs replace the word with temp word "remove"
					wordsArray[j] = "remove";
				}
			}
		}
		// Forming the String by removing the temp word
		for(int i=0; i<wordsArray.length; i++) {
			if(wordsArray[i] != "remove") {
				result = result + wordsArray[i] + " ";
			}
		}
		// Display given String after removing duplicates
		System.out.println("\nSentence after removing duplicate words: \n" + result);

	}

}
