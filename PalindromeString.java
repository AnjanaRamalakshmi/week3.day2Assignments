package week3.day2.Assignment;

public class PalindromeString {

	public static void main(String[] args)
	{
		String str = "madam";
		String revStr ="";
		int strLength = str.length();
		for(int i =(strLength - 1); i >= 0;--i)
		{
			revStr = revStr + str.charAt(i);
			
		}
		if(str.toLowerCase().equals(revStr.toLowerCase()))
		{
			System.out.println(str + " is a palindrome string");
		}
		else
		{
			System.out.println(str + "is not palindrome string");
		}
	}

}
