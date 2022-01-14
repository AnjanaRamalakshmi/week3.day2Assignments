package week3.day2.Assignment;

public class CharOccurence {

	public static void main(String[] args) 
	{
		String str = "welcome to chennai";
		

		// declare and initialize a variable count to store the number of occurrences
		int count=0;

		// convert the string into char array
			char[]cs=str.toCharArray();
		//get the length of the array
			int length=cs.length;
			
		// traverse from 0 till the array length 
			for (int j = 0; j < length; j++) {
										
			// check if the current character is e 
				// if it is increment the count
				if(cs[j]=='e')
				{
					//System.out.println("pre increment"+count);
					count++;
					//System.out.println("post increment"+count);
				
			// print the count out of the loop
				
			}
}
			System.out.println(count);
			
}
	}


