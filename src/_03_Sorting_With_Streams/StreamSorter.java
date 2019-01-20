package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		
		//1. Convert the Integer array to Stream object.
		Stream<Integer> ia = Stream.of(nums);
	
		
		//2. Use the sorted method of the stream to sort the numbers.
		ia =ia.sorted((a,b)-> a>b ? -1: a==b ? 0: 1);
		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		ia.forEach((e)->System.out.println(e));
	}
}
