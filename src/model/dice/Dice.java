package model.dice;


import jplay.Animation;

public class Dice {
	private static final int max = 6;
	private Animation imagemDado;
	private int face;
	
	public Dice(int x, int y) {
		imagemDado = new Animation("src/resources/images/Dado.png", 6);
		imagemDado.x = x;
		imagemDado.y = y;
		lancar();
	}
	
	private void lancar(){
		int valor = (int) (Math.random() * max);
		imagemDado.setCurrFrame(valor);
		face = valor + 1;
	}
	
	public Animation getImagemDado(){
		return imagemDado;
	}
	
	public int getFace(){
		return face;
	}
}

