package GameProject.Business;

import GameProject.Entities.Campaigns;
import GameProject.Entities.Gamers;
import GameProject.Entities.Games;

public class SaleManager implements Sale {

	@Override
	public void buy(Games games, Gamers gamers)
	{
		System.out.println(games.getGameName()+ " adlý oyun "+gamers.getFirstName()+" tarafýndan satýn alýndý.");
	}

	@Override
	public void CampaignSale(Games games, Campaigns campaigns, Gamers gamers)
	{
		int campaignPrice= (games.getPrice() - (games.getPrice()/100)*campaigns.getAmount());
		System.out.println("Satýn Alýnan Oyun: "+games.getGameName());
		System.out.println("Satýn Alan Oyuncu: "+ gamers.getFirstName());
		System.out.println("Uygulanan Kampanya: "+campaigns.getCampaignName());
		System.out.println("Ýndirim Oraný: %" +campaigns.getAmount());
		System.out.println("Kampanyalý Fiyatý: "+ campaignPrice);
	}

}
