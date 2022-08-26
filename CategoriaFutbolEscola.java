import java.util.Scanner;
public class CategoriaFutbolEscola {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade:");
		idade = in.nextInt();
		switch(idade) {
			case 6:
				System.out.println("Categoria Dente de leite.");
				break;
			case 7:
				System.out.println("Categoria Júnior.");
				break;
			case 8:
				System.out.println("Categoria Júnior Max.");
				break;
			case 9:
				System.out.println("Categoria Júnior Master.");
				break;
			case 10:
				System.out.println("Categoria Master.");
				break;
			default:
				System.out.println("Não permitimos idades maiores que 10 anos, nem menores que 6 anos.");
		}
		in.close();
	}
}