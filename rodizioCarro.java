package rodizioCarro;
import java.util.Scanner;
public class rodizioCarro {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int nPlaca;
		System.out.println("Escreva o último digito da placa do seu veículo:");
		nPlaca= in.nextInt();
		switch(nPlaca) {
			case 1:
			case 2:
				System.out.println("Segunda é rodizio.");
				break;
			case 3:
			case 4:
				System.out.println("Terça é rodizio.");
				break;
			case 5:
			case 6:
				System.out.println("Quarta é rodizio.");
				break;
			case 7:
			case 8:
				System.out.println("Quinta é rodizio.");
				break;
			case 9:
			case 0:
				System.out.println("Sexta é rodizio.");
				break;
			default:
				System.out.println("Inválido.");
		}
		in.close();
	}
}
