package NewExercise;

import java.util.Scanner;

public class Nexercise2 {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the integers between 1 to 100: ");
    String holder = input.nextLine();
   
    int count = 0; 
    for (String item : holder.split(" ")) 
    	count++ ;
    
    int[] numbers = new int[count]; 
    int index = 0 ;
    for (String item : holder.split(" ")) 
    	numbers[index++] = Integer.parseInt(item) ;
    
    
    
    for (int i = 0; i < 100 ; i++) {
    	
    	int times = 0 ; 
    	for (int j = 0; j < numbers.length; j++) {
    		
    		if ( i == numbers[j])
    			times++; }
    	
    	if (times > 0)
			System.out.println(i + " occurs " + times); }
    			
    }
    		
}
