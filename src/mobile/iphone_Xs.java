package mobile;

public class iphone_Xs extends ios{
	String color,Imagesignalprocessor;
	int price;
	
	
	public iphone_Xs()
	{
		
	}
	
	public iphone_Xs(String col,String isp,int price)
	{
		super("yes","yes","yes",1);
		setColor(col);
		setImagesignalprocessor(isp);
		setPrice(price);
	}


	public void setColor(String col)
	{
		this.color=col;
	}
	public String getColor()
	{
	 return this.color;
	}

	public void setImagesignalprocessor(String isp)
	{
		this.Imagesignalprocessor=isp;
	}
	public String getImagesignalprocessor()
	{
	 return this.Imagesignalprocessor;
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
