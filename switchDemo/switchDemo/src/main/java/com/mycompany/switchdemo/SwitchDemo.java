package com.mycompany.switchdemo;

public class SwitchDemo {

    public static void main(String[] args) {
        char grade = 'M';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
