package punto3;

import javax.swing.JOptionPane;
public class Punto3 {

    public static void main(String[] args) {
        int edad,edadsuma = 0, estaturasuma = 0, cam18a = 0,cam175m = 0;
        float altura,edadmedia,estaturamedia;
        boolean x = true;
        if(x==true){
            for(int i = 1; i<=5 ; i++){
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del alumno."));
                altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del alumno en centimetros."));
                edadsuma += edad;
                estaturasuma += altura;
                if(edad>18){
                    cam18a++;
                } else if (edad<=0){
                    JOptionPane.showMessageDialog(null, "®ERROR® La edad debe ser mayor a 0.");
                    x = false;
                }
                if(altura>175){
                    cam175m++;
                } else if(altura<=10) {
                    JOptionPane.showMessageDialog(null, "ER7ROR! Ese alumno ya es muy enano.");
                    x = false;
                }
            }
        }
        edadmedia = (float)(edadsuma/5);
        estaturamedia = (float) (estaturasuma/5);
        JOptionPane.showMessageDialog(null, "La edad promedio de los alumnos es de \"" +edadmedia+ "\"\n"
                + "La cantidad de alumnos mayores a 18 años es de \"" +cam18a+ "\"\n"
                + "La estatura promedio de los alumnos es de \"" +estaturamedia+ "\"\n"
                + "La cantidad de alumnos que miden mas de 1.75 metros es de \"" +cam175m+ "\"");

    }
}