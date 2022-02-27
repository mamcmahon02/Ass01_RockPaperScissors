import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String PlayerA;
        String PlayerB;
        boolean Continue = true;
        while (Continue = true) {
            System.out.println("Player 1 input Rock, Paper, or Scissors:");
            Scanner input1 = new Scanner(System.in);
            PlayerA = input1.nextLine();
            if (PlayerA.equalsIgnoreCase("Rock") || PlayerA.equalsIgnoreCase("Paper") || PlayerA.equalsIgnoreCase("Scissors")) {
                System.out.println("Player 1 has chosen " + PlayerA);
            } else {
                System.out.println("Invalid Input! ");
                System.exit(0);
            }
            System.out.println("Player 2 input Rock, Paper, or Scissors:");
            Scanner input2 = new Scanner(System.in);
            PlayerB = input2.nextLine();
            if (PlayerB.equalsIgnoreCase("Rock") || PlayerB.equalsIgnoreCase("Paper") || PlayerB.equalsIgnoreCase("Scissors")) {
                System.out.println("Player 2 has chosen " + PlayerB);
            } else {
                System.out.println("Invalid Input! ");
                System.exit(0);
            }
            if (PlayerA.equalsIgnoreCase("Rock")) {
                if (PlayerB.equalsIgnoreCase("Paper")) {
                    System.out.println("Paper Beats Rock, Player 2 wins!");

                }
                if (PlayerB.equalsIgnoreCase("Rock")) {
                    System.out.println("Its a tie!");

                }
                if (PlayerB.equalsIgnoreCase("Scissors")) {
                    System.out.println("Rock Beats Scissors, Player 1 wins!");
                }
            }
            if (PlayerA.equalsIgnoreCase("Paper")) {
                if (PlayerB.equalsIgnoreCase("Paper")) {
                    System.out.println("Its a tie!");

                }
                if (PlayerB.equalsIgnoreCase("Rock")) {
                    System.out.println("Paper beats Rock, PLayer 1 wins!");

                }
                if (PlayerB.equalsIgnoreCase("Scissors")) {
                    System.out.println("Scissors beats paper, Player 2 wins!");
                }

            }
            if (PlayerA.equalsIgnoreCase("Scissors")) {
                if (PlayerB.equalsIgnoreCase("Paper")) {
                    System.out.println("Scissors beats Paper, Player 1 wins!");

                }
                if (PlayerB.equalsIgnoreCase("Rock")) {
                    System.out.println("Rock beats Scissors, Player 2 wins!");

                }
                if (PlayerB.equalsIgnoreCase("Scissors")) {
                    System.out.println("Its a tie!");
                }
            }
            System.out.println("Continue? Y/N");
            Scanner input3 = new Scanner(System.in);
            String PlayAgain= input3.nextLine();
            if (PlayAgain.equalsIgnoreCase("Y")) {
                Continue = true;
            } else {
                Continue = false;
                System.exit(0);
            }
        }
    }
}
