import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Circles {
    ArrayList<Circle> circles;

    public Circles(){
        circles = new ArrayList<>();
    }

    public static String maxSquare(final ArrayList<Circle> circles)
    {
        double max = circles.get(0).getSquare();
        for (Circle circle : circles) {
            if (circle.getSquare() > max) {
                max = circle.getSquare();
            }
        }
        return "\nMax square of a circle: " + max;
    }

    public void clear() {
        this.circles.clear();
    }

}