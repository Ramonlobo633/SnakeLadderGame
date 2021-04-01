package view;

import javax.swing.JOptionPane;

import controlers.ControlersDice;
import controlers.ControlersPlayer;
import controlers.ControlersGame;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;
import model.dice.Dice;
import model.player.Player;
import model.player.Miniature;

public class View {
	private Window janela;
	private GameImage tabuleiro;
	private static Keyboard teclado;
	Player Player = ControlersPlayer.getInstance().getPlayer1();
	private Player PlayerAtual;

	public View() {
		tabuleiro = new GameImage("src/resources/images/tabuleiro.png");
		this.janela = new Window(800, 528);
		teclado = janela.getKeyboard();
		setPlayerAtual(ControlersPlayer.getInstance().getPlayer1());
		run();
	}

	public void run() {
		janela.update();
		while (true) {
			janela.update();
			tabuleiro.draw();
			janela.update();
			ControlersPlayer.getInstance().getPlayer1().getMiniature().draw();
			ControlersPlayer.getInstance().getPlayer2().getMiniature().draw();
			
			updateJanela();
			ControlersGame.getInstance().proximaRodada(Player);
			
			desenhaDado();
			updateJanela();
			
			Player.getCasaAtual().acao(Player);
			updateJanela();
			
			Player = ControlersPlayer.getInstance().proximoPlayer(Player);
			updateJanela();
		}
	}

	public void updateJanela() {
		janela.update();
	}

	public void proximaRodada() {
		while (true) {
			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				janela.setSize(800, 528);
			}
		}
	}

	public void mensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public void desenhaDado() {
		for (Dice d : ControlersDice.getInstance().getDados()) {
			d.getImagemDado().draw();
			janela.update();
		}
		JOptionPane.showMessageDialog(null, "Avance "
				+ ControlersDice.getInstance().getValorDados() + " casas");
	}

	public void moverPlayer(Miniature pino, Player Player) {
		pino.draw();
		pino.moveTo(Player.getCoordenada().getX(), Player.getCoordenada()
				.getY(), 0.5);
	}

	public Player getPlayerAtual() {		
		return PlayerAtual;
	}

	public void setPlayerAtual(Player PlayerAtual) {
		this.PlayerAtual = PlayerAtual;
	}


}
