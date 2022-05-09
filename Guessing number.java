import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random() * 100);
        int guess = 0, counter = 0;
        System.out.println("Guess a number between 0 - 100: ");
        while(guess!=num)
        {
            counter ++;
        System.out.print("Enter your guess: ");
        guess = input.nextInt();
            if(guess==num)
            {
                System.out.println("Correct! The number is " + num);
            }else if(guess<num)
            {
                System.out.println("Guess is too low");
            }else
            {
                System.out.println("Guess is too high");
            }
            
        }
        
        System.out.println("You guessed it in " + counter + " tries");

	}
}