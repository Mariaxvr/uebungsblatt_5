package p1;

public class P1_Main {
    public static void main(String[] args) {

        int x=0;

        System.out.println("While: ");
        while ( x <= 10 ) {
            x = x + 1;
            System.out.println(x);
        }
        System.out.println("");

        System.out.println("For: ");
        for (int i = 1; i <= 11; i++) {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Do While: ");
        int k=0;
        do {
           k++;
           System.out.println(k);
        }while (k<=10);
    }
}
