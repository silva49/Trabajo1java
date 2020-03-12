package punto2;

import java.util.Scanner;

public class Punto2 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese valor para mostrar la tabla de multiplicar hasta 10");

        int valor = teclado.nextInt();

        int i; //for

        for (i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
    }


