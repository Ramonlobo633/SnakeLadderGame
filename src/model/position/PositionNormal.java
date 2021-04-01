package model.position;

import java.awt.Point;

import controlers.ControlersGame;
import model.position.PositionBoard;
import model.player.Player;

public class PositionNormal extends PositionBoard{
	
	public PositionNormal(int indice, Point coordenada) {
		super(indice, coordenada);
	}

	@Override
	public void acao(Player jogador) {
		ControlersGame.getInstance().Mensagem("Continuar");
	}
}
