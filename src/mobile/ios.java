package mobile;
public class ios extends Mobile 
{
	String Applestore,Findmyiphone,compass;
	int siri;
	
	public ios()
	{
		
	}

public ios(String as,String fmi,String cs,int siri)	
{
	super("yes","yes","single");
	setFindmyiphone(fmi);
	setApplestore(as);
	setcompass(cs);
	setSiri(siri);
}
	
	public void setFindmyiphone(String mi)
	{
		this.Findmyiphone=mi;
	}
	public String getFindmyiphone()
	{
	 return this.Findmyiphone;
	}
	public void setApplestore(String as)
	{
		this.Applestore=as;
	}
	public String getApplestore()
	{
	 return this.Applestore;
	}
	public void setcompass(String mi)
	{
		this.Findmyiphone=mi;
	}
	public String getCompass()
	{
	 return this.compass;
	}
	public void setSiri(int si)
	{
		this.siri=si;
	}
	public int getSiri()
	{
	 return this.siri;
	}
}