import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n------ Rock Paper Scissors Game -------\n");

        int computerScore = 0;
        int userScore = 0;
        int computerChoice;
        int userChoice;

        System.out.print("How many attempts do you want?  >> ");
        int times = input.nextInt();

        String[] game = {"Rock", "Paper", "Scissors"};

        while(times-- > 0) {
            
            System.out.println("\n\t1 for Rock\n\t2 for Paper\n\t3 for Scissors");
            System.out.print("\n\tEnter your move(1-3): ");
            userChoice = input.nextInt();
            computerChoice = rand.nextInt(3) + 1;

            System.out.println("\n\tYou choose " + game[userChoice - 1] + " & Computer Choose " + game[computerChoice - 1]);
            
            if(userChoice == 1 && computerChoice == 2) {
                System.out.println("\tComputer Win! :)");
                computerScore += 10;
            } else if(userChoice == 1 && computerChoice == 3) {
                System.out.println("\tYou Win! :)");
                userScore += 10;
            } else if(userChoice == 2 && computerChoice == 1) {
                System.out.println("\tYou Win! :)");
                userScore += 10;
            } else if(userChoice == 2 && computerChoice == 3) {
                System.out.println("\tYou Win! :)");
                userScore += 10;
            } else if(userChoice == 3 && computerChoice == 1) {
                System.out.println("\tComputer Win! :)");
                computerScore += 10;
            } else if(userChoice == 3 && computerChoice == 2) {
                System.out.println("\tYou Win! :)");
                userScore += 10;
            } else {
                System.out.println("\tMatch Tie!");
            }
        }

        if(userScore > computerScore) {
            System.out.println("\n\tAhh! Amazing you won! and your score is: " + userScore);
        } else if(userScore == computerScore) {
            System.out.println("\n\tOooh! Both's Score are same. Match Tie!");
        } else {
            System.out.println("\n\tOouch! You loose! and Computer score is: " + computerScore);
        }

        System.out.println("\nThank you for playing Rock, Paper & Scissors Game\n");
    }
}