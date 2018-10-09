package mobile;

public class MI extends Android{

	int RAM;
	String FaceUnlock,networksupport;
	

	public MI()
	{
		
	}
	
	public MI(String fu,String ns,int ram)
	{
		super(true,true,1);
		setFaceUnlock(fu);
		setNetworksupport(ns);
		setRam(ram);
	}


	public void setFaceUnlock(String fu)
	{
		this.FaceUnlock=fu;
	}
	public String getFaceUnlock()
	{
	 return this.FaceUnlock;
	}

	public void setNetworksupport(String ns)
	{
		this.networksupport=ns;
	}
	public String getNetworksupport()
	{
	 return this.networksupport;
	}
	
	public void setRam(int ram)
	{
		this.RAM=ram;
	}
	public int getRam()
	{
	 return this.RAM;
	}
	
}
