import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int Numero;
		
		System.out.println("Múltiplo de 5");
		
		System.out.println("Digite seu número: ");
		Numero=leitor.nextInt();
		
		
		if(Numero%5==0) {
			System.out.println("Seu número é múltiplo de 5 ");
		}
		
		else {
			System.out.println("Seu número não é múltiplo de 5 ");
		}
		
		leitor.close();
		System.exit(0);
		
	}

}
