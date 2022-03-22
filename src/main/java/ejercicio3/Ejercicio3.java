package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception{
        int coeficiente, potencia,x,xc,xp;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Derivar funciones de la forma ax^b \n");
        do {
            System.out.println("Escribe el coeficiente:");
            coeficiente = teclado.nextInt();
            System.out.println("Escribe la potencia:");
            potencia = teclado.nextInt();
            xc = coeficiente*potencia;
            xp = potencia - 1;
            System.out.println("La derivada es: "+xc+"x^"+xp+"\n");
            System.out.println("Sacar otra derivada 1.si / 2.no");
            x = teclado.nextInt();
        }
        while (x==1);
            /*{
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
        }*/
}
}
