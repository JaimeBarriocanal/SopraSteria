

import java.util.ArrayList;

public class VisualizarPersonas {

	static ArrayList<Persona> lista = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona(13, "M");
		Persona p2 = new Persona(79, "H");
		Persona p3 = new Persona(14, "H");
		Persona p4 = new Persona(27, "M");
		Persona p5 = new Persona(52, "M");
		Persona p6 = new Persona(18, "H");
		Persona p7 = new Persona(33, "H");
		Persona p8 = new Persona(41, "M");
		Persona p9 = new Persona(67, "M");
		Persona p10 = new Persona(22, "H");

		Persona p11 = new Persona(13, "M");
		Persona p12 = new Persona(79, "H");
		Persona p13 = new Persona(14, "H");
		Persona p14 = new Persona(27, "M");
		Persona p15 = new Persona(52, "M");
		Persona p16 = new Persona(18, "H");
		Persona p17 = new Persona(33, "H");
		Persona p18 = new Persona(41, "M");
		Persona p19 = new Persona(67, "M");
		Persona p20 = new Persona(22, "H");
		
		Persona p21 = new Persona(13, "M");
		Persona p22 = new Persona(79, "H");
		Persona p23 = new Persona(14, "H");
		Persona p24 = new Persona(27, "M");
		Persona p25 = new Persona(52, "M");
		Persona p26 = new Persona(18, "H");
		Persona p27 = new Persona(33, "H");
		Persona p28 = new Persona(41, "M");
		Persona p29 = new Persona(67, "M");
		Persona p30 = new Persona(22, "H");
		
		Persona p31 = new Persona(13, "M");
		Persona p32 = new Persona(79, "H");
		Persona p33 = new Persona(14, "H");
		Persona p34 = new Persona(27, "M");
		Persona p35 = new Persona(52, "M");
		Persona p36 = new Persona(18, "H");
		Persona p37 = new Persona(33, "H");
		Persona p38 = new Persona(41, "M");
		Persona p39 = new Persona(67, "M");
		Persona p40 = new Persona(22, "H");
		
		Persona p41 = new Persona(13, "M");
		Persona p42 = new Persona(79, "H");
		Persona p43 = new Persona(14, "H");
		Persona p44 = new Persona(27, "M");
		Persona p45 = new Persona(52, "M");
		Persona p46 = new Persona(18, "H");
		Persona p47 = new Persona(33, "H");
		Persona p48 = new Persona(41, "M");
		Persona p49 = new Persona(67, "M");
		Persona p50 = new Persona(22, "H");
		
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);
		lista.add(p7);
		lista.add(p8);
		lista.add(p9);
		lista.add(p10);
		
		lista.add(p11);
		lista.add(p12);
		lista.add(p13);
		lista.add(p14);
		lista.add(p15);
		lista.add(p16);
		lista.add(p17);
		lista.add(p18);
		lista.add(p19);
		lista.add(p20);
		
		lista.add(p21);
		lista.add(p22);
		lista.add(p23);
		lista.add(p24);
		lista.add(p25);
		lista.add(p26);
		lista.add(p27);
		lista.add(p28);
		lista.add(p29);
		lista.add(p30);
		
		lista.add(p30);
		lista.add(p32);
		lista.add(p33);
		lista.add(p34);
		lista.add(p35);
		lista.add(p36);
		lista.add(p37);
		lista.add(p38);
		lista.add(p39);
		lista.add(p40);
		
		lista.add(p41);
		lista.add(p42);
		lista.add(p43);
		lista.add(p44);
		lista.add(p45);
		lista.add(p46);
		lista.add(p47);
		lista.add(p48);
		lista.add(p49);
		lista.add(p50);
		
		mayores();
		menores();
		mascMayor();
		femMenor();
		porcentajeMayor();
		porcentajeMujer();
		
	}
	
	private static void mayores() {
		System.out.println("Cantidad de personas mayores de edad: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getEdad()>=18) {
				listaTemp.add(lista.get(i));
			}
		}
		System.out.println(listaTemp.size());
		
	}
	
	private static void menores() {
		System.out.println("Cantidad de personas menores de edad: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getEdad()<18) {
				listaTemp.add(lista.get(i));
			}
		}
		System.out.println(listaTemp.size());
		
	}
	
	private static void mascMayor() {
		System.out.println("Cantidad de personas masculinas mayores de edad: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {		
			if(lista.get(i).getEdad()>=18 && lista.get(i).getSexo().equals("H")) {				
				listaTemp.add(lista.get(i));
			}
		}
		System.out.println(listaTemp.size());
		
	}
	
	private static void femMenor() {
		System.out.println("Cantidad de personas femeninas menores de edad: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {		
			if(lista.get(i).getEdad()<18 && lista.get(i).getSexo().equals("M")) {				
				listaTemp.add(lista.get(i));
			}
		}
		System.out.println(listaTemp.size());
		
	}
	
	private static void porcentajeMayor() {
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {		
			if(lista.get(i).getEdad()>=18) {				
				listaTemp.add(lista.get(i));
			}
		}
		double a = listaTemp.size();
		double b = lista.size();
		System.out.println((a / b) * 100 + " %");
		
	}
	
	private static void porcentajeMujer() {
		System.out.println("Porcentaje que representan las mujeres respecto al total de personas: ");
		ArrayList<Persona> listaTemp = new ArrayList<Persona>();
		for (int i = 0; i < lista.size(); i++) {		
			if(lista.get(i).getSexo().equals("M")) {				
				listaTemp.add(lista.get(i));
			}
		}
		double a = listaTemp.size();
		double b = lista.size();
		System.out.println((a / b) * 100 + " %");
		
	}
	

}
