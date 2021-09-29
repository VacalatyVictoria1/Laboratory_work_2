import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Circles circles = new Circles();
        Cylinders cylinders = new Cylinders();

        circles.circles.add(new Circle(7));
        circles.circles.add(new Circle(9));
        circles.circles.add(new Circle(12));
        circles.circles.add(new Circle(4));

        cylinders.cylinders.add(new Cylinder(circles.circles.get(0).getRadius(), 9));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(1).getRadius(), 5));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(2).getRadius(), 18));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(3).getRadius(), 13));

        System.out.println(circles.circles.toString().replace("[", "").replace("]", ""));
        System.out.println(cylinders.cylinders.toString().replace("[", "").replace("]", ""));

        System.out.println(circles.maxSquare(circles.circles));
        System.out.println(cylinders.averageVolume(cylinders.cylinders));
    }

}