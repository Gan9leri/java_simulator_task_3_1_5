import javax.annotation.processing.SupportedSourceVersion;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        int x, y, result;
        int[] inputValues = inputReader();
        x = inputValues[0];
        y = inputValues[1];
        result = x % y;
        System.out.println(result);
    }

    public static int[] inputReader() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] values = inputLine.split(" ");
        int[] result = new int[2];
        result[0] = parseInt(values[0]);
        result[1] = parseInt(values[1]);

        return result;
    }
}
