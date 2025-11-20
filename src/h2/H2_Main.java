package h2;

public class H2_Main {
    public static void main(String[] args) {

        int n = 299;
        int digits = 0;
        int[] a = new int [9]; //automatisch mit 0 vorbelegt

        if (n == 0) { //anzahl der ziffern bestimmen
            digits = 1;
        } else {
            int temp = n;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }
        int index = 8;     //füllen von rechts nach links
        int temp = n;

        while (temp > 0) { //ziffern in das array ablegen
            a[index] = temp % 10;  // letzte Ziffer
            temp /= 10;            // entferne letzte Ziffer
            index--;
        }
        System.out.println("digits = " + digits);
        System.out.print("Array a = ");
        for (int value : a) {
            System.out.print(value + " ");
        }


    }
}
