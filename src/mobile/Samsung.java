package mobile;

public class Samsung extends Android
{

	String samsungpay,networksupport;
	int RAM;
	
	public Samsung()
	{
		
	}
	
	public Samsung(String Sp,String ns,int ram)
	{
		super(true,true,1);
		setSamsungpay(Sp);
		setNetworksupport(ns);
		setRam(ram);
		
	}


	public void setSamsungpay(String sp)
	{
		this.samsungpay=sp;
	}
	public String getSamsungpay()
	{
	 return this.samsungpay;
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





