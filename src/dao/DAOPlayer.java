package dao;


import java.util.ArrayList;

import model.player.Player;

public class DAOPlayer {
	private static DAOPlayer daoPlayers;
	private ArrayList<Player> jogadores;
	
	public DAOPlayer() {
		jogadores = new ArrayList<Player>();
	}
	
	public static DAOPlayer getInstance() {
		if( daoPlayers == null ) {
			daoPlayers = new DAOPlayer();
		}
		return daoPlayers;
	}
	
	public void addJogador(Player jogador) {
		this.jogadores.add(jogador);
	}
	
	public void removerJogador(Player jogador) {
		this.jogadores.remove(jogador);
	}
	
	public ArrayList<Player> getJogadores(){
		return jogadores;
	}

}
