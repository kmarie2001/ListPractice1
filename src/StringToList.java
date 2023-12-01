import java.util.ArrayList;
import java.util.Scanner;

public class StringToList {
    public static ArrayList<String> stringToList() {
        Scanner string = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = string.nextLine();

        ArrayList<String> arrayString = new ArrayList<>();

        for (int i = 0; i < input.length(); i++){
            arrayString.add(input.substring(i, (i + 1)));}


        return arrayString;
}}
