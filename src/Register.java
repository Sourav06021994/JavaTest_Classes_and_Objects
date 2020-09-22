import java.util.HashMap;
import java.util.Map;

import billing.Bill;

import billingExceptions.InvalidItemScan;


public class Register {
	
    /*implement required methods*/
		

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Map<String,Integer> myItems=new HashMap<String,Integer>();
		
		for(int i=0;i<args.length;i+=2){
		 myItems.put(args[i],Integer.parseInt(args[i+1]));	
		}
        
        /*create this Register instance and call the appropriate method
          print the total_bill from the bill class
        */
        
	}

}
