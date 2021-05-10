package GameProject.Business;

import GameProject.Entities.Campaigns;

public class CampaignManager implements Campaign
{

	@Override
	public void add(Campaigns campaign) 
	{
		System.out.println("Campaign Added: " +campaign.getCampaignName());	
		
	}

	@Override
	public void update(Campaigns campaign) 
	{
		System.out.println("Campaign Updated: "+campaign.getCampaignName());	
		
	}

	@Override
	public void delete(Campaigns campaign) 
	{
		System.out.println("Campaign Deleted: "+campaign.getCampaignName());	
		
	}
	
}
