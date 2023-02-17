import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wynik sprawdzianu pierwszy:");
        int wynik1 = scanner.nextInt();

        System.out.println("Podaj wynik sprawdzianu drugi:");
        int wynik2 = scanner.nextInt();

        System.out.println("Podaj wynik sprawdzianu trzeci:");
        int wynik3 = scanner.nextInt();

        int srednia = (wynik1 + wynik2+ wynik3) / 3;


        System.out.println(srednia);

        if (srednia <= 100 && srednia >= 90){
            System.out.println("Ocena 5!");
        }
        else if (srednia <= 89 && srednia >= 80) {
            System.out.println("Ocena 4!");
        }
        else if (srednia <= 79 && srednia >= 70) {
            System.out.println("Ocena 3!");
        }
        else if (srednia <= 69 && srednia >= 60) {
            System.out.println("Ocena 2!");
        }
        else if (srednia > 59) {
            System.out.println("Ocena 1!");
        }

    }
}
