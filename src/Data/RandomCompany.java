package Data;



public class RandomCompany {


	//creating method to generate shares
	public static int RandomSharesInt() {
	int min = 500;
	int max = 1000;
	      
	int random_int = (int) (Math.random() * (max - min + 1) + min);
	return random_int;
	   
	}
	
	//creating method to generate share prices
	public static double RandomSharePrice() {
	int min = 10;
	int max = 100;
	      
	double random_double = (double)(Math.random() * (max - min + 1) + min);
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
