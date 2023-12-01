import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class FindAndDestroyAllAmoebas {

    public static ArrayList<String> findAndDestroyAllAmoebas() {

        Scanner words = new Scanner(System.in);

        System.out.println("Enter your desired amount of words. Enter 'stop' when you want to stop.");
        System.out.print("Enter words 1: ");


        String input = words.nextLine();
        ArrayList<String> stringsWithAmoeba = new ArrayList<>();
        stringsWithAmoeba.add(input);

        for (int value = 1; value < 101; value++) {
            while (!Objects.equals(input, "stop")) {
                System.out.print("Enter value " + (value + 1) + ": ");
                input = words.nextLine();
                stringsWithAmoeba.add(input);
                value++;
            }
        }

        while(stringsWithAmoeba.contains("amoeba")){
        stringsWithAmoeba.remove("amoeba");}

        return stringsWithAmoeba;
    }

}
