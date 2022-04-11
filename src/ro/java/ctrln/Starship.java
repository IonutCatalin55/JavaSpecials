package ro.java.ctrln;

import java.util.Random;

public interface Starship {

    public void Warp();

    public void setStarshipDestination(String destination);

    public double computeWartSpeed(int warpFactor, int ligthYearsToDestination);

    default double productionID(){
        Random r = new Random();
        return 1 + (2 - r.nextDouble());
    }
}
