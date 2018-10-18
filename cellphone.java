package cellphone;

public class cellphone {
	 String color;
	 int price;
	float weight;
	
	cellphone(String color,int price,float weight)
	{
		this.color=color;
		this.price=price;
		this.weight=weight;
	}

	public void calling(long mobileno)
	{
		System.out.println("start calling to: "+ mobileno);
	}
	
	public void sendMessage(long mobileno,String msg)
	{
		System.out.println("sending message\"" + msg + "\" to " +mobileno);
	}
	
	public void showdetails()
	{
		System.out.println("Color= " +color +"\nprice=" +price +"\nweight=" + weight);
	}
}

