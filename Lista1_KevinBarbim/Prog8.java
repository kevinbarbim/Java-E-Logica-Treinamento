import java.util.Scanner;

public class Prog8 {

	
	
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
		final double PESO1 = 0.5, PESO2 = 0.3, PESO3 = 0.2, MEDIA_APROVACAO = 6.0;
		double nota1, nota2, nota3, media;
		
		System.out.println("Prog8 - Média ponderada ");
		
		System.out.println("Informe a nota 1: ");
		nota1 = leitor.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		nota2 = leitor.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		nota3 = leitor.nextDouble();
		
		media = nota1*PESO1 +nota2*PESO2 +nota3*PESO3;
		
		System.out.println("Sua média é: "+ media);
		
		if(media >= MEDIA_APROVACAO) {
			System.out.println("Parabéns fostes aprovado! ");
		}
		else {
			System.out.println("Reprovado!!!!! ");
			System.out.println("Ce e um bostaaaaaaaaa ");
		}
		
		leitor.close();
		System.exit(0);
	}

}
