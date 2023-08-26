package Atividade;
import java.util.Scanner;
public class Atividade09 {

	public static void main(String[] args) {
		
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com salario anual");
		double salarioanual = ler.nextDouble();
		
		double valormes = salarioanual/12;
		double valordia = valormes/22;
		double valorhora = valordia/8;
		
		System.out.println("o valo da sua hora é de: + " +valorhora);
		

	}

}
