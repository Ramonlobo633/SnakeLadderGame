package model.position;

import java.awt.Point;
import interfaces.IEffect;

public abstract class PositionBoard implements IEffect{
	private int indice;
	private Point coordenada;
	
	public PositionBoard(int indice, Point coordenada) {
		this.indice = indice;
		this.coordenada = coordenada;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public Point getCoordenada() {
		return coordenada;
	}

	

}
