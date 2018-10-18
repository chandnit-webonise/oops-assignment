package cellphone;

public class Test {
	
	public static void main(String args[])
	{
		cellphone phone=new cellphone("black",30000,150);
		Samsungphone samsung=new Samsungphone("Gold",15000,179,"samsung","j7 max",100000010);
		Vivophone vivo=new Vivophone("Black",20000,145,"vivo","v2",102000010);
		Iphone iphone=new Iphone("Black",60000,172,"Iphone","Iphone6",102030030);

		cellphone ref;
		ref=phone;
		ref.calling(123456789);;
		ref.sendMessage(123456789,"Hello");
		ref.showdetails();
		
		ref=samsung;
		ref.calling(123456789);
		ref.sendMessage(123456789, "hiii");
		samsung.accessSamsungStore();
		ref.showdetails();
		
		ref=vivo;
		ref.calling(123456789);
		ref.sendMessage(123456789,"How are you");
		vivo.faceunlock();
		ref.showdetails();
		
		ref=iphone;
		ref.calling(123456789);
		ref.sendMessage(123456789, "whats up");
		iphone.siri();
		ref.showdetails();
	}

}
