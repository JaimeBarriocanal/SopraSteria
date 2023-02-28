

import java.util.Scanner;

public class CalcularSalario {

	private static double horasTrabajadas;
	private static double tarifa;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca horas trabajadas: ");
		horasTrabajadas = reader.nextDouble();
		
		System.out.println("Introduzca tarifa: ");
		tarifa = reader.nextDouble();		
		
		calcularSueldo(horasTrabajadas, tarifa);
	}
	
	private static void calcularSueldo(double horasTrabajadas, double tarifa) {
		if(horasTrabajadas > 40) {
			double horasExtra = horasTrabajadas - 40;
			double tarifaExtra = tarifa + tarifa * 0.5;
			System.out.println("Salario a pagar: " + (40 * tarifa + horasExtra * tarifaExtra));
		} else if(0 <= horasTrabajadas && horasTrabajadas <= 40){
			System.out.println("Salario a pagar: " + horasTrabajadas * tarifa);
		}
		
	}
	
	
}
