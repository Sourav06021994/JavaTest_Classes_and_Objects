import java.util.HashMap;
import java.util.Map;

import billing.Bill;

import billingExceptions.InvalidItemScan;


public class Register {
	
    /*implement required methods*/
		
static Map<String,Integer> myItems=new HashMap<String,Integer>();
	static Map< String,Float> itemPrice=new HashMap<String, Float>();
	Bill bill=finishCheckout();
	
    /*implement required methods*/
	void startCheckout()
	{
		double price=0.0;
		 for (Map.Entry<String,Integer> entry : myItems.entrySet())
		 {
			 price=0.0;
			 try
			 {
	            price=scanItem(entry.getKey()).doubleValue();
	            bill.addToBill(price);
			 }
			catch (Exception e) 
			 {
				System.out.println("Invalid Item!!");
			 }
}
		 
		 
	}
		Bill finishCheckout()
		{
			Bill billing=new Bill();
			return billing;
		}
		Double scanItem(String item) throws Exception
		{
double price=0;
if(itemPrice.containsKey(item))
{
	price=myItems.get(item)*itemPrice.get(item);
}
else 
	throw new InvalidItemScan();
return price;
		}
		static Register getInstance()
		{
			Register register=new Register();
			return register;
		}
		void additems(Map<String,Float> itemPriceMap)
		{
			itemPriceMap.put("apples",(float)2.0);
			itemPriceMap.put("orange",(float)1.5);
			itemPriceMap.put("mango",(float)1.2);
			itemPriceMap.put("grapes",(float)1.0);
		}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		for(int i=0;i<args.length;i+=2){
		 myItems.put(args[i],Integer.parseInt(args[i+1]));	
		}
        
        /*create this Register instance and call the appropriate method
          print the total_bill from the bill class
        */
        
	}

}
