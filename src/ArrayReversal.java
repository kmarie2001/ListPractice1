import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversal {

    public static void arrayReversal(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your desired number of values. Enter -1 when you want to stop.");
        System.out.print("Enter value 1: ");


    int enteredNumbers = input.nextInt();
    ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(enteredNumbers);

        for (int value = 1; value < 101; value++) {
        while (enteredNumbers != -1) {
            System.out.print("Enter value " + (value + 1) + ": ");
            enteredNumbers = input.nextInt();
            numbers.add(enteredNumbers);
            value++;
        }
        if (enteredNumbers == -1) {
            System.out.println("Here are your values in reversed order: ");
            for (value = value - 2; value >= 0; value--) {
                System.out.println(numbers.get(value));
            }
            break;
}}}}
