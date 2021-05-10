package GameProject.Business;

import GameProject.Entities.Gamers;

public class GamerManager implements Gamer
{
	@Override
	public void add(Gamers gamer)
	{
		System.out.println("Gamer Added: " + gamer.getFirstName());		
	}

	@Override
	public void update(Gamers gamer)
	{
		System.out.println("Gamer Updated: "+ gamer.getFirstName());	
		
	}

	@Override
	public void delete(Gamers gamer)
	{
		System.out.println("Gamer Deleted: "+ gamer.getFirstName());	
		
	}
	
}
