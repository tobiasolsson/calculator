import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vill du ");
        System.out.println("Addera (1)");
        System.out.println("Subtrahera (2)");
        System.out.println("Dividera (3)");
        System.out.println("Multiplicera (4)");
        System.out.println("Modulus (5)");
        System.out.println("Jämföra två tal (6)");
        System.out.println("EXIT för att avluta programmet");

        while (true) {
            try {
                // Check for exit during menu choice
                String menuChoice = scanner.nextLine();
                if (menuChoice.equalsIgnoreCase("exit")) System.exit(0);

                // If no exit, convert to int (try/catch will take care if not possible and will let user redo)
                int menu = Integer.parseInt(menuChoice);

                System.out.println("Tryck '=' för att räkna ut talen");

                while (true) {
                    // TODO begränsa jämförelse operationer till 2 inputs
                    // TODO ska jag hantera parenteser?

                    String input = scanner.nextLine();

                    if (input.equals("=") && (numbers.size() < 2)) {
                        System.out.println("Du behöver minst 2 tal");
                        System.out.println("Du har endast skrivit in " + numbers.size() + " st");
                        continue;
                    } else if (input.equals("=") && menu == 1) {
                        Math.add(numbers);
                        break;
                    } else if (input.equals("=") && menu == 2) {
                        Math.subtract(numbers);
                        break;
                    } else if (input.equals("=") && menu == 3) {
                        Math.divide(numbers);
                        break;
                    } else if (input.equals("=") && menu == 4) {
                        Math.multiply(numbers);
                        break;
                    } else if (input.equals("=") && menu == 5) {
                        Math.modulus(numbers);
                        break;
                    } else if (input.equals("=") && menu == 6) {
                        Math.largerThan(numbers);
                        break;
                    } else if (input.equalsIgnoreCase("exit")) {
                        break;
                    }

                    // Convert input to double and add number to ArrayList
                    try {
                        numbers.add(Double.parseDouble(input));
                    } catch (Exception e) {
                        System.out.println("Vänligen skriv en siffra som du vill räkna på, eller '=' för att räkna ut,"
                                + "eller EXIT för att avsluta.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Fel input");
            }
        }

    }
}