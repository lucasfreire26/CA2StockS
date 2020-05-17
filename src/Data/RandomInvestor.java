package Data;


public class RandomInvestor {


	//method to generate budget
	public static double RandomBudgetInt() {
	int min = 100;
	int max = 10000;
	      
	double random_double = Math.random() * (max - min + 1) + min; 
	//System.out.println(random_int); 
	return round(random_double, 2);
	
	}
	
	//source: stackoverflow
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	

	}
