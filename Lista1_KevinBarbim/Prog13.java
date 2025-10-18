import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double Dolar, ValorHoje, Reais;
		
		System.out.println(" Digite os dolares: ");
		Dolar=leitor.nextDouble();
		System.out.println(" Digite o valor hoje: ");	
		ValorHoje=leitor.nextDouble();
		
		Reais = Dolar*ValorHoje;
		
		System.out.println(" Voce tem em R$: "+Reais);
		
		
		leitor.close();
		System.exit(0);
	}

}
