import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //variaveis
         final double IDADEMINIMA = 18, ALTURAMINIMA = 1.75, PESOMINIMO = 50, PESOMAXIMO = 80;
         int idade;
         double altura, peso;

        System.out.println("Exigencias emprego");

        System.out.println("\nInforme a sua idade: ");
        idade = leitor.nextInt();
        System.out.println("\nInforme a sua altura: ");
        altura = leitor.nextDouble();
        System.out.println("\nInforme o seu peso: ");
        peso = leitor.nextDouble();

        if (idade>IDADEMINIMA | altura>=ALTURAMINIMA | PESOMAXIMO<=peso && PESOMINIMO>=peso)
        System.out.println("APROVADO");
        else
            System.out.println("REPROVADO");


         leitor.close();
         System.exit(0);   
}

}
