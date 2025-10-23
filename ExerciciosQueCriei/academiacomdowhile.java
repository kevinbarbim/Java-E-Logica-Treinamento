import java.util.Scanner;
//  PROGRAMA QUE IRÁ RECEBER O CADASTRO DE 4 CLIENTES DE UMA ACADEMIA E ME RETORNAR: 1) A MEDIA DE IDADE, PESO EM KG E ALTURA EM CENTIMETROS. 2) O CLIENTE MAIS PESADO E O MAIS LEVE. 3) A % DE PESSOAS QUE SAO MAIORES OU MENORES QUE 1,70 METROS. 4) PORCENTAGEM DE PESSOAS DO SEXO MASCULINO E DO SEXO FEMININO
public class academiacomdowhile {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    final int clientes = 4, i = 0;
    int idade;
    double peso
    do{
    System.out.println("Digite a idadade do cliente: ");
      idade = leitor.nextInt();
    System.out.println("Digite o peso do cliente em KG: ");
      peso = leitor.nextDouble();

    }while(i<clientes);

    
  }
}
