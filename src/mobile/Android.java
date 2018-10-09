package mobile;

public class Android extends Mobile{
	boolean bluetooth,Memorycard;
	int googlevoice;
	
	public Android() {
		
	}
	
	
	public Android(boolean bt,boolean mec,int gv)
	{
		super("yes","yes","Double");
		setBluetooth(bt);
		setMemorycard(mec);
		setGooglevoice(gv);
		
		
	}
	public void setBluetooth(boolean bt)
	{
		this.bluetooth=bt;
	}
	public boolean getBluetooth()
	{
	 return this.bluetooth;
	}
	public void setMemorycard(boolean mec)
	{
		this.Memorycard=mec;
	}
	public boolean getMemoryCard()
	{
	 return this.Memorycard;
	}
	public void setGooglevoice(int gv)
	{
		this.googlevoice=gv;
	}
	public int getgooglevoice()
	{
	 return this.googlevoice;
	}
 
}