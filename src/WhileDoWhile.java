public class WhileDoWhile {

    public static void main(String[] args) {

        int counter = 0;

        while (counter < 25) {
            System.out.println("WHILE counterul are valoarea: " + counter);
            counter++;
        }
        System.out.println("****************************************");
        counter = 0;
        do {
            System.out.println("DO-WHILE counterul are valoarea: " + counter);
            counter++;
        } while (counter < 25);
    }
}
