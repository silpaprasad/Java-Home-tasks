
import java.lang.Math;

public class Volume{
    public static void main(String[] args) {
        double radiusEarth = 3800;
        double radiusSun = 865000;
        //calculate volume of Earth 4/3πr^3
        double volumeEarth = (4.0/3.0) * Math.PI * Math.pow(radiusEarth, 3);
        //calculate volume of Sun 4/3πr^3
        double volumeSun = (4.0/3.0) * Math.PI * Math.pow(radiusSun, 3);
        //Calculate ration of volume of the Sun to the volume of the Earth
        double volumeRatio = volumeSun / volumeEarth;

        System.out.println("The volume of the Earth is " + volumeEarth + " cubic miles, the volume of the Sun is " + volumeSun + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio + ".");
    }
}

