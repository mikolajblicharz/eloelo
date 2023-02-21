import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        string imieJeden = scanner.next();

        System.out.println("Podaj drugie imię:");
        string imieDwa = scanner.next();

        System.out.println("Podaj trzecie imię:");
        string imieTrzy = scanner.next();

        if (imieJeden.compareToIgnoreCase(imieDwa) < ) {
            System.out.println(sekundy + " sekund to " + dni + " dni/ " + minuty + "minut/" + sekundy + "sekund/");
        }
        else if (sekundy > 60 && sekundy < 86400) {
            System.out.println(sekundy + " sekund to" + "0 dni/ " + minuty + "minut/" + sekundy + "sekund/");
        }
        else if (sekundy <= 60){
            System.out.println(sekundy + " sekund to" + "0 dni/ " + " 0 minut/" + sekundy + "sekund/");
        }
    }
}
