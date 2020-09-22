package billing;

public class Bill {
	ArrayList<String> items=new ArrayList<String>();
	double totalprice=0.0;
	public double getTotalBill()
	{
		return totalprice;
	}
  public void addToBill(double price)
  {
	 totalprice+=price; 
  }
  
	  
}
