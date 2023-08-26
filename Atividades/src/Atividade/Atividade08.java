package Atividade;
import java.util.Scanner;
public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos calcular o valor das horas extras trabalhadas");
		
		
		System.out.println("Entre com a quantidade de horas normais trabalhadas");
		double quantidadehoras = ler.nextDouble();
		
		System.out.println("Entre com a quantidade de horas normais trabalhadas");
		double quantidadehorasextras = ler.nextDouble();
		
		System.out.println("Entre com a quantidade de horas normais trabalhadas");
		double precohoranormal = ler.nextDouble();
		
		double valorhoranormal = quantidadehoras * precohoranormal ;
		double valorhoraextra = quantidadehorasextras * (((precohoranormal/100)*50)+precohoranormal ) ;
		double valorcompleto =  valorhoranormal + valorhoraextra;
		
		System.out.println("vai receber o valor total de RS: " +valorcompleto);

		




	}

}
