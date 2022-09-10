import java.util.Scanner;

public class AreaRectangulo {

   // public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el largo");

        double lado =s.nextDouble();
        System.out.println("Introduzca el ancho ");
        double base = s.nextDouble();

        double area = lado*base;

        System.out.println("El area del rectangulo es: "+area);
    }
}
