package Atividade;
import java.util.Scanner;
public class Atividade07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos calcular a media ponderada");
		
		System.out.println("Entre com a primeira nota");
		double primeiranota = ler.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double egundanota = ler.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double terceiranota = ler.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double quartanota = ler.nextDouble();
		
		
		double media = (primeiranota + terceiranota + quartanota) / 4;
		
		if (media > 6) {
		 System.out.println("aprovado");
		}
		else if (media > 4 && media <= 5.9) {
			System.out.println("prova final");
		}	
		else if (media<4) {
			System.out.println("reprovado");
		}		
		
		else {
			System.out.println("valor incorreto");
		}
		}
	}
		
		
		
		
		
	
		
		
		
		
		
	
	

