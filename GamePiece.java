package lab8;

public enum GamePiece {


	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE,BLUE_BOOT,GREEN_BOOT, YELLOW_BOOT;


	private GamePieceAppearance appearance;
	private int priority;

	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	public Color getColor() {
		return getColor();		
	}
	public Shape getShape() {
		return getShape();
	}

	public static GamePiece movesFirst(GamePiece a,
            GamePiece b)
	{
		
	}
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", appearance, priority);
	}

}

