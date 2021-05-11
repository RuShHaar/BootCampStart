package com.ironhack.day1;

import java.time.LocalTime;

public class HelloUniverse {

    public static void main(String[] args) {

        int anzahl = Integer.parseInt(args[1]);
        String name = args[0];

        for(int a=0; a <= anzahl; a++){
            if (LocalTime.now().isBefore(LocalTime.of(12,00))) {
                System.out.println("Guten Morgen " + name);
            }
            else {
                 System.out.println("Guten Tag " + name);
                }
            }
        }
    }

