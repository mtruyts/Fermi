package aula;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe que inicia o game Fermi
 * 
 * @author Matheus Truyts
 * @version 1.0
 * 
 */

public class Principal {

	/**
	 * Metodo principal da aplicacao responsavel por executar o game Fermi
	 * 
	 * @param args
	 * 
	 */ 

	public static void main(String[] args) {
		int [] resposta = new int[3];
		Random gerar = new Random();
		boolean continuar = true;
		int tentativas = 0;

		System.out.println("Bem-vindo ao game Fermi!\n" + 
				"Voce deve adivinhar quais sao os 3 numeros aleatorios!\n" + 
				"Para cada tentativa, sera dada dicas, seguindo a seguinte regra:\n" +
				"FERMI - numero na posicao correta\n" +
				"PICO - numero na posicao errada\n" + 
				"NANO - numero errado\n" +
				"Vamos comecar!");

		//Gerando a resposta secreta
		for(int i=0; i<resposta.length; i++) {
			resposta[i] = gerar.nextInt(9);
			System.out.print(resposta[i]);
		}


		while(continuar) {
			//Definindo os chutes
			System.out.println(" ");
			System.out.println("Chute: ");
			Scanner chute_usuario = new Scanner(System.in);
			int [] chute = new int[3];

			for(int i = 0; i< chute.length; i++) {
				chute[i] = chute_usuario.nextInt();
			}
			tentativas++;

			//Definindo as dicas
			// Fermi
			int fermicont = 0;
			for(int i = 0; i < chute.length; i++) {
				if(chute[i] == resposta[i]){
					System.out.print("Fermi ");
					fermicont++;
				}			
			}

			//...

			//Pico e Nano...
			//Quando não ha ocorrência de Fermi
			if(fermicont == 0) {
				if(chute[0] == resposta[1] || chute[0] == resposta[2]) {
					System.out.print("Pico ");
				}else {
					System.out.print("Nano ");
				}


				if(chute[1] == resposta[0] || chute[1] == resposta[2]) {
					System.out.print("Pico ");
				}else {
					System.out.print("Nano ");
				}

				if(chute[2] == resposta[0] || chute[2] == resposta[1]) {
					System.out.print("Pico ");
				}else {
					System.out.print("Nano ");
				}
			}

			//Quando ha ocorrencia de 1 Fermi
			while(fermicont == 1) {
				if(chute[0] == resposta[0]) {
					if(chute[1] == resposta[2]) {
						System.out.print("Pico ");
					}else {
						System.out.print("Nano ");
					}

					if(chute[2] == resposta[1]) {
						System.out.print("Pico ");
					}else{
						System.out.print("Nano ");
					}
				}

				if(chute[1] == resposta[1]) {
					if(chute[0] == resposta[2]) {
						System.out.print("Pico ");
					}
					else {
						System.out.print("Nano ");
					}

					if(chute[2] == resposta[0]) {
						System.out.print("Pico ");
					}else {
						System.out.print("Nano ");
					}
				}

				if(chute[2] == resposta[2]) {
					if(chute[0] == resposta[1]) {
						System.out.print("Pico ");
					}else {
						System.out.print("Nano ");
					}

					if(chute[1] == resposta[0]) {
						System.out.print("Pico ");
					}else {
						System.out.print("Nano ");
					}
				}
				break;
			}

			//Quando ha ocorrencia de 2 Fermis
			if(fermicont == 2) {
				if(chute[0] != resposta[0] || chute[1] != resposta[1] || chute[2] != resposta[2]) {
					System.out.println("Nano ");
				}
			}
			//...
			if(fermicont == 3) {
				System.out.println(" ");
				System.out.println("Você ganhou! ");
				System.out.println("Tentativas: " + tentativas);
				System.out.println("Deseja jogar novamente? (s/n)");

				Scanner jogar = new Scanner(System.in);
				if(jogar.next().charAt(0)=='s') {
					for(int i=0; i<resposta.length; i++) {
						resposta[i] = gerar.nextInt(9);
						tentativas = 0;
					}
				}
				else {
					continuar = false;
					System.out.println("Game Over!");
					break;
				}
			}
		}

	}
}