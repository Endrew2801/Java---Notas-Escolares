package appjava3;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {

        double nota = 0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota: ");
        nota = entrada.nextDouble();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 9.1) {
                System.out.print("Conceito A\n");
                System.out.print("Hall da Fama!\n");
            }if (nota <=9 && nota >= 7) {
                System.out.print("Aprovado!");
            }else if (nota <= 3) {
                System.out.println("Reprovado!");
            }else{
                System.out.print("Recuperação!");
            }
        }entrada.close();
    }
}
