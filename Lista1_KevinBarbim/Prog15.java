import java.util.Scanner;

	public class Prog15 {

		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			double PontoCand1, PontoCand2, PontoCand3, Soma, ValorC1, ValorC2, ValorC3;
			final double Premio = 780000;
			
			System.out.println(" Digite os pontos do Candidato 1: ");
			PontoCand1=leitor.nextDouble();
			
			System.out.println(" Digite os pontos do Candidato 2: ");
			PontoCand2=leitor.nextDouble();
			
			System.out.println(" Digite os pontos do Candidato 3: ");
			PontoCand3=leitor.nextDouble();
			
			Soma = PontoCand1+PontoCand2+PontoCand3;
			
			ValorC1 = (PontoCand1/Soma)*Premio;
			ValorC2 = (PontoCand2/Soma)*Premio;
			ValorC3 = (PontoCand3/Soma)*Premio;
			
			System.out.println(" Candidato 1 ganha R$: "+ValorC1);
			System.out.println(" Candidato 2 ganha R$: "+ValorC2);
			System.out.println(" Candidato 3 ganha R$: "+ValorC3);
			leitor.close();
			System.exit(0);
		}

	}


