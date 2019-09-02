import java.util.Scanner;

public class SeasonMethods {
    public static String convertInputToEnumName(Scanner in) {
        String userInput = null;
        Season[] seasons = Season.values();
        String chosenSeason = null;

        do {
            userInput = getUserInput(in);

            for (Season s : seasons) {
                if (s.getName().equals(userInput)) {
                    chosenSeason = s.name();
                }
            }

            if(chosenSeason == null)
                System.out.println("Podano nie prawidłową wartość");

        }while (chosenSeason == null);

        return chosenSeason;
    }

    public static void printMonths(String chosenSeason) {
        switch (Season.valueOf(chosenSeason)) {
            case SPRING:
                System.out.println(Season.SPRING.toString());
                break;
            case SUMMER:
                System.out.println(Season.SUMMER.toString());
                break;
            case AUTUMN:
                System.out.println(Season.AUTUMN.toString());
                break;
            case WINTER:
                System.out.println(Season.WINTER.toString());
                break;
        }
    }

    public static String getUserInput(Scanner in) {
        System.out.println("Podaj nazwę pory roku: ");
        String userInput = in.nextLine();
        return userInput;
    }
}
