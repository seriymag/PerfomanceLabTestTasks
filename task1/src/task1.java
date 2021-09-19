import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    private static int num;
    private static int step;
    private static int end;


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        while (fileReader.ready()) {
            num = Integer.parseInt(fileReader.readLine());
            step = Integer.parseInt(fileReader.readLine());

        }
        List<Integer> list = new ArrayList<>();
        List<Integer> route = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(i + 1);
        }
        end = 0;
        route.add(list.get(0));
        int step1 = step;


        while (end != list.get(0)) {
            if (step1 <= list.size()) {
                route.add(list.get(step1 - 1));
                end = list.get(step1 - 1);
                step1 = step1 + step - 1;


            } else {
                List<Integer> listCopy = new ArrayList<>(list);
                list.addAll(listCopy);
            }
        }
        for (int i = 0; i < route.size() - 1; i++) {
            System.out.print(route.get(i));
        }
    }
}