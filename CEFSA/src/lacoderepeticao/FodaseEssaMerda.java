package lacoderepeticao;

import java.util.Random;

import javax.swing.JOptionPane;

public class FodaseEssaMerda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean jogarNovamente;
		int totalTentativas = 0;
		
		do {
			Random gerador = new Random();
			int numeroSecreto = gerador.nextInt(100)+1;
			int tentativaUsuario;
			int tentativasRodada = 0;
			boolean acertou = false;
			
			JOptionPane.showMessageDialog(null,"Bem-vindo ao Jogo de adivinhação!!!"
					+ "\nTente adivinhar um número entre 1 e 100.","Inicio do Jogo",
					JOptionPane.INFORMATION_MESSAGE);
			
			while(!acertou) {
				tentativasRodada++;
				String input = JOptionPane.showInputDialog(null,"Tentativa "+tentativasRodada+": "
						+ "Digite seu palpite (de 1 a 100): ","Adivinhe o número",JOptionPane.QUESTION_MESSAGE);
				if(input == null) {
					JOptionPane.showMessageDialog(null,"Jogo cancelado. Até a próxima!!!",
							"FIM",JOptionPane.WARNING_MESSAGE);
					acertou = true;
					tentativasRodada = 0;
					continue;//Pula para a próxima iteração do "while" (que agora vai sair)
				}
				try {
					tentativaUsuario = Integer.parseInt(input);
					//Lógica do jogo
					if(tentativaUsuario == numeroSecreto) {
						acertou = true;
						String mensagem = String.format("Parabéns!!! Você acertou o número %d em %d tentativas.",
								numeroSecreto,tentativasRodada);
						JOptionPane.showMessageDialog(null,mensagem,"VITÓRIA",JOptionPane.PLAIN_MESSAGE);
						totalTentativas += tentativasRodada;//Acumula no total geral
					}else if(tentativaUsuario < numeroSecreto) {
						JOptionPane.showMessageDialog(null,"O número secreto é MAIOR que "+tentativaUsuario,
								"Tente Novamente!!!",JOptionPane.ERROR_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null,"O número secreto é MENOR que "+tentativaUsuario,
								"Tente Novamente!!!",JOptionPane.ERROR_MESSAGE);
					}
				}catch(NumberFormatException e) {
					//Caso o usuário digite algo que não seja um número
					JOptionPane.showMessageDialog(null,"entrada inválida. Digite apenas números inteiros.",
							"Erro de Entrada",JOptionPane.ERROR_MESSAGE);
					tentativasRodada--;
				}
			}//fim do laço "while"
			
			int resposta = JOptionPane.showConfirmDialog(null,"Você gostaria de jogar outra rodada?",
					"Jogar Novamente",JOptionPane.YES_NO_OPTION);
			//Definir a variável de controle do laço "do...while()"
			jogarNovamente = (resposta == JOptionPane.YES_OPTION);
			
		}while(jogarNovamente);
		
		JOptionPane.showMessageDialog(null,
				"Obrigado por jogar! Total de tentativas em todos os jogos: "+totalTentativas,
				"Fim do Programa",JOptionPane.INFORMATION_MESSAGE);
	}
 
}
 