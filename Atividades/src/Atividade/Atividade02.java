package Atividade;
import java.util.Scanner;
public class Atividade02 {

	public static void main(String[] args) {
		
		//
		String meuNome = "Ludgero Ozanan Camilo";
		String nomeColega ="Pedro Meireles Almeida de Oliveira";
		
		Scanner entrada = new Scanner(System.in);
		
		int minhaIdade = 18;
		int idadeColega = 20;
		double minhaAltura = 1.73;
		double alturaColega = 1.75;		
		String Meujogopreferido = "csgo";
		String Jogopreferidocolega ="csgo";
		String minhaseriepreferida = "supernatural";
		String seriepreferidacolega = "got";
		
		//
		System.out.println("Deseja ver dados sobre Ludgero ou Pedro");
		String nome = entrada.next();
		
		switch (nome) {
	     case "Ludgero":
	       System.out.println("Nome: " + meuNome + "\n" + "Idade: " + minhaIdade + "\n"+ "Altura: " + minhaAltura +"\n"+ "Jogo favorito: " + Meujogopreferido +"\n"+ "Serie Favorita: " + minhaseriepreferida);
	       break;
	     case "Pedro":
	       System.out.println("Nome: " + nomeColega + "\n" + "Idade:" + idadeColega + "\n"+ "Altura: " +alturaColega +"\n"+ "Jogo favorito: " + Jogopreferidocolega +"\n"+ "Serie Favorita: " + seriepreferidacolega);
	       break;
	     default:
	         System.out.println("Pessoa incorreta, tente novamente.");
	     }
		
		

	}

}
