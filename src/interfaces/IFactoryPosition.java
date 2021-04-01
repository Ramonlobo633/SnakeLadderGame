package interfaces;

import java.awt.Point;


public interface IFactoryPosition <T>{
	
	T criar (int i, String tipo, Point p);
	T criar (int i, String tipo, Point p, int destino);

}
