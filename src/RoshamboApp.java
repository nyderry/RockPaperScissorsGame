import java.util.Scanner;

/**
 * Created by Ny Derry on 7/10/2017.
 */

public class RoshamboApp {

    public static void main(String[] args) {

        // scanner entry to start app and get user Entry
        Scanner entry = new Scanner(System.in);
        String keepGoing = "y";
        String playerSelected;
        String opposition;
        Roshambo userSelection;
        Roshambo oppositionSelection;

        int[] record = new int[2];

        // creating objects
        User user = new User();
        TheJets jet = new TheJets();
        TheSharks shark = new TheSharks();

        // user prompts
        System.out.println("Welcome to Rock Paper Scissors!");
        // data validation with Validator class, lines 10 ~ 14
        user.setName(Validator.getString(entry, "\nEnter your name: "));
        // data validation with Validator class, lines 17 ~ 30
        playerSelected = Validator.getString(entry, "\nWould you like to play against TheJets or TheSharks (j/s)?: ", "Sorry, entry must be \"j\" or \"s\". ", "j", "s");

        // while loop to continue playing
        while (keepGoing.equalsIgnoreCase("y")) {

            //System.out.println(user.getName() + ": " + selectionOptions.get(selection));
            userSelection = user.generateRoshambo();
            System.out.println("\n" + user.getName() + ": " + userSelection);

            // picking with opponent to play against
            if (playerSelected.equalsIgnoreCase("j")) {
                opposition = "TheJets";
                oppositionSelection = jet.generateRoshambo();
                System.out.println(opposition + ": " + oppositionSelection);
            } else {
                opposition = "TheSharks";
                oppositionSelection = shark.generateRoshambo();
                System.out.println(opposition + ": " + oppositionSelection);
            }

            result(userSelection, oppositionSelection, user.getName(), opposition, record);

            // while loop to continue playing
            keepGoing = Validator.getString(entry, "\nPlay again? (y/n): ", "Sorry, entry must be \"y\" or \"n\". ", "y", "n");
        }
        System.out.println("Wins: " + record[0] + "\nLosses: " + record[1]);
        System.out.println("\nThank you for playing Rock Paper Scissors!");
    }

    // method to determine the result of match and print output
    public static void result(Roshambo userSelection, Roshambo oppositionSelection, String user, String opposition, int[] record) {

        if (userSelection != oppositionSelection) {
            if (userSelection == Roshambo.rock) {
                if (oppositionSelection == Roshambo.paper) {
                    System.out.println(opposition + " wins!");
                    record[1]++;

                } else {
                    System.out.println(user + " wins!");
                    record[0]++;
                }
            } else if (userSelection == Roshambo.paper) {
                if (oppositionSelection == Roshambo.rock) {
                    System.out.println(user + " wins!");
                    record[0]++;
                } else {
                    System.out.println(opposition + " wins!");
                    record[1]++;
                }
            } else if (userSelection == Roshambo.scissors) {
                if (oppositionSelection == Roshambo.rock) {
                    System.out.println(opposition + " wins!");
                    record[1]++;
                } else {
                    System.out.println(user + " wins!");
                    record[0]++;
                }
            }
        } else {
            System.out.println("Draw!");
        }


    }
}
