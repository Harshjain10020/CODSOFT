import java.util.Scanner;
import java.util.Random;

public class GuessNum {
    public static void main(String[] args) {
        Random rndm = new Random();
        int rndmNum = rndm.nextInt(100) + 1; 

        Scanner scanner = new Scanner(System.in);
        int userinput;

        System.out.println("Guess the num (btw 1 and 100):");

        do {
            userinput = scanner.nextInt();

            if (userinput < rndmNum) {
                System.out.println("Too low! Try again.");
            } else if (userinput > rndmNum) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congrats! U guessed the correct num, " + rndmNum + ".");
            }
        } while (userinput != rndmNum);

        scanner.close();
    }
}
