package Calculs;

import java.util.Scanner;

public class
Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un autre nombre : ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
        } else {
            System.out.println("Résultat : " + (a / b));
        }
    }
}
