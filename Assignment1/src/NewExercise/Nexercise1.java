package NewExercise;

import java.util.*;
public class Nexercise1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Number of student here: ");
	    int holder = input.nextInt();
	    int[] numbers = new int[holder];
	    int[] copy = new int[holder];
        for (int i = 0; i < holder ; i++) {
        numbers[i] = input.nextInt(); 
        copy[i] = numbers[i]; }
        
        Arrays.sort(copy);
        int max = copy[holder-1]; 
     
        for (int i = 0; i < numbers.length-1; i++) {
        	
        	int val = numbers[i] ;
        	
        	if (val >= max - 10)
        		System.out.println("Student " + i + "score is " + numbers[i] + " and grade is A");
        	if (val >= max - 20)
        		System.out.println("Student " + i + "score is " + numbers[i] + " and grade is B");
        	if (val >= max - 30)
        		System.out.println("Student " + i + "score is " + numbers[i] + " and grade is C");
        	if (val >= max - 40)
        		System.out.println("Student " + i + "score is " + numbers[i] + " and grade is D");
        	if (val < max-40)
        		System.out.println("Student " + i + "score is " + numbers[i] + " and grade is F");
        }
        
        input.close(); 
        

       
	}
	

      
}
