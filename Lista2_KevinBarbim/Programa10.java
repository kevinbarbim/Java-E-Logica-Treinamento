import java.util.Scanner;
public class Programa10{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        final int LIMITE1 = 15, LIMITE2 = 20;
        final double PRECO1 = 2.37, PRECO2 = 3.42, PRECO3 = 5;
        final double ICMS = 0.25, PIS = 0.077, COFINS = 0.0356;

//variaveis
        int consumo;
        double valorGas, valorIcms, valorPis, valorCofins, conta;

        System.out.println("Cálculo de Gás");

        System.out.println("Informe o consumo: ");
        consumo = leitor.nextInt();

        if (consumo<=LIMITE1)
        valorGas = consumo*PRECO1;
        else
            if(consumo<=LIMITE2)
            valorGas = consumo*PRECO2;
            else
            valorGas = consumo*PRECO3;
         
        valorIcms = valorGas * ICMS;
        valorPis = valorGas * PIS;
        valorCofins= valorGas * COFINS;

        conta = valorGas+valorIcms+valorPis+valorCofins;



         System.out.println("Gás: R$"+ valorGas);
         System.out.println("Valor ICMS: R$"+ valorIcms);
         System.out.println("Valor PIS: R$"+ valorPis);
         System.out.println("Valor Cofins: R$"+ valorCofins);
         System.out.println("Conta: R$"+ conta);

         leitor.close();
         System.exit(0);
    }
}