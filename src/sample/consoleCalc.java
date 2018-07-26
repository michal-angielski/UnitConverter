package sample;

import java.util.Scanner;

public class consoleCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("C to F and K -> Type '1'");
        System.out.println("F to C and K -> Type '2'");
        System.out.println("K to C and F -> Type '3'");

        int select = scan.nextInt();

        if (select == 1){

        } else if (select == 2){

        }else if (select ==3){

        }else {
            System.out.println("Pick a number from 1 to 3!");
        }
    }
}
