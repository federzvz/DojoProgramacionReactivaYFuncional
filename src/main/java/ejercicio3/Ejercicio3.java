package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar expresion: ");

        int degree = sc.nextInt();
        System.out.print("Ingrese "+(degree+1)+" coeficentes: ");

        double[] C = new double[degree+1];
        for(int i=0; i<C.length;i++) {
            C[i]=sc.nextDouble();
        }

        double derivative[] = new double[C.length-1];
        for(int i=0;i<derivative.length;i++){
            derivative[i] = C[i]*(C.length - 1 -i );
        }
}
