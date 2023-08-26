package Atividade;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		
	 Scanner ler = new Scanner(System.in);
		
		double mihaAltura = 1.73;
		double alturaUsuario;
		
		double meuPeso = 68;
		double pesoUsuario;
		
		String meuNome = "lud";
		String nomeUsuario;
		String meuSobrenome = "camilo";
		String sobrenomeUsuario;
		
		
		int minhaidade = 18;
		int idadeusuario;
		int meuMesDeNascimento = 3;
		int MesNascimenoUsuario;
		
		char meuSexo = 'M' ;
		char sexoUsuario ;
		char naoseiUsuario;
		char naosei;
		
		boolean gostodeFutebol = true;
		boolean usuarioGostadeFutebol;
		boolean gostaDeMusica = true;
		boolean usuarioGostadeMsica;
		
		int cont = 0;
		System.out.println("Vamos nos Comparar");
		
		//Receber dados do usuario
		
		System.out.println("Entre com sua altura");
		alturaUsuario = ler.nextDouble();
		
		System.out.println("Entre com seu peso ");
		pesoUsuario = ler.nextDouble();
		
		System.out.println("Entre com seu nome ");
		nomeUsuario = ler.next();
		
		System.out.println("entre com seu sobrenome");
		sobrenomeUsuario = ler.next();
		
		System.out.println("Entre com sua idade");
		idadeusuario = ler.nextInt();
		
		System.out.println("Entre com seu mes de nascimento");
		MesNascimenoUsuario = ler.nextInt();
		
		System.out.println("Entre seu sexo");
		sexoUsuario = ler.next().charAt(0);
		
		System.out.println("Entre com naosei");
		naoseiUsuario = ler.next().charAt(0);
		
		System.out.println("Voce Gosta de futebol digite true se não false");
		usuarioGostadeFutebol = ler.nextBoolean();
		
		System.out.println("Voce Gosta de musica digite true se não false?");
		usuarioGostadeMsica = ler.nextBoolean();
		
		if(mihaAltura == alturaUsuario) {
			cont++;
		}
		
		if(pesoUsuario == meuPeso) {
			cont++;
		}
		if(meuNome == nomeUsuario ) {
			cont++;
		}
		if(meuSobrenome == sobrenomeUsuario) {
			cont++;
		}
		if(minhaidade == idadeusuario) {
			cont++;
		}
		if(minhaidade == idadeusuario) {
			cont++;
		}
		if(meuMesDeNascimento == MesNascimenoUsuario) {
			cont++;
		}
		if(sexoUsuario == meuSexo) {
			cont++;
		}
		if(naoseiUsuario == naoseiUsuario  ) {
			cont++;
		}

		if(gostodeFutebol == usuarioGostadeFutebol ) {
			cont++;
		}
		
		if(gostaDeMusica == usuarioGostadeMsica) {
			cont++;
		}
		
		
		if (cont>5) {
			System.out.println("Essa pessoa é parecida comigo");
		}
		else {
			System.out.println("Essa pessoa é diferente de mim");
		}
	}
		
	}


