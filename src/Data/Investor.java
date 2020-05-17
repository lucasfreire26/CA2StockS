package Data;

public class Investor {

	//attributes
	private int id;
	private double budget;

	
	private Investor(BuilderInvestor builder) {
		this.id = builder.id;
		this.budget = builder.budget;
	}
	
	
	public String toString() {
		return "Investor: " + getId()  + ", Budget: " + getBudget() ;
	}
	
	//getters
	public int getId() {
		return id;
	}


	public double getBudget() {
		return budget;
	}
	
	public static class BuilderInvestor  { 

		private int id;
		private double budget;
		
		public BuilderInvestor (int id, double budget) {
			
			
		this.budget = budget;
		this.id = id;
 
		}
		
		//builder
		public Investor build() {
			return new Investor(this);
			}

	
	}
	
}
