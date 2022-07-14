/*
 MC210914637
 K.PRAGATISWARAN A/L KRISHNAMURTHY
 PROJECT - ANIMAL KINGDOM
 */
import java.awt.*;

public class NinjaCat extends Tiger {

    public boolean hasInfected;

    public NinjaCat (){
        hasInfected=false;
    }

    public Color getColor() {
        if (hasInfected){
            return Color.pink;
        } else {
            return Color.darkGray;
        }

    }


    public String toString() {
        if (hasInfected){
            return "NinC";
        } else {
            return "NinjaC";
        }

    }


    public Action getMove(CritterInfo info) {
        //same as Tiger, but changes color when has infected
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
