package NewExercise;

public class Nexercise5 {
	public static void main(String[] args) {
		getRandom(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
	}
	
	public static int getRandom(int...numbers) {
		
		int entry;
		while (true) {
			entry = (int)(Math.random() * 54);
			boolean count = true ;
			for (int i = 0 ; i < numbers.length ; i++) {
				if (entry == numbers[i]) {
					count = false;
					System.out.println("did run");
				}
			  }
			if (count == true) {
				System.out.print(entry);
			    return entry;
			}
		}
	}
}
