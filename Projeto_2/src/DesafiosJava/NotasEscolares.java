package DesafiosJava;

import java.util.Scanner;

public class NotasEscolares {
/**
 * Receber 4 notas de 0 a 10 e fazer a média dos
 * 4 bimestres, considerando media maior que 7 para aprovação
 * @param args
 */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        float notas[] = new float [5];
        String aluno, resultado;

        System.out.println("Notas Escolares");
        System.out.print("Informe o nome do aluno: ");
        aluno = ler.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i+1) + "ª nota: ");
            notas[i] = ler.nextFloat();
            notas[4] = notas[4] + notas[i];
        }
        notas[4] = notas[4]/4;

        if (notas[4] >= 7) {
            resultado = "Aprovado!";
        }else{
            resultado = "Reprovado!";
        }ler.close();
        System.out.println("O(a) aluno(a) " + aluno + " teve a média " + notas[4] + " e foi " + resultado);
    }
}
