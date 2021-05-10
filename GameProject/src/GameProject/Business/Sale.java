package GameProject.Business;

import GameProject.Entities.Campaigns;
import GameProject.Entities.Gamers;
import GameProject.Entities.Games;

public interface Sale
{
	void buy(Games games, Gamers gamers);
	void CampaignSale(Games games, Campaigns campaigns,Gamers gamers);
}
