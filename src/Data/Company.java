package Data;

public class Company {

	//attributes
	private int id;
	private int shares;
	private double sharePrice;
	
	
	private Company(BuilderCompany builder) {
		this.id = builder.id;
		this.shares = builder.shares;
		this.sharePrice = builder.sharePrice;

	}
	
	@Override
	public String toString() {
		return "Company: " + getId() + ", Shares: " + getShares() +
				", Share Price: " + getSharePrice();
	}
	
	//getters
	public int getId() {
		return this.id;
	}



	public int getShares() {
		return this.shares;
	}


	public double getSharePrice() {
		return this.sharePrice;
	
	}


	
public static class BuilderCompany {

	private double sharePrice;
	private int shares;
	private int id;
	
	//builder for the company passing shareprice and id
public BuilderCompany (double sharePrice, int shares, int id) {
	
	this.sharePrice = sharePrice;
	this.shares = shares;
	this.id = id;
	}

	//builder
	public Company build() {
		return new Company(this);

	}


    }


}
