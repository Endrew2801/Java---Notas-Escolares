package DesafiosJava;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0, soma = 0;

        while (valor >= 0);{
            System.out.println("Informe um número inteiro: ");
            valor = entrada.nextInt();

            if (valor >= 0) {
                soma = soma + valor;
            }
        }
        System.out.println("A soma dos valores positivos inseridos é: " + soma);
        entrada.close();
    }
}
