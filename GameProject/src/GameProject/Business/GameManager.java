package GameProject.Business;

import GameProject.Entities.Games;

public class GameManager implements Game
{

	@Override
	public void add(Games game)
	{
		System.out.println("Game Added: " +game.getGameName());	
		
	}

	@Override
	public void update(Games game)
	{
		System.out.println("Game Updated: "+game.getGameName());	
		
	}

	@Override
	public void delete(Games game)
	{
		System.out.println("Game Deleted: "+game.getGameName());	
		
	}


}
