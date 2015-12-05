package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b;
    System.out.println("Witaj w kalkulatorze. Mozesz tutaj wykonac operacje dodawania, odejmowania, mnozenia i dzielenia");
        System.out.println("Podaj pierwsza liczbe.");
        Scanner liczba = new Scanner(System.in);
        a = liczba.nextDouble();
        System.out.println("Jakie dzialanie chcesz wykonac? Podaj wybrany znak: +, -, *, /.");
        Scanner odczyt = new Scanner(System.in);
        String znak = odczyt.nextLine();
        System.out.println("Podaj druga liczbe");
        Scanner liczba2 = new Scanner(System.in);
        b = liczba2.nextInt();
    switch (znak){
        case "+":
            System.out.println(a + b);
            break;
        case "-":
            System.out.println(a - b);
            break;
        case "*":
            System.out.println(a * b);
            break;
        case "/":
            if (b==0){
            System.out.println("Nie dziel przez zero!");
            } else {
            System.out.println(a / b);
            break;
    }
    }
}
}