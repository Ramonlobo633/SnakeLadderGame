package interfaces;

import model.player.Player;

public interface IGame {
	public void iniciarJogo();
	public void proximaRodada(Player jogador);
	public int lancarDado();
	public void cadastrarJogador(String miniature);
	
}
