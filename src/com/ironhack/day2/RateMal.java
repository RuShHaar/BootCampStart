package com.ironhack.day2;

import java.util.Random;
import java.util.Scanner;

public class RateMal {

    public static void main(String[] args) {

        //Scanner implementieren
        Scanner input = new Scanner(System.in);

        //Zufallszahl generieren
        Random zufall = new Random();
        int zufallsZahl = 1 + zufall.nextInt(50);

        // Versuchszähler
        int count = 1;
        System.out.println(zufallsZahl);

        //Programmstart
        System.out.println("Es wurde eine Zufallszahl zwischen 1 - 50 generiert. Kannst du sie erraten?");

        System.out.println("Tippe deine Zahl ein: ");
        int tipp = input.nextInt();
        while (zufallsZahl != tipp) {

            if (tipp > zufallsZahl && tipp <= 50) {
                System.out.println(count + ". Versuch. Leider falsch. Die Zahl ist kleiner! Gib eine neue Zahl ein:");
                count++;
                tipp = input.nextInt();

            } else if (tipp < zufallsZahl && tipp > 0) {
                System.out.println(count + ". Versuch. Leider falsch. Die Zahl ist größer! Gib eine neue Zahl ein:");
                count++;
                tipp = input.nextInt();

            } else if (tipp < 1 || tipp > 50) {
                System.out.println("Es sind nur Zahlen zwischen 1 - 50 erlaubt!!");
                tipp = input.nextInt();
            }

        }
        System.out.println("Korrekt! Du hast es beim " + count + ". Versuch erraten!");
    }
}

