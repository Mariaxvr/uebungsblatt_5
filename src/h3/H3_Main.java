package h3;

public class H3_Main {
    public static void main(String[] args) {

        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                new int[15]   // zweite Zeile automatisch mit 0 belegt
        };
        int input = 408;
        //

        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];

            if (rest >= wert) {
                einheiten[1][i] = rest / wert;  // Anzahl der benötigten Scheine/Münzen
                rest = rest % wert;             // Restbetrag aktualisieren
            }
        }
        System.out.println("Betrag: " + input + " Cent");
        System.out.println("Zerlegung:");
        for (int i = 0; i < einheiten[0].length; i++) {
            System.out.printf("%5d Cent: %d Stück%n", einheiten[0][i], einheiten[1][i]);
        }
    }
}
