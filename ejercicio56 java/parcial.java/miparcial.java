import java.util.Scanner;

public class miparcial {
    public static void main(String[]args) {
        int I;
        double MAX, MIN, NUMERO;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        NUMERO= leer.nextDouble();
        MAX=NUMERO;
        MIN=NUMERO;
        for (I=2; I<= 100; I++){
            System.out.println("ingrese el siguiente numero:");
            NUMERO= leer.nextDouble();
            if (NUMERO>MAX){
            }else if
         (NUMERO<MIN){
            MIN=NUMERO;
                }
                System.out.println("maximo:"+ MAX+ "minimo"+ MIN);
            }
        }
    }



