package NewExercise;

import java.util.Scanner;

public class Nexercise4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers: ");
	    String holder = input.nextLine();
	   
	    int count = 0; 
	    for (String item : holder.split(" ")) 
	    	count++ ;
	    
	    double[] numbers = new double[count]; 
	    int index = 0 ;
	    for (String item : holder.split(" ")) 
	    	numbers[index++] = Double.parseDouble(item) ;
	    
	    average(numbers);
	    min(numbers);
	}
	
	public static double average(int[] array) {
		int add = 0;
		for (int i = 0; i < array.length; i++)
			add = add + array[i];
		System.out.println("The average is: " +(double)add/array.length);
		return add/array.length ;
	}
	
	public static double average(double[] array) {
		double add = 0;
		for (int i = 0; i < array.length; i++)
			add = add + array[i];
		System.out.println("The average is: " + (double)add/array.length);
		return add/array.length ;
	}
	
	public static double min(double[] array) {
		double holder = array[0] ;
		for (int i = 0 ; i < array.length ; i++) {
			if (holder > array[i])
				holder = array[i];
		}
		
		System.out.println("The minimum value: "+holder);
		
		return 0.0 ;
	}
	
}
