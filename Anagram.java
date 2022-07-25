package week3.Day1.Assignments;

public class Anagram {
	public static void main(String[] args)

	{
		String s1 = "silent";
		System.out.println("First String : " + s1);
		String s2 = "listen";
		System.out.println("Second String : " + s2);
		boolean flag = false;

		// check whether length of the given strings are equal or not
		if (s1.length() != s2.length())
			flag = false;
		else {
			// Remove all the white space
			s1 = s1.replaceAll("\\s", "");
			s2 = s2.replaceAll("\\s", "");

			// Convert both Strings into lower case and put into Char Array
			char[] array1 = s1.toLowerCase().toCharArray();
			char[] array2 = s2.toLowerCase().toCharArray();

			// Iterating thru the array and checking both are equal
			for (int i = 0; i < array1.length; i++) {
				for (int j = i + 1; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						flag = true;
					}
				}
			}

		}

		if (flag)
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
	}
}
