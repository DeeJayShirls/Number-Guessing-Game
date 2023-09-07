import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guess;
        int tryValue = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

            int randomNumber = random.nextInt(100) + 1;
          System.out.println("Random Number is: " + randomNumber);

        while (true) {
            System.out.println("Enter your number (1-100): ");
            guess = scanner.nextInt();

            tryValue++;

            if (guess == randomNumber) {
                System.out.println("Hurray!! You Got it!!");
                System.out.println("It took you only "+ tryValue + " try (ies) :)");

            } else if (guess > randomNumber) {
                System.out.println("No. The number is Lower! Try Again!");

            } else {
                System.out.println("No. The number is Higher! Try Again!");
                scanner.close();
            }
            
        }
        
    }
}