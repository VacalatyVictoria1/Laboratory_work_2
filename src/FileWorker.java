import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {

    public void save(String filename, ArrayList<Circle> circles,ArrayList<Cylinder> cylinders) throws IOException {
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Circle circle : circles) {
            try {
                bw.write("Circle " + String.valueOf(circle.getRadius()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Cylinder cylinder : cylinders) {
            try {
                bw.write("Cylinder " + String.valueOf(cylinder.getRadius()) + " " + String.valueOf(cylinder.getHeight()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        bw.close();
        fw.close();
    }

    public void read(String filename, ArrayList<Circle> circles,ArrayList<Cylinder> cylinders) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(filename));
        while (scanner.hasNextLine())
        {
            String[] line = scanner.nextLine().split(" ");
            if(line[0].matches("Circle"))
            {
                circles.add(new Circle(Double.valueOf(line[1])));
            }
            else if(line[0] .matches("Cylinder") )
            {
                cylinders.add(new Cylinder(Double.valueOf(line[1]),Double.valueOf(line[2])));
            }
            else
                System.out.println("ERROR");

        }
    }
}