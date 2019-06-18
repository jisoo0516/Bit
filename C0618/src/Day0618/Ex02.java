package Day0618;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex02 {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		
		numbers[0]=0;
		numbers[1]=5;
		numbers[2]=1;
		numbers[3]=2;
		numbers[4]=4;
		numbers[5]=2;
		
		ArrayList<Integer> numberArrayList = new ArrayList<>();
		for(int i : numbers) {
			numberArrayList.add(i);
		}
		
		
		
		for(int i =0; i<numbers.length-1; i++) {
			if(numbers[i] > numbers[i+1]) {
				int temp = numbers[i];
				numbers[i] =numbers[i+1];
				numbers[i+1] =temp;
				i=-1;//******
				
			}
		}

		

		
		
		
		
	}
}