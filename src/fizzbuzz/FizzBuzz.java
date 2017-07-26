package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		/**
		 * This program prints the numbers from 1 to 100. 
		 * But for multiples of three print “Fizz” instead of the number 
		 * and for the multiples of five print “Buzz”. 
		 * For numbers which are multiples of both three and five print “FizzBuzz”.
		 * 
		 * @author Anna Volkova
		 */
		
		
		for (int counter = 1; counter <= 100; counter++)
		{
			if(counter % 3 == 0 && counter % 5 == 0)
				System.out.println("FizzBuzz");  // Print number which is multiples of both three and five 
			else if (counter % 3 == 0)
				System.out.println("Fizz");      // Print number which is multiples of three
			else if(counter % 5 == 0)
				System.out.println("Buzz");      // Print number which is multiples of five
			else
				System.out.println(counter);     // Print number which is not multiples of three, or five, or both three and five
		}
		

	}

}
