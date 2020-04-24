package programaLeitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		String nome;
		
		System.out.println("Seja bem-vindo ao jogo! Insira seu nome: ");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a) " +nome);
		System.out.println("Voc� deseja avan�ar para qual dire��o? (w, a, s, d)");
		
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Voc� est� indo para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer? (a: atacar, c: correr)");
			
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Voc� ganhou o jogo!");
				} else {
					System.out.println("Voc� perdeu!");
				}
			} else {
				System.out.println("Voc� correu! O jogo terminou!");
			}
		} else if(comando.equals("s")) {
			System.out.println("Voc� est� entrando em outro mapa ...");
		}
	}
}
