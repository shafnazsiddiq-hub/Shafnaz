public class PolynomialMultiplication {

    public static void main(String[] args) {
        int[] poly1 = {1, 2, 3};   // 1 + 2x + 3x^2
        int[] poly2 = {4, 5};      // 4 + 5x

        int[] result = multiply(poly1, poly2);

        System.out.print("Resultant Polynomial: ");
        printPolynomial(result);
    }

    static int[] multiply(int[] p1, int[] p2) {
        int[] result = new int[p1.length + p2.length - 1];

        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {
                result[i + j] += p1[i] * p2[j];
            }
        }
        return result;
    }

    static void printPolynomial(int[] poly) {
        for (int i = 0; i < poly.length; i++) {
            if (poly[i] != 0) {
                System.out.print(poly[i] + "x^" + i);
                if (i < poly.length - 1)
                    System.out.print(" + ");
            }
        }
    }
}
