package pl.coderslab.warsztaty1.gra.w.zgadywanie;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        System.out.println("zadanie uno");

        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        int whitchTry = 1;
        System.out.println("Wylosowałem liczbę a Ty ją zgadnij");
        boolean win = false;
        while (!win) {


            int number = wczytajLiczbe();
            if (number < randomInt) {
                System.out.println("podana liczba jest za mała. " + "Próba nr " + whitchTry);
                whitchTry++;
            } else if (number > randomInt) {
                System.out.println("podana liczba jest za duża. " + "Próba nr " + whitchTry);
                whitchTry++;
            } else {
                System.out.println("Zgadłeś " + "potrzebowałeś na to " + whitchTry + "prób");
                ++whitchTry;
                win = true;
            }
        }
    }

    public static int wczytajLiczbe() {
        System.out.println("Podaj liczbę");

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Musisz podać liczbę");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
