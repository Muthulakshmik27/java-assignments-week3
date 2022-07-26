package week3.day1;

import java.util.Arrays;

public class Anagram {
	  public static void main(String[] args) {
		String str="stops";
		String str1="potss";
		int length=str.length();
		int length1=str1.length();
		
		if(length==length1)
		{
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			System.out.println(ch);
			
			char[] ch1=str1.toCharArray();
			Arrays.sort(ch1);
			System.out.println(ch1);
			
			if(Arrays.equals(ch,ch1))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
			
			
		}
	}

}
