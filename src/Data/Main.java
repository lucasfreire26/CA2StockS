package Data;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array to store and print companies
		ArrayList<Company> companies = CreateRandomCompanies(100);
		for (Company company : companies) {
			System.out.println(company.toString());

		}
		
		//array to store and print investors 
		ArrayList<Investor> investors = CreateRandomInvestor(100);
		for (Investor investor : investors) {
			System.out.println(investor.toString());
		}
	}

	// creating random companies
	private static ArrayList<Company> CreateRandomCompanies(int numberOfCompanies)  {

		ArrayList<Company> companies = new ArrayList<Company>();

		RandomCompany rc = new RandomCompany();

		for (int i = 0; i < numberOfCompanies; i++) {

			double sharePrice = rc.RandomSharePrice();
			int shares = rc.RandomSharesInt();
			int id = i+1;
			Company.BuilderCompany builder = new Company.BuilderCompany(sharePrice, shares, id);
			Company company = builder.build();
			companies.add(company);
		}

		return companies;

	}

	//creating random investors
	private static ArrayList<Investor> CreateRandomInvestor(int numberOfInvestors) {


		ArrayList<Investor> investors = new ArrayList<Investor>();

		RandomInvestor ri = new RandomInvestor();

		for (int i = 0; i < numberOfInvestors; i++) {
			double budget = ri.RandomBudgetInt();
			int id = i+1;
			Investor.BuilderInvestor builder = new Investor.BuilderInvestor(id, budget);
			Investor investor = builder.build();
			investors.add(investor);

		}

		return investors;
	}
}
