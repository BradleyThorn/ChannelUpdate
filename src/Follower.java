
public class Follower implements Observer {
	String followerName;
	
	public Follower(String followerName)
	{
		this.followerName = followerName;
	}
	public String getFollowerName()
	{
		return followerName;
	}
	
	public void setFollowerName(String fn)
	{
		this.followerName = fn;
	}
	public void update(String status)
	{
		System.out.println("What's up, it's ya boy back at ya with another fresh upload");
	}
	
	public void play()
	{
		//plays sick new content
	}

}
