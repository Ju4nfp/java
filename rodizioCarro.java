package rodizioCarro;
import java.util.Scanner;
public class rodizioCarro {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int nPlaca;
		System.out.println("Escreva o �ltimo digito da placa do seu ve�culo:");
		nPlaca= in.nextInt();
		switch(nPlaca) {
			case 1:
			case 2:
				System.out.println("Segunda � rodizio.");
				break;
			case 3:
			case 4:
				System.out.println("Ter�a � rodizio.");
				break;
			case 5:
			case 6:
				System.out.println("Quarta � rodizio.");
				break;
			case 7:
			case 8:
				System.out.println("Quinta � rodizio.");
				break;
			case 9:
			case 0:
				System.out.println("Sexta � rodizio.");
				break;
			default:
				System.out.println("Inv�lido.");
		}
		in.close();
	}
}
