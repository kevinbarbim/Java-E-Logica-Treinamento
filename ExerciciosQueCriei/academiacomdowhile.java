import java.util.Scanner;
//  PROGRAMA QUE IRÁ RECEBER O CADASTRO DE 4 CLIENTES DE UMA ACADEMIA E ME RETORNAR: 1) A MEDIA DE IDADE, PESO EM KG E ALTURA EM METROS. 2) O CLIENTE MAIS PESADO E O MAIS LEVE. 3) A % DE PESSOAS QUE SAO IGUAIS OU MAIORES E AS MENORES QUE 1,70 METROS. 4) PORCENTAGEM DE PESSOAS DO SEXO MASCULINO E DO SEXO FEMININO
public class Academiacomdowhile {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    final Integer clientes = 4, faixa1=170;
    Integer idade, i = 0;
    Double peso, altura;
    Double somaidade=0.0,somapeso=0.0,somaaltura=0.0, maiorpeso=0.0 ,menorpeso=10000.0, contmaior=0.0, contmenor=0.0, contm=0.0, contf=0.0;
    char sexo;
    do{
    System.out.println("Digite a idade do cliente: ");
      idade = leitor.nextInt();
    System.out.println("Digite o peso do cliente em KG: ");
      peso = leitor.nextDouble();
    System.out.println("Digite a altura do cliente em METROS: ");
      altura = leitor.nextDouble();
    System.out.println("Digite o sexo do cliente (M) para masculino e (F) para feminino: ");
      sexo = leitor.next().toLowerCase().charAt(0);
      //item 1 ) medias
      somaidade = somaidade+idade;
      somapeso = somapeso+peso;
      somaaltura = somaaltura+altura;
      //item 2) cliente mais pesado e mais leve
      if (peso>maiorpeso) {
        maiorpeso=peso;
      }
      if (peso<menorpeso) {
        menorpeso=peso;
      }
      //item 3) % de pessoas maiores e menores que 1,70M
      if (altura>=faixa1) {
        contmaior++;
      }
      else{
        contmenor++;
      }
      //item 4) % de clientes homens e mulheres
      if (sexo=='m') {
        contm++;
      }
      else if (sexo=='f') {
       contf++; 
      }i++;
    }while(i<clientes);
    
    System.out.println("\n\nMédia de idade: "+somaidade/clientes+" Anos");
    System.out.println("Média de altura: "+somaaltura/clientes+"M");
    System.out.println("Média de peso: "+somapeso/clientes+"KGs");
    System.out.println("Cliente mais pesado: "+maiorpeso+"KGs");
    System.out.println("Cliente mais leve: "+menorpeso+"KGs");
    System.out.println("% de clientes maiores que 1,70 de altura: "+contmaior/clientes*100+"%");
    System.out.println("% de clientes menores que 1,70 de altura: "+contmenor/clientes*100+"%");
    System.out.println("% de clientes homens: "+contm/clientes*100+"%");
    System.out.println("% de clientes mulheres: "+contf/clientes*100+"%\n");
    leitor.close();
  }
}
