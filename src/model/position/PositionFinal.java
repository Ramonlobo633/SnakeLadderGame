package model.position;

import java.awt.Point;

import controlers.ControlersPos;
import controlers.ControlersGame;
import model.position.PositionBoard;
import model.player.Player;


public class PositionFinal extends PositionBoard{

	public PositionFinal(int indice, Point coordenada) {
		super(indice, coordenada);
	}

	@Override
	public void acao(Player jogador) {
		jogador.setCasaAtual(ControlersPos.getInstance().getCasas().get(99));
		ControlersGame.getInstance().Mensagem("VOCÊ GANHOU!!!");
	}


}
