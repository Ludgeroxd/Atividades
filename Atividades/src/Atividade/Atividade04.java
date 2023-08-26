package Atividade;
import java.util.Scanner;
public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valordacompra;
		double valordaparcela;
		double valorparcelado;
		
		//PROGAMA
		
		System.out.println("Entre com a quantidade de parcelas");
		int quantidadeParcelas = ler.nextInt();
		switch (quantidadeParcelas) {
		case 1:
			System.out.println("Qual é o valor da compra?");
			valordacompra = ler.nextDouble();
			valordaparcela = valordacompra - (valordacompra * (0.1));
			System.out.println("Valor com desconto a vista : " + valordacompra);
			break;
		case 2:
			System.out.println("Qual é o valor da compra?");
			valordacompra = ler.nextDouble();
			valordaparcela = valordacompra - (valordacompra * (0.2));
			System.out.println("Valor da compra a prazo : " + valordaparcela);
			System.out.println("Valor de cada parcela : " + valordaparcela/2);
			break;
		case 3:
			System.out.println("Qual é o valor da compra?");
			valordacompra = ler.nextDouble();
			valordaparcela = valordacompra - (valordacompra * (0.2));
			System.out.println("Valor da compra a prazo : " + valordaparcela);
			System.out.println("Valor de cada parcela : " + valordaparcela/3);
			break;
		default:
			System.out.println("Só trabalhamos com 3 parcelas.");

	}

	}
}
