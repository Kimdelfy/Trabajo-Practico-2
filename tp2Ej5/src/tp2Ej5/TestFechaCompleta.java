package tp2Ej5;

import java.util.Scanner;
public class TestFechaCompleta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		FechaCompleta dia1 = new FechaCompleta(00,00,0000);
		FechaCompleta dia2 = new FechaCompleta(00,00,0000);
		
		System.out.println(" Ingrese la primera fecha con el siguiente formato aaaa/mm/dd: ");
		
		System.out.print("Año (aaaa): ");
		int a1 = entrada.nextInt();
		dia1.setAño(a1);
		
		System.out.print("Mes (mm): ");
		int m1 = entrada.nextInt();
		dia1.setMes(m1);
		
		System.out.print("Dia (dd): ");
		int d1 = entrada.nextInt();
		dia1.setDia(d1);
		
		System.out.println(" Ingrese la segunda fecha con el siguiente formato aaaa/mm/dd: ");
		
		System.out.print("Año (aaaa): ");
		int a2 = entrada.nextInt();
		dia2.setAño(a2);
		
		System.out.print("Mes (mm): ");
		int m2 = entrada.nextInt();
		dia2.setMes(m2);
		
		System.out.print("Dia (dd): ");
		int d2 = entrada.nextInt();
		dia2.setDia(d2);
		
		dia1.compara(dia2);
		
	}

}
