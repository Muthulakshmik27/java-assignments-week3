package week3.day1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr={14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> asList= Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		Collections.sort(asList);
		System.out.println("Sorted"+asList);
		for(int i=0;i<asList.size()-1;i++)
		{
			if(asList.get(i)==asList.get(i+1))
			{
				System.out.println("Duplicate Numbers"+asList.get(i));
			}
		}
		
	}

}
