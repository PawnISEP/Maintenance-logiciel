package Calculs;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un premier nombre : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un deuxième nombre : ");
        int b = scanner.nextInt();

        int resultat = a + b;

        System.out.println("Résultat de l'addition : " + resultat);
    }
}
