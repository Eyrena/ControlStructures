import java.sql.SQLOutput;

public class ForEach {

    public static void main(String[] args) {

        int[] vectorOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < vectorOfInts.length; i++){
            System.out.println("FOR1 - Elementul " + i + " este " + vectorOfInts[i]);
        }

        for(int element : vectorOfInts) {
            System.out.println("FOR2 - Elementul este: " + element);
        }

        for (int i = 0; i < vectorOfInts.length; i=i+2) {
            System.out.println("FOR3 - Elementul " + i + " este " + vectorOfInts[i]);
        }
    }
}
