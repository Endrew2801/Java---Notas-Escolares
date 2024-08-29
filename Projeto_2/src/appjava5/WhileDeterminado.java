package appjava5;

import java.util.Scanner;

public class WhileDeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while (valor.equalsIgnoreCase("Sair")) {
            System.out.print("Você escolheu:");
            valor = entrada.nextLine();
        }
        System.out.println("Você saiu!");
        entrada.close();
    }
}
