package controlers;

import java.util.ArrayList;

import controlers.ControlersPos;
import dao.DAOPosition;
import model.position.PositionBoard;

public class ControlersPos {

	private static ControlersPos controlersPos;
	
	private ControlersPos() {
	}
	
	public static ControlersPos getInstance(){
		if(controlersPos == null)
			controlersPos = new ControlersPos();
		return controlersPos;
	}
	
	public void addCasa(PositionBoard casa) {
		DAOPosition.getInstance().addCasa(casa);
	}
	
	public ArrayList<PositionBoard> getCasas(){
		return DAOPosition.getInstance().getCasas();
	}
	
}


