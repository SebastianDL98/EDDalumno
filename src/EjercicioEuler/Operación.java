package EjercicioEuler;

import java.util.Scanner;

public class Operación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		 long n ;
	        long a5, b5, c5, d5, e5;
	       // do {
	        Scanner entra = new Scanner(System.in);
	        System.out.println("ingrese un numero para relaizarle la conjetura de Euler: ");
	        n = entra.nextLong();
	        for (long e = 1; e <= n; e++) {
	            e5 = e*e*e*e*e;
	            for (long a = 1; a <= n; a++) {
	                a5 = a*a*a*a*a;
	                if (a5 + a5 + a5 + a5 > e5) break;

	                for (long b = a; b <= n; b++) {
	                    b5 = b*b*b*b*b;
	                    if (a5 + b5 + b5 + b5 > e5) break;

	                    for (long c = b; c <= n; c++) {
	                        c5 = c*c*c*c*c;
	                        if (a5 + b5 + c5 + c5 > e5) break;

	                        for (long d = c; d <= n; d++) {
	                            d5 = d*d*d*d*d;
	                            if (a5 + b5 + c5 + d5  > e5) break;
	                            if (a5 + b5 + c5 + d5 == e5)
	                                System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5"); 
	                        }
	                    }
	                }
	            }
	            
	        }
	       // Scanner termina = new Scanner(System.in);
	       // System.out.println("\n\n pulse 0 si desea terminar de calcular conjeturas, sino pulse enter \n\n");
	       // x=termina.nextInt();
		//}while(x<1);
	
	}

	}


