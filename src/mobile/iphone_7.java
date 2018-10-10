package mobile;

public class iphone_7 extends ios{
	int memorycard,price,Ram;
	
	public iphone_7()
	{
		
	}
	
	public iphone_7(int ram,int mem,int price)
	{
		super("yes","yes","yes",1);
		setRam(ram);
		setMemorycard(mem);
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

	public void setMemorycard(int mem)
	{
		this.memorycard=mem;
	}
	public int getMemorycard()
	{
	 return this.memorycard;
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
