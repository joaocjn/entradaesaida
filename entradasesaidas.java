import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome? ");
		String nome = scanner.nextLine();	
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Qual sua comida favorita? ");
		String comida = scanner.nextLine();
		
		System.out.println("Ol� "+nome);
		
		System.out.println("Voc� tem "+idade+" anos");
		
		System.out.println("Sua comida favorita � "+comida);
	}

}
