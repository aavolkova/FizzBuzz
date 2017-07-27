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
		
		/*
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
		*/
		
		// Modification 1:  add: 2 - Copy, 10 - CAT
		/*
		for (int counter = 1; counter <= 100; counter++)
		{
			if(counter % 2 == 0 )
				System.out.print("Copy");  // Print number which is multiples of two 
			
			if(counter % 10 == 0 )
				System.out.print("Cat");  // Print number which is multiples of ten
			
			if (counter % 3 == 0)
				System.out.print("Fizz");      // Print number which is multiples of three
			
			if (counter % 5 == 0)
				System.out.print("Buzz");      // Print number which is multiples of five
			
			if(counter % 2 != 0 && counter % 10 != 0 && counter % 3 != 0 && counter % 5 != 0)
				System.out.print(counter);     // Print number which is not multiples of two, three, five, or ten)
			
			System.out.println();
			
		}
		*/
		
		
		// Modification 2:  use Integer.toString(counter) instead System.out.print(counter)
		for (int counter = 1; counter <= 100; counter++)
		{
			if(counter % 2 == 0 )
				System.out.print("Copy");  		// Print Copy if number multiples of two 
			
			if(counter % 10 == 0 )
				System.out.print("Cat");  		// Print Cat if number multiples of ten
			
			if (counter % 3 == 0)
				System.out.print("Fizz");       // Print Fizz if number multiples of three
			
			if (counter % 5 == 0)
				System.out.print("Buzz");       // Print Buzz if number multiples of five
			
			if(counter % 2 != 0 && counter % 10 != 0 && counter % 3 != 0 && counter % 5 != 0)
				System.out.print(Integer.toString(counter));     // Print number which is not multiples of two, three, five, or ten)
			
			System.out.println();
		}
	}

}
