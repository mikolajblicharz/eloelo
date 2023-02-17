import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Dzień miesiąca (w postaci liczby):");
        int dzien = scanner.nextInt();

        System.out.println("Podaj miesiąc (w postaci liczby):");
        int miesiac = scanner.nextInt();

        System.out.println("Podaj dwie ostanie cyfry roku:");
        int rok = scanner.nextInt();

        if(dzien * miesiac == rok){
            System.out.println("Data jest magiczna");
        }
        else{
            System.out.println("Data nie jest magiczna");
        }

    }
}

