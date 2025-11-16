package h1;

public class H1_Main {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5};

        System.out.println("Vorher: ");
        for (int value : myArray) {
            System.out.println(value); //wert vor dem umderehen
        }
        System.out.println(); //leere zeile

        for (int i = 0; i< myArray.length/2; i++){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println("Nachher: ");
        for (int value : myArray) {
            System.out.println(value);
        }

    }
}
