package appjava6;
import java.util.Scanner;
public class SwitchNotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        String conceito = "";
        System.out.print("Informe a nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "Conceito A";
                break;
            case 8:
            case 7:
                conceito = "Conceito B";
                break;
            case 6:
            case 5:
                conceito = "Conceito C";
                break;
            case 4:
            case 3:
                conceito = "Conceito D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "Conceito E";
                break;
            default: System.out.println("Nota inválida!");
        }entrada.close();
        System.out.println(conceito);
    }
}
