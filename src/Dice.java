public class Dice {

    private int sides;

        //constructor to choose the amount of sides of the die
        public Dice(int sides){
            this.sides=sides;

            //help me jk
        }

        // roll the die and return the value (1-6)
        public int roll() {
            int d1 = (int)(Math.random() * sides + 1);
            return d1;
        }

        // roll the die n times and print the values
        public void rollMultiple(int n) {
            for (int i = 1; i < n; i++) {
                System.out.print(roll() + " ");
            }
        }

}
