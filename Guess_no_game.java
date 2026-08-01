import java.util.Scanner;
import java.util.Random;

class Game {
    private int number;
    private int inputNumber;
    private int noOfGuesses = 0;

    Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1; // Random number between 1 and 100
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void takeUserInput(Scanner sc) {
        System.out.print("Guess the number (1-100): ");
        inputNumber = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;

        if (inputNumber == number) {
            System.out.println("Yes! You guessed the right number.");
            System.out.println("The number was: " + number);
            System.out.println("You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        boolean correct = false;

        while (!correct) {
            game.takeUserInput(sc);
            correct = game.isCorrectNumber();
        }

        sc.close();
    }
}
