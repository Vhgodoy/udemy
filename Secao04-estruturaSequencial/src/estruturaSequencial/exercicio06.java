package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
	
	public static void main (String[] args) {
		
		float  A, B, C;
		float triangulo, circulo, trapezio, quadrado, retangulo;
		
		double pi; 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		pi = 3.14159;
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		triangulo = A * C / 2;
		circulo =  (float) (pi * Math.pow(C, 2));
		trapezio = (A + B) * C /2;
		quadrado = B * B;
		retangulo = A * B;
		
		
		System.out.printf(""
				+ "TRIANGULO: %.3f "
				+ "%nCIRCULO: %.3f "
				+ "%nTRAPEZIO: %.3f "
				+ "%nQUADRADO: %.3f "
				+ "%nRETANGULO: %.3f",
				triangulo, 
				circulo, 
				trapezio, 
				quadrado, 
				retangulo);
		
		sc.close();
	}

}
