package DesafiosJava;
import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um Número inteiro: ");
        int numero = entrada.nextInt();
        int contDiv = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                    contDiv ++;
                }
        }
        switch (contDiv) {
            case 1:
                System.out.println(numero + " é um número especial!");
                break;
            case 2:
                System.out.println(numero + " é primo!");
                break;
            
            default:System.out.println(numero + " não é primo!");
                break;
        }entrada.close();
    }
}
