package Atividade;
import java.util.Scanner;
public class Atividade06 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Descobrir qual é mais vantajoso abastecer com gasolina ou alcool?");
		
		System.out.println("Entre com valor do alcool");
		double valoralcool = ler.nextDouble();
		
		System.out.println("Entre com valor da gasolina");
		double valorgasolina = ler.nextDouble();
		
		System.out.println("Entre com o km que o carro faz com a gasolina?");
		double kmgasolina = ler.nextDouble();
		
		System.out.println("Entre com o km que o carro faz com alcool?");
		double kmalcool = ler.nextDouble();
		
		System.out.println("Quantos litros deseja colocar no carro?");
		double quantidadelitros = ler.nextDouble();
		
		double resultadodagasolina = (valorgasolina * quantidadelitros) / kmgasolina;
		
		double resultadodoalcool = (valoralcool * quantidadelitros) / kmalcool;
		
		if(resultadodagasolina > resultadodoalcool ) {
			System.out.println("é mais vantajoso abastecer com alcol");
		}
		else if(resultadodagasolina == resultadodoalcool ) {
			System.out.println("o resultado é o mesmo");
		}
		
		else {
			System.out.println("mais vantajoso abastecer com gasolina");
		}
		}
		
		
		
	
	
			
			

		
		
		
		

	}


