package model.position;

import java.awt.Point;

public abstract class PositionWithEffect extends PositionBoard{

	private int destino;
	
	public PositionWithEffect(int indice, Point coordenada, int destino) {
		super(indice, coordenada);
		this.destino = destino;
	}
	
	public int getDestino() {
		return destino - 1;
	}
}
