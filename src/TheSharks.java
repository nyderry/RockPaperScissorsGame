/**
 * Created by Ny Derry on 7/10/2017.
 */
    // Child class of the Player class
    public class TheSharks extends Player {

        //Generate and return a Roshambo value
        @Override
        public Roshambo generateRoshambo() {
            return Roshambo.values()[getMathRandomNumGenerator()];
        }

        //Method using Math Class
        public static int getMathRandomNumGenerator() {
            return (int) (Math.random() * 3);
        }
    }


