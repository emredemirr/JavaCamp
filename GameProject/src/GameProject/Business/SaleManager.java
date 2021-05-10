package GameProject.Business;

import GameProject.Entities.Campaigns;
import GameProject.Entities.Gamers;
import GameProject.Entities.Games;

public class SaleManager implements Sale {

	@Override
	public void buy(Games games, Gamers gamers)
	{
		System.out.println(games.getGameName()+ " adl� oyun "+gamers.getFirstName()+" taraf�ndan sat�n al�nd�.");
	}

	@Override
	public void CampaignSale(Games games, Campaigns campaigns, Gamers gamers)
	{
		int campaignPrice= (games.getPrice() - (games.getPrice()/100)*campaigns.getAmount());
		System.out.println("Sat�n Al�nan Oyun: "+games.getGameName());
		System.out.println("Sat�n Alan Oyuncu: "+ gamers.getFirstName());
		System.out.println("Uygulanan Kampanya: "+campaigns.getCampaignName());
		System.out.println("�ndirim Oran�: %" +campaigns.getAmount());
		System.out.println("Kampanyal� Fiyat�: "+ campaignPrice);
	}

}
