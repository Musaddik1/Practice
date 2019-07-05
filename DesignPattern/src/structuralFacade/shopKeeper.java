package structuralFacade;

public class shopKeeper 
{

	private mobileShop samsung;
	private mobileShop iphone;
	private mobileShop blackberry;
	public shopKeeper()
	{
		samsung=new Samsung();
		iphone=new Iphone();
		blackberry=new Blackberry();
	}
	public void samsungSale()
	{
		samsung.mobileNo();
		samsung.mobilePrice();
	}
	public void iphoneSale()
	{
		iphone.mobileNo();
		iphone.mobilePrice();
	}
	public void blackberrySale()
	{
		blackberry.mobileNo();
		blackberry.mobilePrice();
	}
}
