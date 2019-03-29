package lab8;

import java.awt.Color;
import java.awt.Shape;

public class GamePieceAppearance extends java.lang.Object{

	private Color color;
	private Shape shape;
	
	//Stores the color and shape describing the apperance of the game piece.
	public GamePieceAppearance(Color color, Shape Shape) 
	{
		this.color = color;
		this.shape = Shape;
	}
	
	//Gets the color of the game piece.
	public Color getColor() 
	{
		return color;
	}
	
	//Gets the shape of the game piece.
	public Shape getShape()
	{
		return shape;
	}

}
