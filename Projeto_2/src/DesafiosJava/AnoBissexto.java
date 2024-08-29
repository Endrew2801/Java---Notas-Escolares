package DesafiosJava;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = 0;
        System.out.println("Descobrir se o ano é bissexto");
        System.out.print("Informe um ano: ");
        ano = entrada.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto!");
        }
        else{
            System.out.println(ano + " não é um ano bissexto!");
        }entrada.close();
    }
}
