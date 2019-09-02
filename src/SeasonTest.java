import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        String userInput = getUserInput();
        Season[] seasons = Season.values();
        String chosenSeason = null;

        for (Season s : seasons) {
            if (s.getName().equals(userInput)) {
                chosenSeason = s.name();
            }
        }

        if (chosenSeason == null) {
            System.out.println("wprowadzono błędne dane!");
        } else {
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
    }

    public static String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nazwę pory roku: ");
        String userInput = in.nextLine();
        in.close();
        return userInput;
    }
}
