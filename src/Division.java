/**
 *
 *
 * @author melinda

 */
public class Division {
    String a = "ana are mere";

    public static void main(String[] args) {
        int a = 1;
        //int b = a++;
        int b = ++a;
        System.out.println("a: " + a + " b: "+ b);


        divide(1, 2);
        divide(4, 1);
        divide(1, 0);
    }

    /**
     * Metoda care afiseaza impartirea a doua numere de tip boolean
     * @param a este impartitorul
     * @param b este deimpartirul
     */
    public static void divide(double a, double b) {
        if (b != 0) {
            double rezultat =  a / b;
            System.out.println(rezultat);
        } else {
            System.out.println("Nu se poate face imparirea la 0");
        }
    }
}
