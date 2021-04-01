package factory;

import java.awt.Point;

import interfaces.IFactoryPosition;
import model.position.PositionTrap;
import model.position.PositionFinal;
import model.position.PositionSnake;
import model.position.PositionNormal;
import model.position.PositionLadder;
import model.position.PositionBoard;


public class FactoryPositionBoard implements IFactoryPosition<PositionBoard> {
	
	PositionBoard position = null;
	
	@Override
	public PositionBoard criar(int i, String tipo, Point p, int valor) {
		
		if (tipo.equals("S")) {
			position = new PositionLadder(i, p, valor);
		} else if(tipo.equals("M")) {
			position = new PositionSnake(i, p, valor);
		}
		return position;
	}

	@Override
	public PositionBoard criar(int i, String tipo, Point p) {
		if(tipo.equals("N")) {
			position = new PositionNormal(i, p);
		} else if(tipo.equals("F")) {
			position = new PositionFinal(i, p);
		} else if(tipo.equals("A")){
			position = new PositionTrap(i, p);
		}
		return position;
	}
}
