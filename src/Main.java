import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

        }
        System.out.println("Hola :) ¿Qué tal?");

        // Método de calcular la área de un triángulo

        Scanner s = new Scanner(System.in);
        System.out.println("Enter width:");
        double b = s.nextDouble();
        System.out.println("Enter height:");
        double h = s.nextDouble();

        double area = (b*h)/2;
        System.out.println("Area del triángulo: " + area);
    }
}
