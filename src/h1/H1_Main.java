package h1;

public class H1_Main {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5};

        System.out.println("Vorher: ");
        for (int value : myArray) { // für jedes element in myarray, speichere es in value
            System.out.println(value); //wert vor dem umderehen
        }
        System.out.println(); //leere zeile (zeilenumbruch)

        //array umdrehen
        for (int i = 0; i< myArray.length/2; i++){  // durch 2 weil Schleife läuft nur bis zur hälfte des arrays (sonst würden sie sich wieder umderhen)
            int temp = myArray[i];  // aktuellen wert in x speichern (vorne)
            myArray[i] = myArray[myArray.length-1-i]; // hinten nach vorne kopieren (zb. myarray[0] = my array[4] oder myarray[1] = myarray[3]
            myArray[myArray.length-1-i] = temp; // vorne (gespeichert) nach hinten setzen (i = 0; myarray[4] = temp
        }
        System.out.println("Nachher: ");
        for (int value : myArray) {
            System.out.println(value); // ausgeben der gedrehten werte
        }

    }
}
