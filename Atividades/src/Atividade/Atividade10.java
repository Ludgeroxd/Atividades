package Atividade;
import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("calculo valor real de ter um carro");
		
		
		System.out.println("Entre com valor do litro da gasolina");
		double valordagasolina = ler.nextDouble();
		
		System.out.println("Quantos km o carro faz por litros de gasolina");
		double kmlitrogasolina = ler.nextDouble();
		
		
		System.out.println("valor troca de oleo");
		double valortrocadeoleo = ler.nextDouble();
		
		
		System.out.println("valor do seguro aual");
		double valorseguroanual = ler.nextDouble();
		
		System.out.println("valor do ipva");
		double valoripva = ler.nextDouble();
		
		System.out.println("valor da revisão");
		double valorrevisao = ler.nextDouble();
		
		System.out.println("valor de consertos");
		double valorconsertos = ler.nextDouble();
		
		System.out.println("valor enventual");
		double valoreventoal = ler.nextDouble();
		
		double valorgasolinamensal = kmlitrogasolina*valordagasolina;
		double valortotal = valorgasolinamensal + valortrocadeoleo + valorseguroanual + valoripva + valorrevisao + valorconsertos + valoreventoal;  
		
		
		System.out.println("o valor gasto para matar o carro em um mes é" +valortotal);


		
		
		
		
	}

}
