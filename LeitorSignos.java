import java.util.Scanner;
public class LeitorSignos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mes, dia;
		System.out.println("Digite o m�s em n�mero, de 1 at� 12:");
		mes = in.nextInt();
		System.out.println("Digite o dia:");
		dia = in.nextInt();
		System.out.println("Seu signo �:");
		switch(mes) {
			case 1:
				if(dia<=20) {
					System.out.println("Capric�rnio");
				} else if(dia<=31){
					System.out.println("Aqu�rio");
				}
				break;
			case 2:
				if(dia<=19) {
					System.out.println("Aqu�rio");
				} else if(dia<=28){
					System.out.println("Peixes");
				}
				break;
			case 3:
				if(dia<=20) {
					System.out.println("Peixes");
				} else if(dia<=31){
					System.out.println("�ries");
				}
				break;
			case 4:
				if(dia<=20) {
					System.out.println("�ries");
				} else if(dia<=30){
					System.out.println("Touro");
				}
				break;
			case 5:
				if(dia<=20) {
					System.out.println("Touro");
				} else if(dia<=31){
					System.out.println("G�meos");
				}
				break;
			case 6:
				if(dia<=20) {
					System.out.println("G�meos");
				} else if(dia<=30){
					System.out.println("C�ncer");
				}
				break;
			case 7:
				if(dia<=21) {
					System.out.println("C�ncer");
				} else if(dia<=31){
					System.out.println("Le�o");
				}
				break;
			case 8:
				if(dia<=22) {
					System.out.println("Le�o");
				} else if(dia<=31){
					System.out.println("Virgem");
				}
				break;
			case 9:
				if(dia<=22) {
					System.out.println("Virgem");
				} else if(dia<=30){
					System.out.println("Libra");
				}
				break;
			case 10:
				if(dia<=22) {
					System.out.println("Libra");
				} else if(dia<=31){
					System.out.println("Escorpi�o");
				}
				break;
			case 11:
				if(dia<=21) {
					System.out.println("Escorpi�o");
				} else if(dia<=30){
					System.out.println("Sagit�rio");
				}
				break;
			case 12:
				if(dia<=20) {
					System.out.println("Sagit�rio");
				} else if(dia<=31){
					System.out.println("Capric�rnio");
				}
				break;
			default:
				System.out.println("Esse m�s, n�o existe.");
		}
		in.close();
	}
}
