package PrimeiraAvaliacao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Didite o valor da temperatura em C");
        double Celcius = input.nextDouble();

        double Fahrenheit = (Celcius  * 9/5 ) + 32;
        double Kelvin = Celcius + 273.15;

        System.out.println("==== Escalas de Temperaturas ====");
        System.out.printf("Temperatura em Celcius %.1f °C \n", Celcius);
        System.out.printf("Temperatura em Fahrenheit %.1f \n", Fahrenheit);
        System.out.printf("Temperatura em Kelvin %.1f \n", Kelvin);
    }
}
