import java.util.HashMap;

/**
 * Created by Ny Derry on 7/10/2017.
 */
    // Child class of the Player class
    public class User extends Player {

        //Generate and return a Roshambo value
        @Override
        public Roshambo generateRoshambo() {

            String selection;
            // Enter in Validator fields to setup prompts and error messages
            selection = Validator.getString(entry, "\nRock, paper, or scissors? (R/P/S): ", "Please enter \"r\", \"p\", or \"s\". ", "r", "p", "s").toLowerCase();

            HashMap<String, Roshambo> selectionOptions = new HashMap<String, Roshambo>();

            selectionOptions.put("r", Roshambo.rock);
            selectionOptions.put("p", Roshambo.paper);
            selectionOptions.put("s", Roshambo.scissors);

            return selectionOptions.get(selection);
        }

    }


