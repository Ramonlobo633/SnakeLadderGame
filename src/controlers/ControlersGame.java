package controlers;

import javax.swing.JOptionPane;

import controlers.ControlersDice;
import controlers.ControlersPlayer;
import controlers.ControlersGame;
import dao.DAOPosition;
import dao.DAOPlayer;
import interfaces.IGame;
import model.player.Player;
import view.View;

public class ControlersGame implements IGame {

	private static ControlersGame controleJogo;
	
	public ControlersGame() {
	}
	
	public static ControlersGame getInstance() {
		if(controleJogo == null) {
			controleJogo = new ControlersGame();
		}
		return controleJogo;
	}
	
	public void iniciarJogo() {
		DAOPosition.getInstance();
		cadastrarJogador("src/resources/images/pino1.png");
		cadastrarJogador("src/resources/images/pino2.png");
		JOptionPane.showMessageDialog(null, ControlersPlayer.getInstance().getPlayer1().getNome()+" - Pino Preto\n"+
				ControlersPlayer.getInstance().getPlayer2().getNome()+" - Pino Laranja\n");
		new View();	
	}

	@Override
	public void proximaRodada(Player jogador) {
		JOptionPane.showMessageDialog(null,jogador.getNome()+". Sua vez de jogar");
		lancarDado();
		moverJogador(jogador, ControlersDice.getInstance().getValorDados()-1);	
	}

	public void moverJogador(Player jogador, int dados){
		ControlersPlayer.getInstance().moverPlayer(jogador, dados);
	}

	@Override
	public void cadastrarJogador(String miniature) {
		DAOPlayer.getInstance().addJogador(
				new Player(JOptionPane.showInputDialog("Digite seu nome"), miniature));		
	}
	
	@Override
	public int lancarDado() {
		return ControlersDice.getInstance().lancarDados();
	}

	public void Mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
