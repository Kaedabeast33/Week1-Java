
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void guessingGame() throws InterruptedException {
        boolean correctGuess = false;
        Random rand = new Random();
        Scanner input =new Scanner(System.in);
        int increment = 0;

        System.out.println("Hello user, let's play a game while we collect the samples... what should your username be?");
        String name = input.nextLine();

        System.out.println("Welcome "+ name + ", I'm thinking of a numer between 1 and 100.");

        System.out.println("Try to guess my number.");

        int number = rand.nextInt(100);
//        System.out.println(number);
        while(!correctGuess){
            int guess = 0;


            try{
                guess = input.nextInt();
            }catch (Exception e){
                String badInput = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }
            increment++;
            if (guess> 100 || guess<1){
                System.out.println("You're guess is out of range. Please try again.");
            }else if (guess>number){
                System.out.println("You're guess is too high.");
            }else if (guess<number){
                System.out.println("You're guess is too low");
            }else if(guess == number){
                System.out.println("Well done, " + name + "! You found my number in " + increment +" tries!");
                correctGuess = true;
            }


            Thread.sleep(3000);
        }
    }
}

