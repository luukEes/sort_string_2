
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        Scanner scan = new Scanner(new File("srawa.txt"));
        while (scan.hasNextLine()) {
            builder.append(scan.nextLine()).append("@");
        }
        String s = builder.toString();
        String[] stringTab = s.split("@");
        Arrays.sort(stringTab);
        System.out.println(Arrays.deepToString(stringTab));
    }
}



