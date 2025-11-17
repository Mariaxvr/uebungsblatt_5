package p2;

import java.util.Arrays;

public class P2_Main {
    public static void main(String[] args) {

        int[] numbers = {4,2,3,4,1};
        int max = 0;
        int minIndex = 0;
        int i;

        max = numbers[0];
        minIndex = 0;
        for (i = 1; i < numbers.length; i++) { //damit es nur bis zum ende des arrays geht undnicht irrgendwelche die es nicht gibt
            if (numbers[i] > max) { //wenn numbers i größer ist als numers null dann setzten wir max auf numbers i und wenn es nicht größer ist bleibt es nummers 0
                max = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Größter Wert: " + max);
        System.out.println("Kleinster Index: " + minIndex);
        }
    }

