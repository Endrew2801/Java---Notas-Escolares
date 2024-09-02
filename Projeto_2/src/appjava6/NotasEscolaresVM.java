package appjava6;
import java.util.Scanner;
public class NotasEscolaresVM {
/**
 * Criar Algoritmo para receber as notas de 5 alunos de 4 bimestres,
 * a frequência do aluno e apresentar o resultado final considerando
 * média >= 7 e frequência >= 75%
 * @param args
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String[5][2];
        float notas[][] = new float[5][6];

        System.out.println(".: Notas Escolares 2 :.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o(a) "+(i+1)+"º aluno(a): ");
            alunos[i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a "+(j+1)+"ª nota: ");
                notas[i][j] = ler.nextFloat();
                notas[i][5] = notas[i][5] + notas[i][j]; //Acumula/soma as 4 notas
            } //fim do FOR notas
            notas[i][5] = notas[i][5]/4;//Calcula a média das notas
            System.out.print("Digite a frequência do(a) aluno(a) "+alunos[i][0]+": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75) {
                alunos[i][1] = "Reprovado por Falta!";
            }else if (notas[i][5] < 7) {
                alunos[i][1] = "Reprovado por Nota!";
            }else {
                alunos[i][1] = "Aprovado!";
            }
            System.out.println("-------------------------");
        }//fim do PRIMEIRO FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno(a): "+alunos[i][0]+"\nMédia: "+notas[i][5]+"\nFrequência: "+notas[i][4]+"\nResultado Final: "+alunos[i][1]+".\n-------------------------");
        }
        ler.close();
        System.out.println(".: Sistema de Notas Encerrado :.");
        System.out.println("Alterado no VS Web");
        System.out.println("Teste de Push");
    }
}
