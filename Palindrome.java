package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		String str="madam";
		String str1="";
		char[] charArray=str.toCharArray();

		for(int i=charArray.length-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
				if(str.toLowerCase().equals(str1.toLowerCase()))
				{
					System.out.println("palindrome");
				}
				else
				{
					System.out.println("not palindrome");
				}
			}

		
		
	}


