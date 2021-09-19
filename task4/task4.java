import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task4 {
    public static int count;
    public static int median;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        List<Integer> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.add(Integer.parseInt(fileReader.readLine()));
        }

        list.sort(Comparator.naturalOrder());
        if (list.size() / 2 == 0) {
            median = list.get(list.size() / 2);
        }
            else {
                median = list.get((list.size() - 1) / 2 + 1);
        }

        for (Integer i : list) {
            while (i != median) {
                if (i < median) {
                    i++;
                    count++;
                }
                if (i > median) {
                    i--;
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
