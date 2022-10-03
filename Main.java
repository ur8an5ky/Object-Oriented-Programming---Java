import java.util.Scanner;
import java.util.Random;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int result = rand.nextInt(11);
        do {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            if (guess > 10 || guess < 0)
            {
                System.out.println("Guess out of range!! Remember, your guess must be between 0 and 10!");
            }
            else if (guess == result)
            {
                System.out.println("YESSS! You're right! The number you were looking for was: " + result);
            }
            else if (guess != result)
            {
                if (guess > result)
                {
                    System.out.println("Number you're looking for is smaller!");
                }
                else if (guess < result)
                {
                    System.out.println("Number you're looking for is bigger!");
                }
                System.out.println("Try again!");
            }
        } while (guess != result);
    }    
}
