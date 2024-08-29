package DesafiosJava;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        int num = 0, maior = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 10 números inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.print(+ (i + 1) + "° número: ");
            num = entrada.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        entrada.close();
        System.out.println("O maior número é: " + maior);
    }
}
