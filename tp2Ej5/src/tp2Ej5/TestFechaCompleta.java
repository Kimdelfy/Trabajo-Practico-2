package tp2Ej5;

import java.util.Scanner;
public class TestFechaCompleta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		FechaCompleta dia1 = new FechaCompleta(00,00,0000);
		FechaCompleta dia2 = new FechaCompleta(00,00,0000);
		
		System.out.println(" Ingrese la primera fecha con el siguiente formato aaaa/mm/dd: ");
		
		System.out.print("A�o (aaaa): ");
		int a1 = entrada.nextInt();
		dia1.setA�o(a1);
		
		System.out.print("Mes (mm): ");
		int m1 = entrada.nextInt();
		dia1.setMes(m1);
		
		System.out.print("Dia (dd): ");
		int d1 = entrada.nextInt();
		dia1.setDia(d1);
		
		System.out.println(" Ingrese la segunda fecha con el siguiente formato aaaa/mm/dd: ");
		
		System.out.print("A�o (aaaa): ");
		int a2 = entrada.nextInt();
		dia2.setA�o(a2);
		
		System.out.print("Mes (mm): ");
		int m2 = entrada.nextInt();
		dia2.setMes(m2);
		
		System.out.print("Dia (dd): ");
		int d2 = entrada.nextInt();
		dia2.setDia(d2);
		
		dia1.compara(dia2);
		
		long cant = dia1.cantidadDias(dia2);
		System.out.println("La cantidad de dias entreambas fechas es: "+ cant);
		
		System.out.print("Ingrese la cantidad de dias a sumar o restar a la fecha 1 ingresada");
		int dia= entrada.nextInt();
		System.out.println("La fecha nueva es: " +dia1.suma(dia).toString());
		
		dia1.diaSemana();
	}

}
