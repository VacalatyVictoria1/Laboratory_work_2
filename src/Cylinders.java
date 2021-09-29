import java.util.ArrayList;

public class Cylinders {
    ArrayList<Cylinder> cylinders;

    public Cylinders() {cylinders = new ArrayList<>();}
    public static String averageVolume(ArrayList<Cylinder> cylinders)
    {
        double volume = 0;
        for (Cylinder cylinder : cylinders) {
            volume += cylinder.getVolume();
        }
        volume /= cylinders.size();

        return "\nAverage volume of a cylinder = " + volume;
    }
}

