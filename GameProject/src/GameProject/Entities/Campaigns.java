package GameProject.Entities;

public class Campaigns implements Entity
{
	private int campaignId;
	private String campaignName;
	private int amount;
	
	public Campaigns()
	{
		
	}
	public Campaigns(int campaignId, String campaignName, int amount) 
	{
		this();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.amount = amount;
	}
	
	public int getCampaignId()
	{
		return campaignId;
	}
	public void setCampaignId(int campaignId)
	{
		this.campaignId = campaignId;
	}
	public String getCampaignName()
	{
		return campaignName;
	}
	public void setCampaignName(String campaignName)
	{
		this.campaignName = campaignName;
	}
	public int getAmount()
	{
		return amount;
	}
	
}
