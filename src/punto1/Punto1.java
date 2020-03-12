package punto1;
import java.util.Scanner;
public class Punto1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in) ;

        System.out.println("ingrese un numero aqui");

        int numero = teclado.nextInt();


        if (numero > 999 && numero <10000) {

            int  a=numero/1000;
            int  b=numero-(a*1000);
            int c=b/100;
            int d=b-(c*100);
            int e=d/10;
            int f=d-(e*10);
            int g=(f*1000)+(e*100)+(c*10)+a;
            System.out.println("este es el numero invertido "+g);

        }




    }

}

