import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double Fahrenheit, Celsius;
		
		System.out.println("Digite os graus em fahrenheit: ");
		Fahrenheit = leitor.nextDouble();
		
		Celsius = (Fahrenheit-32)/1.8;
		
		System.out.println(" O bagulho deu em celsius: " +Celsius);
		
		if(Celsius>=30) {
			System.out.println(" TA CALORRRRRRRRR ");
		}
		else if(Celsius >=20) {
			System.out.println(" TA OK ");
		}
		else {
			System.out.println(" QUE FRIACA DA DISNARA ");
		}
	
		leitor.close();
		System.exit(0);
	}

}
