package model.player;

import java.awt.Point;

import controlers.ControlersPos;
import model.position.PositionBoard;


public class Player {
	private String nome;
	private Miniature miniature;
	private PositionBoard casaAtual;
	
	public Player(String nome, String img) {
		this.nome = nome;
		this.miniature = new Miniature(img);
		casaAtual = ControlersPos.getInstance().getCasas().get(0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public Miniature getMiniature() {
		return miniature;
	}
	
	public PositionBoard getCasaAtual(){
		return casaAtual;
	}
	
	public Point getCoordenada(){
		return casaAtual.getCoordenada();
	}

	public void setCasaAtual(PositionBoard casaAtual) {
		this.casaAtual = casaAtual;
		miniature.x = casaAtual.getCoordenada().getX();
		miniature.y = casaAtual.getCoordenada().getY();
	}

}
