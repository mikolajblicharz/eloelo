import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj mase obiektu (w kg):");
        int masa = scanner.nextInt();

        double ciezar = masa * 9.8;


        if (ciezar > 1000 ) {
            System.out.println("Obiekt zbyt ciężki!");
        }
        else if (ciezar < 10) {
            System.out.println("Obiekt zbyt lekki!");
        }
        else {
            System.out.println("Optymalny ciezar obiektu");
        }
    }
}

