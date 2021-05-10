package GameProject;

import GameProject.Business.CampaignManager;
import GameProject.Business.GameManager;
import GameProject.Business.GamerManager;
import GameProject.Business.SaleManager;
import GameProject.Entities.Campaigns;
import GameProject.Entities.Gamers;
import GameProject.Entities.Games;

public class Main
{

	public static void main(String[] args)
	{
				
		Gamers gamers =new Gamers(1,"Emre","Demir");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.delete(gamers);
		gamerManager.add(gamers);
		gamerManager.update(gamers);
		
		Campaigns campaigns = new Campaigns(1,"Kýþ Ýndirimi",10);
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaigns);
		campaignManager.delete(campaigns);
		campaignManager.update(campaigns);
		
		
		Games games = new Games(1,"Remnant",100);
		GameManager gamesManager = new GameManager();
		gamesManager.add(games);
		gamesManager.delete(games);
		gamesManager.update(games);
		
		SaleManager saleManager = new SaleManager();
		saleManager.buy(games, gamers);
		saleManager.CampaignSale(games, campaigns, gamers);
	}

}
