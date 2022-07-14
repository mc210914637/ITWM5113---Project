/*
 MC210914637
 K.PRAGATISWARAN A/L KRISHNAMURTHY
 PROJECT - ANIMAL KINGDOM
 */
import java.awt.*;
import java.util.*;


public class Tiger extends Critter {
    private int colorMoves;
    Color tigerColor;
    Random rand = new Random();

    public Tiger(){
        colorMoves=0;//1,2,3
        getColor();
    }

    public Color getColor() {
        // picks one of three colors (Color.RED, Color.GREEN, Color.BLUE) randomly and uses that color for three moves,
        // after then randomly picks one of those colors again for the next three moves,
        // after then randomly picks another one of those colors for the next three moves, and so on
        if (colorMoves%3==0){ // new color set
            int x=0;
            while (x==0){
                int i=rand.nextInt(3); //0.Red 1.Green 2.Black
                if (i==0 && this.tigerColor!=Color.RED){
                    this.tigerColor= Color.RED;
                    x++;
                } if (i==1 && tigerColor!=Color.GREEN){
                    this.tigerColor=Color.GREEN;
                    x++;
                } if (i==2 && tigerColor!=Color.BLUE){
                    this.tigerColor=Color.BLUE;
                    x++;
                }
            }

        }
        return tigerColor;
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        // Infect if an enemy is in front, otherwise if a wall is in front or to the right, then turn left,
        // else if a fellow Tiger is in front, then turn right, otherwise hop.
        colorMoves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
