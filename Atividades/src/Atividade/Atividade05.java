package Atividade;
import java.util.Scanner;
public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		//PROGAMA
		
		System.out.println("Escolha qual forma geométrica quer calcular a área e o perímetro");
		String menu = ler.next();
		switch (menu) {
		case "Quadrado":
			System.out.println("Entre com o primeirolado do quadrado");
			double primeirolado = ler.nextDouble();
			System.out.println("Entre com o segundolado do quadrado");
			double segundolado = ler.nextDouble();
			double area = primeirolado * segundolado;
			double perimetro = primeirolado * 4;
			System.out.println("O valor da area e de: " + area + "\n" + "O valor do perimetro e de: " + perimetro);
			break;
		case "Retangulo":
			System.out.println("Entre com a base do retangulo");
			double baseRetangulo = ler.nextDouble();
			System.out.println("Entre com a altura do retangulo");
			double alturaRetangulo = ler.nextDouble();
			double areaRetangulo = baseRetangulo * alturaRetangulo;
			double perimetroRetangulo = 2*(baseRetangulo + alturaRetangulo);
			System.out.println("O valor da area e de: " + areaRetangulo + "\n" + "O valor do perimetro e de: " + perimetroRetangulo);
			break;
		case "Triangulo":
			System.out.println("Entre com primeirolado do triangulo");
			double primeiroladoTriangulo = ler.nextDouble();
			System.out.println("Entre com segundolado do triangulo");
			double lado2Triangulo = ler.nextDouble();
			System.out.println("Entre com terceirolado do triangulo");   
			double lado3Triangulo = ler.nextDouble();
			System.out.println("Entre com a base do triangulo");
			double baseTriangulo = ler.nextDouble();
			System.out.println("Entre com a altura do triangulo");
			double alturaTriangulo = ler.nextDouble();
			double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
			double perimetroTriangulo = primeiroladoTriangulo + lado2Triangulo + lado3Triangulo;
			System.out.println("O valor da area e de: " + areaTriangulo + "\n" + "O valor do perimetro e de: " + perimetroTriangulo);
			break;

		case "Circulo":
			System.out.println("Entre com o valor do raio");
			double raioCirculo = ler.nextDouble();
			double areaCirculo = 3.14159*(raioCirculo*raioCirculo);
			double perimetroCirculo = 2* 3.14159 *raioCirculo;
			System.out.println("O valor da area e de: " + areaCirculo + "\n" + "O valor do perimetro e de: " + perimetroCirculo);
			
						break;
		case "SAIR":

			break;
		default:
			System.out.println("Não sabemos dessa!");
		}
			
			
			
	
		
		
		

	}
	}

