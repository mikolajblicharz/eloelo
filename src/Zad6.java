import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę sekund:");
        int sekundy = scanner.nextInt();

        int dni = sekundy / 86400;
         int minuty = sekundy / 60;


        if (sekundy > 86400 ) {
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
