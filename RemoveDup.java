package week3.day1;

public class RemoveDup {
 public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
	int count=1;
	String[] str=text.split(" ");
	for(int i=0;i<str.length;i++)
	{
		for(int j=0;j<str.length;j++)
		{
			if(str[i].equals(str[j])){
				count++;
				
				
			}
		}
		if(count>1) {
			System.out.print(str[i].replace("java"," "));
	}
	
}
 }
}
