package controlers;

import controlers.ControlersPos;
import controlers.ControlersPlayer;
import dao.DAOPlayer;
import interfaces.ItaratorPlayer;
import model.player.Player;

public class ControlersPlayer implements ItaratorPlayer{

private static ControlersPlayer ControlersPlayer;
	
	public static ControlersPlayer getInstance(){
		if(ControlersPlayer == null)
			ControlersPlayer = new ControlersPlayer();
		return ControlersPlayer;
	}
	
	private ControlersPlayer(){	}	
	
	public void cadastrarPlayer(String nome, String img){
		DAOPlayer.getInstance().addJogador(new Player(nome, img));
	}
	
	public void moverPlayer(Player player, int dados){
		int destino = ((player.getCasaAtual().getIndice()+dados));
		if (destino >= 100) {
			player.setCasaAtual(ControlersPos.getInstance().getCasas().get(99));
		}else
			player.setCasaAtual(ControlersPos.getInstance().getCasas().get(destino));
	}
	
	@Override
	public Player proximoPlayer(Player player) {
		if (player == DAOPlayer.getInstance().getJogadores().get(0))
			return (Player) DAOPlayer.getInstance().getJogadores().get(1);
		else 
			return (Player) DAOPlayer.getInstance().getJogadores().get(0);
	}
	
	public Player getPlayer1(){
		return (Player) DAOPlayer.getInstance().getJogadores().get(0);
	}
	
	public Player getPlayer2(){
		return (Player) DAOPlayer.getInstance().getJogadores().get(1);
	}

}
