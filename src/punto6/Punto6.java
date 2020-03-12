package punto6;
import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

      int numero,i;
        System.out.println("ingrese un numero ");
        numero = teclado.nextInt();
           i=1;
        System.out.println("los numeros son");
        System.out.println("");
        while (i<=numero) {

            System.out.println(i);
            i++;
    }
}
    }