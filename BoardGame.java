package lab8;

public class BoardGame {

	protected java.util.LinkedHashMap<java.lang.String,GamePiece> playerPieces;
	protected java.util.LinkedHashMap<java.lang.String,Location> playerLocations;

	
	public BoardGame() {
		// TODO Auto-generated constructor stub
	}
	public boolean addPlayer(java.lang.String playerName,
            GamePiece gamePiece,
            Location intialLocation)
	{
		
		return false;
		
	}
	public GamePiece getPlayerGamePiece(java.lang.String playerName)
	{
		return null;
		
	}
	
	public java.lang.String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		return null;
		
	}
	
	public void movePlayer(java.lang.String playerName,
            Location newLocation)
	{
		
	}
	
	public java.lang.String[] moveTwoPlayers(java.lang.String[] playerNames,
            Location[] newLocations)
	{
		return playerNames;
		
	}
	
	public Location getPlayersLocation(java.lang.String player)
	{
		return null;
		
	}
	
	public java.util.ArrayList<java.lang.String> getPlayersAtLocation(Location loc)
	{
		return null;
		
	}
	
	public java.util.ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		return null;
		
	}
	
	public java.util.Set<java.lang.String> getPlayers()
	{
		return null;
		
	}
	
	public java.util.Set<Location> getPlayerLocations()
	{
		return null;
		
	}
	
	public java.util.Set<GamePiece> getPlayerPieces()
	{
		return null;
		
	}



}
