/*
 MC210914637
 K.PRAGATISWARAN A/L KRISHNAMURTHY
 PROJECT - ANIMAL KINGDOM
 */
/* CritterMain are main method for simulation program.  Number of each critter altered  are added
to the simulation if need different scenarios. Width and height can be also altered
and passed to the CritterFrame constructor
*/

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // uncomment each of these lines as you complete these classes
            frame.add(30, Bear.class);
            frame.add(30, Tiger.class);
            frame.add(30, WhiteTiger.class);
            frame.add(30, Giant.class);
            frame.add(30, NinjaCat.class);

        frame.add(30, FlyTrap.class);
        frame.add(30, Food.class);

        frame.start();
    }
}
