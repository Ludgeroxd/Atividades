package Atividade;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		final double gasolina = 4.75;
		final double alcool = 4.00;
		final double diesel = 3.50;
		String compraUsuario;
		double quantidadeEMdinheiro;
		
		//progama
	
		
		System.out.println("Selecione o combustível");
		compraUsuario = ler.next();
		switch (compraUsuario) {
		case "Gasolina":
			System.out.println("Quantos reais deseja por?");
			quantidadeEMdinheiro = ler.nextDouble();
			System.out.println("Quantidade de litros " + quantidadeEMdinheiro/gasolina);
			break;
		case "Alcool":
			System.out.println("Quantos reais deseja por?");
			quantidadeEMdinheiro = ler.nextDouble();
			System.out.println("Quantidade de litros " + quantidadeEMdinheiro/alcool);
			break;
		case "Diesel":
			System.out.println("Quantos reais deseja por?");
			quantidadeEMdinheiro = ler.nextDouble();
			System.out.println("Quantidade de litros " + quantidadeEMdinheiro/diesel);
			break;
		default:
			System.out.println("Não temos esse combusítvel.");
		}

	}

}
