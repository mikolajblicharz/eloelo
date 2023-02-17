import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę (w kg):");
        int waga = scanner.nextInt();

        System.out.println("Podaj wzrost (w m):");
        double wzrost = scanner.nextDouble();

        double BMI = waga / (wzrost*wzrost);

        if (BMI>=18.5 && BMI<=25){
            System.out.println("Masz optymalny indeks BMI");
        }
        else if(BMI<18.5) {
            System.out.println("Masz niedowagę");
        }
        else if(BMI>25) {
            System.out.println("Masz nadwagę");
        }



    }
}