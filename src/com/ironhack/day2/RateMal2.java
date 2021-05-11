package com.ironhack.day2;

import java.util.Random;
import java.util.Scanner;

public class RateMal2 {

    public static void main(String[] args) {

        //Scanner implementieren
        Scanner input = new Scanner(System.in);

        // Versuchszähler
        int count = 1;
        System.out.println(getZufallsZahl());


        //Programmstart
        System.out.println("Es wurde eine Zufallszahl zwischen 1 - 50 generiert. Kannst du sie erraten?");

        System.out.println("Tippe deine Zahl ein: ");
        int tipp = input.nextInt();
        while (getZufallsZahl() != tipp) {

            if (tipp > getZufallsZahl() && tipp <=50) {
                System.out.println(count + ". Versuch. Leider falsch. Die Zahl ist kleiner");
                count++;
                tipp = input.nextInt();

            } else if (tipp < getZufallsZahl() && tipp >0) {
                System.out.println(count + ". Versuch. Leider falsch. Die Zahl ist größer");
                count++;
                tipp = input.nextInt();
            } else if (tipp < 1 || tipp > 50) {
                System.out.println("Es sind nur Zahlen zwischen 1 - 50 erlaubt!!");
                tipp = input.nextInt();
            }

        }
        System.out.println("Korrekt! Du hast es beim " + count + ". Versuch erraten!");


    }
    //Zufallszahl generieren
    public static int getZufallsZahl(){
        Random zufall = new Random();
        return 1 + zufall.nextInt(50);
    }
}

