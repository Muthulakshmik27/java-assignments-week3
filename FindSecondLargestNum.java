package week3.day1;


import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class FindSecondLargestNum {
	public static void main(String[] args) {
		int[] data={3,2,11,4,6,7};
		List<Integer> asList= Arrays.asList(3,2,11,4,6,7);
		System.out.println("Converted to List"+asList);
		Collections.sort(asList);
		System.out.println("Ascending Order"+asList);
		System.out.println("Second Largest Number"+asList.get(asList.size()-2));
		
	}

}
