package sample;

import java.util.Scanner;

public class consoleCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("C to F and K -> Type '1'");
        System.out.println("F to C and K -> Type '2'");
        System.out.println("K to C and F -> Type '3'");
        System.out.print("Choose conversion type: ");

        double temperature, kelvin, celsius, fahrenheit = 0;


        int select = scan.nextInt();

        if (select == 1) { //celsius to f and k
            System.out.print("Enter a temperature in Celsius: ");
            temperature = scan.nextInt();
            kelvin = temperature + 273.15;
            fahrenheit = (temperature * 1.8) + 32;
            System.out.println("    " + temperature + " Celsius in: ");
            System.out.println("    Kelvin is: " + kelvin);
            System.out.println("    Fahrenheit is: " + fahrenheit);

        } else if (select == 2) { //fahrenheit to c and k
            System.out.print("Enter a temperature in Fahrenheit: ");
            temperature = scan.nextInt();
            celsius = (temperature - 32) / 1.8;
            kelvin = (temperature + 459.67) * 5 / 9;
            System.out.println("    " + temperature + " Fahrenheit in: ");
            System.out.println("    Celsius is: " + (double) Math.round(celsius * 100) / 100);
            System.out.println("    Kelvin is: " + (double) Math.round(kelvin * 100) / 100);

        } else if (select == 3) { //kelvin to c and f
            System.out.print("Enter a temperature in Kelvin: ");
            temperature = scan.nextInt();
            celsius = temperature - 273.15;
            fahrenheit = (temperature * 1.8) - 459.67;
            System.out.println("    " + temperature + " Fahrenheit in: ");
            System.out.println("    Celsius is: " + (double) Math.round(celsius * 100) / 100);
            System.out.println("    Fahrenheit is: " + (double) Math.round(fahrenheit * 100) / 100);

        } else {
            System.out.println("Pick a number from 1 to 3!");
        }
    }
}
