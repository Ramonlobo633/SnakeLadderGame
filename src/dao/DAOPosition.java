package dao;

import java.util.ArrayList;
import model.position.PositionBoard;

public class DAOPosition {
	private static DAOPosition tabuleiro;
	private ArrayList<PositionBoard> casas;
	
	public DAOPosition() {
		casas = new ArrayList<PositionBoard>();
	}
	
	public static DAOPosition getInstance() {
		if(tabuleiro == null) {
			tabuleiro = new DAOPosition();
		}
		return tabuleiro;
	}
	
	public void addCasa(PositionBoard casa) {
		casas.add(casa);
	}
	
	public ArrayList<PositionBoard> getCasas(){
		return casas;
	}

}
