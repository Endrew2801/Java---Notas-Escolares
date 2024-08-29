package appjava5;

public class For {

    public static void main(String[] args) {
        
        int i = 0;

        for (;i < 10; i++) {
            System.out.println("Sem controle: " + i);
        }
        System.out.println("Valor final: " + i);
        for (;i > 0;) {
            System.out.println("Sem controle 2: " + i--);
        }
        for (;;) {
            System.out.println("Print teste ");
        }
        /*for (; true;) {
        *System.out.printIn("Print teste ");
        }*/
    }
}
