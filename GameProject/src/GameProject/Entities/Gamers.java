package GameProject.Entities;

public class Gamers implements Entity
{
	private int gamerId;
	private String firstName;
	private String lastName;
	
	public Gamers()
	{
		
	}
	public Gamers(int gamerId, String firstName, String lastName) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getGamerId() 
	{
		return gamerId;
	}
	public void setGamerId(int gamerId) 
	{
		this.gamerId = gamerId;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	
}
