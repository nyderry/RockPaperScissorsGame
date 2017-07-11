import java.util.Scanner;

/**
 * Created by Ny Derry on 7/10/2017.
 */
    // This is the "Parent" class for the other players of TheJets and TheSharks and User
    public abstract class Player {

        Scanner entry = new Scanner(System.in);
        // To keep the data private, creating abstract class and the variables are private and the getter // setter method is used
        private String name;
        private Roshambo selection;

        public String getName() {        // getter for 'name' variable
            return name;
        }

        public void setName(String name) {    // setter for 'name' variable
            this.name = name;
        }

        public Roshambo getSelection() {      // calling Roshambo Class for selection
            return selection;
        }

        public abstract Roshambo generateRoshambo();

    }


