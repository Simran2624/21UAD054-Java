package multLevInh;

class car 
{
	 public void mName()
	   {
	     System.out.println("The class for Rolls-Royce car");
	   }
}
class Model extends car
{
	 public void mo()
	   {
	     System.out.println("Car model: Rolls-Royce Phantom");
	   }	
}

class price extends Model
{
	 public void Price()
	   {
	     System.out.println("Car price: 6.95-7.95 Cr");
	   }


public static void main(String[] args)
{
	price c1 = new price();
	c1.mName();
	c1.mo();
	c1.Price();
	
}
}
