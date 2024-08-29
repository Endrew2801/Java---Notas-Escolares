package appjava7;

public class Continue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Volta n° "+i);
        }
        System.out.println("Fim do programa!");
    }
}
