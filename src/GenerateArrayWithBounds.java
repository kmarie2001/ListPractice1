import java.util.ArrayList;
import java.util.Scanner;

public class GenerateArrayWithBounds {

    public static ArrayList<Integer> generateArrayWithBounds() {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter a starting number: ");
        int start = numbers.nextInt();
        System.out.println("Enter an ending number: ");
        int end = numbers.nextInt();
        System.out.println("Enter a number to count by: ");
        int step = numbers.nextInt();

        int arrayLength = ((end - start) / (step));
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < (arrayLength); i++) {
            array.add(start);
            start = start + step;
        }
        return array;
    }
}