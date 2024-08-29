package appjava3;
import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um Número:");
        numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número par.");
            System.out.println("Pode prosseguir.");
        }else{
            System.out.println("Número Ímpar.");
            System.out.println("Pode prosseguir.");
        }entrada.close();
    }
}
