

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Número: ");
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Lista par:");
			for (int i = num; i >= 0; i--) {
				if(i % 2 == 0) {
					System.out.println(i);
				}			
			}
		} else if(num % 2 != 0){
			System.out.println("Lista impar:");
			for (int i = num; i >= 1; i--) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
	}

}
