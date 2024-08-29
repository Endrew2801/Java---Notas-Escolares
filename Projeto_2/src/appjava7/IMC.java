package appjava7;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        float altura, peso, imc;
        String resultado = null;
        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora de IMC: ");
        System.out.println("Digite qual sua altura: ");
        altura = ler.nextFloat();
        System.out.println("Digite qual seu peso: ");
        peso = ler.nextFloat();
        imc = calcIMC(altura, peso);
        ler.close();

        if (imc < 16.0) {
            resultado = "magreza grave";
        } else if (imc < 16.9) {
            resultado = "magreza moderada";
        } else if (imc < 18.5) {
            resultado = "magreza leve";
        } else if (imc < 24.9) {
            resultado = "peso ideal";
        } else if (imc < 29.9) {
            resultado = "sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade grau 1";
        } else if (imc < 39.9) {
            resultado = "Obesidade grau 2";
        } else {
            resultado = "Obesidade grau 3";
        }
        System.out.println("Seu IMC é: " + imc);
        System.out.println(resultado);
    }
    /**
     * Funçaõ calcIMC calcula o IMC de um individuo
     * Recebe os seguintes parâmetros;
     * @param altura
     * @param peso
     * @return
     */
    public static float calcIMC(float altura, float peso) {
        return (float) (peso / Math.pow(altura,2));
    }
}
