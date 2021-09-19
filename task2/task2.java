import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    private static double x;
    private static double y;
    private static double r;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        while (fileReader.ready()) {
            String xy = fileReader.readLine();
            String[] xyArray = xy.split(" ");
            x = Double.parseDouble(xyArray[0]);
            y = Double.parseDouble(xyArray[1]);
            r = Double.parseDouble(fileReader.readLine());
        }

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader1.readLine())));

        List<Point> points = new ArrayList<>();

        while (fileReader1.ready()) {
            String xy = fileReader1.readLine();
            String[] xyArray = xy.split(" ");
            points.add(new Point(Double.parseDouble(xyArray[0]), Double.parseDouble(xyArray[1])));
        }

        for (Point p : points) {
            double value = ((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
            int location = value < r * r ? 1 : 2;
            if (value == r * r) {
                location = 0;
            }
            p.setLocation(location);
            System.out.println(p.getLocation());
        }

    }
}
