package mobile;

public class Mobile {
String sms,mms,brand;
String simtype;

public Mobile()
{
	
}


public Mobile(String sms,String mms,String type)
{
	setSms(sms);
	setMms(mms);
	setStype(type);
}

public void setSms(String sms)
{
	this.sms=sms;
}
public String getSms()
{
 return this.sms;
}
public void setMms(String mms)
{
	this.mms=mms;
}
public String getMms()
{
 return this.mms;
}

public void setStype(String type)
{
	this.simtype=type;
}
public String getSType()
{
 return this.simtype;
}

public void setBrand(String brand)
{
	this.brand=brand;
}
public String getBrand()
{
 return this.brand;
}
}

