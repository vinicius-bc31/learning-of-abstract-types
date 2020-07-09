package entities;

public class Individual extends Payer{

	private Double healthExpenditures;

	public Individual(String name, Double income, Double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double taxes() {
		if ( getIncome() < 20000.0) {
			return getIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
	
}
