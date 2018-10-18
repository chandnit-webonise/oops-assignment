package cellphone;

public class Samsungphone extends cellphone{
	String name,modelno;
	int imeino;
	
	Samsungphone(String color,int price,float weight,String name,String modelno,int imeino)
	{
		super(color,price,weight);
		this.name=name;
		this.modelno=modelno;
		this.imeino=imeino;
	}
	
	
	public void calling(long mobileno)
	{
		System.out.println("start calling to :"+mobileno +" from Samsungphone" );
	}
	
	public void sendMessage(long mobileno,String msg)
	{
		System.out.println("sending message\"" + msg + "\" to " +mobileno +" from samsungphone");
	}
	
	public void showdetails()
	{
		System.out.println("/***Details of Samsung mobile***/");
		System.out.println("Color= " +color +"\nprice=" +price +"\nweight=" + weight);
		System.out.println("name= " +name +"\nmodelno=" +modelno +"\nimeino=" + imeino);

	}
	
	public void accessSamsungStore()
	{
		System.out.println("access samsung store for download games and apps");
	}

}
