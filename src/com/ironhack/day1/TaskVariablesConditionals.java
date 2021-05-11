package com.ironhack.day1;

import java.util.Locale;

public class TaskVariablesConditionals {

    public static void main(String[] args) {
        String name = args[0];
        int num = Integer.parseInt(args[1]);

        if(name.length() < 3){
            System.out.println("Das ist zu wenig!");
        }
        else{
            switch(num){
                case 1:
                    System.out.println(name.toUpperCase());
                    break;
                case 2:
                    System.out.println(name.length());
                    break;
                case 3:
                    System.out.println(name.charAt(2));
                    break;
                case 4:
                    System.out.println(name.replace("e","E"));
                    break;
                case 5:
                    System.out.println(name.repeat(5));
                    break;
                case 6:
                    for(int i=name.length()-1;i>=0;i--){
                        System.out.print(name.charAt(i));
                    }
                    break;
                default:
                    System.out.println("Nur Zahlen zwischen 1-6 erlaubt");
            }
        }

    }

}
