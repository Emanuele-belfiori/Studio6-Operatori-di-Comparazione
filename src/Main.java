public class Main {
    public static void main(String[] args) {
        System.out.println("Operatori di comparazione");

        /*
         * Operatori di Comparazione
         *
         * - Operatori:
         * >  (maggiore)
         * >= (maggiore uguale)
         * <  (minore)
         * <= (minore uguale)
         * == (
         * != (
         *
         */

        int n = 10;
        int o = 21;
       // boolean risultato2= 3 > 10;  // False (fino a 10 compreso il risultato sarà sempre False)
       // boolean risultato2= 3 >= 10; // False (fino a 9 sarà sempre False, 10 ci darebbe True)
       // boolean risultato2= 3 < 10;  // True (fino a 9 sarà sempre True, 10 ci darebbe False)
       // boolean risultato2= 3 <= 10; // True (fino a 10 compreso il risultato sarà sempre True)
       // boolean risultato2= 3 == 10; // False (compara che il numero 3 non è uguale a 10)
        boolean risultato2= 3 != 10;   // True (afferma che il numero 3 è diverso da 10)

        // Per esercitarsi basta decommentare la riga interessata e fare le varie prove!
        System.out.println(risultato2);
    }
}