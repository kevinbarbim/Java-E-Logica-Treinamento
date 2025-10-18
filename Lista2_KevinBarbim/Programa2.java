import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int Numero;
		
		System.out.println("Par ou Impár");
		
		System.out.println("Digite seu número: ");
		Numero=leitor.nextInt();
		
		
		if(Numero%2==0) {
			System.out.println("Seu número é PAR ");
		}
		
		else {
			System.out.println("Seu número é Impár ");
		}
		
		leitor.close();
		System.exit(0);
		
	}

}
