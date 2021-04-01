package model.position;

import java.awt.Point;

import controlers.ControlersPos;
import controlers.ControlersGame;
import model.position.PositionWithEffect;
import model.player.Player;

public class PositionLadder extends PositionWithEffect{
	public PositionLadder(int indice, Point coordenada, int destino) {
		super(indice, coordenada, destino);
	}

	@Override
	public void acao(Player jogador) {
		jogador.setCasaAtual(ControlersPos.getInstance().getCasas().get(this.getDestino()));
		ControlersGame.getInstance().Mensagem("Avance!! ");
	}


}
