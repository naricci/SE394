import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class ProfExample {

    public static void main(String[] args) {

        long start = System.nanoTime();
        calculate();
        long end = System.nanoTime();
        long difference = end - start;

        System.out.println(
                "Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println(
                "Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println(
                "Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
    }

    public static void calculate() {

        Scanner kb = new Scanner(System.in);
        String sentence = "This is an awesome text with lots of text in an awesome representation";
        String[] words = sentence.split("\\s");
        Set<String> uniques = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            uniques.add(words[i]);
        }

        // For Reading From File
//		FileReader fr = new FileReader("C:\\Users\\001405200\\Desktop\file.txt");
//
//		BufferedReader bufferedReader = new BufferedReader(fr);
//		String input = "";
//		while (input += bufferedReader.readLine()) {
//
//		}

        for (String data: uniques) {
            System.out.println(data);
        }
    }
}
