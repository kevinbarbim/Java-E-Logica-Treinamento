import java.util.Scanner;

public class Programa13 {
 public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //variaveis
         final double LIMITE1 = 1000, LIMITE2 = 2500;
         final double FAIXA1 = 0.25, FAIXA2 = 0.20, FAIXA3 = 0.15;
         double salario, aumento;

        System.out.println("Aumento salarial");

        System.out.println("\nInforme o valor do salario: ");
        salario = leitor.nextDouble();

        if (salario<LIMITE1)
        aumento = salario+(salario*FAIXA1);
        else
            if(salario<=LIMITE2)
            aumento = salario+(salario*FAIXA2);
            else
            aumento = salario+(salario*FAIXA3);

        
         System.out.println("Salario Final: R$"+aumento);

         leitor.close();
         System.exit(0);   
}
}