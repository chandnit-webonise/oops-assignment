
package mobile;
import java.util.Scanner;

public class test {
public static void main(String args[])
{
	int ch;
	String brand;
	Mobile m=new Mobile("Yes","yes","Dual/Single");
	Samsung s=new Samsung("yes","yes",32);
	iphone_7 i=new iphone_7(32,32,15000);
	Android a=new Android(true,true,1);
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Enter subbrand");
		System.out.println("3.Enter sms facility");
		System.out.println("4.is there simtype");
		System.out.println("5.Enter");
		System.out.println("6.Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("ios");
		System.out.println("iphone XS");
		System.out.println("Iphone_7"); 
		 System.out.println("Enter subbrand\n");
	      	m.setBrand(sc.next());
	      	System.out.println("Enter price");
		       i.setPrice(sc.nextInt());
		       System.out.println("Enter RAM");
		       i.setRam(sc.nextInt());
		       	break;
		       	
		case 2:System.out.println("Android");
			System.out.println("Samsung");
				System.out.println("MI"); 
				 System.out.println("Enter subbrand\n");
			      	m.setBrand(sc.next());
			      	System.out.println("Enter RAM");
			      	s.setRam(sc.nextInt());
			      	System.out.println("Enter ");
			      	
			       	break;
				
		case 4:System.out.println("Is there SMS facility:" + m.getSms());
		System.out.println("Enter Message");
		m.setSms(sc.next());
		
				break;
		    
		case 5:System.out.println("Enter simtype");
		 System.out.println("simtype:" + m.getSType());
		 System.out.println("Enter Type");
		 m.setStype(sc.next());
		
		 
		
		 	break;
		
		 default:System.out.println("Wrong entry");
		break;
		}
	}while(ch!=5);
	
	
}
}
