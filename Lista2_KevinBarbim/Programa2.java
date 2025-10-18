import java.util.Scanner;

public class Prog02_Lista02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int Numero, Resto;
		
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
