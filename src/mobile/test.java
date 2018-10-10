
package mobile;
import java.util.Scanner;

public class test {
public static void main(String args[])
{
	int ch;
	  Mobile m=new Mobile("Yes","yes","Dual/Single");
	 Samsung s=new Samsung("yes","yes",32);
	 iphone_Xs is=new iphone_Xs("black","yes",90000);
	 iphone_7 i=new iphone_7(32,32,15000);
	 Android a=new Android(true,true,1);
	 MI mi=new MI("yes","3G/4G",32);
	
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Enter iosbrand");
		System.out.println("2.Enter Androidbrand");
		System.out.println("3.Enter sms facility");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("ios");
		System.out.println("iphone XS");
		System.out.println("Iphone_7"); 
		 System.out.println("Enter ios brand\n");
	      	m.setBrand(sc.next());
	      	System.out.println("Enter price");
		       is.setPrice(sc.nextInt());
		       System.out.println(" RAM is");
		       System.out.println("Ram:" + i.getRam());
		       System.out.println("Enter simtype");
				 System.out.println("simtype:" + m.getSType());
				 System.out.println("Enter Type");
				 m.setStype(sc.next());
				
		       	break;
		       	
		case 2:System.out.println("Android");
			System.out.println("Samsung");
				System.out.println("MI"); 
				 System.out.println("Enter Androidbrand\n");
			      	m.setBrand(sc.next());
			      	System.out.println("Enter RAM");
			      	s.setRam(sc.nextInt());
			      	System.out.println("Enter Networksupport");
			      	mi.setNetworksupport(sc.next());
			      	System.out.println("Enter simtype");
					 System.out.println("simtype:" + m.getSType());
					 System.out.println("Enter Type");
					 m.setStype(sc.next());
					  	
			       	break;
				
		case 3:System.out.println("Is there SMS facility:" + m.getSms());
		System.out.println("Enter Message");
		m.setSms(sc.next());
		break;
		
		
		 default:System.out.println("Wrong entry");
		}
	}while(ch!=3);
	
	
}
}
