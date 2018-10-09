package mobile;

public class iphone_7 extends ios{
	int memory,price,Ram;
	
	public iphone_7()
	{
		
	}
	
	public iphone_7(int ram,int mem,int price)
	{
		super("yes","yes","yes",1);
		setRam(ram);
		setMem(mem);
		setPrice(price);
	}


	public void setRam(int ram)
	{
		this.Ram=ram;
	}
	public int getRam()
	{
	 return this.Ram;
	}

	public void setMem(int mem)
	{
		this.memory=mem;
	}
	public int getMemory()
	{
	 return this.memory;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
	 return this.price;
	}
	

}
