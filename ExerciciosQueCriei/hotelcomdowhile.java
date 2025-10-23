import java.util.Scanner;
//  PROGRAMA QUE IRÁ RECEBER O CADASTRO DE 5 CLIENTES DE UM HOTEL E ME RETORNAR: 1) A MEDIA DE IDADE, PESO E SALARIO. 2) O CLIENTE MAIS PESADO E O MAIS LEVE. 3) A % DE PESSOAS QUE GANHAM MAIS OU MENOS QUE 5000 REAIS. 4) PORCENTAGEM DE PESSOAS DO SEXO MASCULINO E DO SEXO FEMININO 
public class hotelcomdowhile {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        //constantes
        final Integer clientes=5, faixa1=5000;
        //variaveis
        Integer idade, i=0;
        Double peso, salario, maiorpeso=0.0,menorpeso=1000.0, somaidade=0.0, somapeso=0.0, somasalario=0.0, cont1=0.0, cont2=0.0, cont_masculino=0.0, cont_feminino=0.0;
        char sexo;

        do{
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Digite seu peso em KG: ");
        peso = leitor.nextDouble();
            
        System.out.println("Digite seu salário: ");
        salario = leitor.nextDouble();
        
        System.out.println("Digite seu sexo: (M) para masculino e (F) para feminino");
        sexo = leitor.next().toLowerCase().charAt(0);

        //descobrir media das caracteristicas
        somaidade=somaidade+idade;
        somapeso=somapeso+peso;
        somasalario=somasalario+salario;

        //descobrir o mais gordo e o mais magro

        if (peso>maiorpeso) {
            maiorpeso=peso;
        }
        if (peso<menorpeso) {
            menorpeso=peso;
        }

        //descobrir a % que ganha mais e menos de 5000 reais
        
        if (salario>faixa1) {
            cont1++;
        }
        else{
            cont2++;
        }

        // descobrir a % que é homem ou mulher
           if(sexo=='m'){
            cont_masculino++;
        }
        else if(sexo=='f'){
            cont_feminino++;
        }
        i++;
        }while (i<clientes);
            
        
        System.out.println("\n\nMédia de idade dos clientes: "+somaidade/clientes+" Anos");
        System.out.println("Média de peso dos clientes: "+somapeso/clientes+"KGs");
        System.out.println("Média de salario dos clientes: R$"+somasalario/clientes);
        System.out.println("Cliente mais pesado: "+maiorpeso+"KGs");
        System.out.println("Cliente mais leve: "+menorpeso+"KGs");
        System.out.println("Porcentagem de clientes que recebem mais de 5000 reais: "+cont1/clientes*100+"%");
        System.out.println("Porcentagem de clientes que recebem menos de 5000 reais: "+cont2/clientes*100+"%");
        System.out.println("Porcentagem de clientes homens: "+cont_masculino/clientes*100+"%");
        System.out.println("Porcentagem de clientes mulheres: "+cont_feminino/clientes*100+"%\n");

        leitor.close();
    }
}
