package controlers;

import java.util.ArrayList;
import java.util.List;

import controlers.ControlersDice;
import model.dice.Dice;

public class ControlersDice {
	private List<Dice> dados;
	
	private static ControlersDice ControlersDice;
	
	private ControlersDice() {
	}
	
	public static ControlersDice getInstance(){
		if(ControlersDice == null)
			ControlersDice = new ControlersDice();
		return ControlersDice;
	}
	
	public int lancarDados(){
		dados = new ArrayList<>();
		dados.add(new Dice(150,150));
		dados.add(new Dice(150,200));
		return dados.get(0).getFace() + dados.get(1).getFace();
	}
	
	public List<Dice> getDados() {
		return dados;
	}

	public int getValorDados() {
		return dados.get(0).getFace()+dados.get(1).getFace();
	}
	

}
