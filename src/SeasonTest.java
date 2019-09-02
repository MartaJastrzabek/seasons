import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String chosenSeason = SeasonMethods.convertInputToEnumName(in);
        SeasonMethods.printMonths(chosenSeason);

        in.close();
    }
}
