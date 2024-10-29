/**
 * this class creats the camper and stores the campers info
 * 
 * @author Omar Habib ID:3742418
 */

public class Camper {
	/**
	 * the name of the camper
	 */
	private String name;
	/**
	 * the weely camp fees
	 */
	private double weeklyCampFees;
	/**
	 * the weekly excursion fees
	 */
	private double weeklyExcursionFees;
	/**
	 * the weekly funding the camper will be receiving
	 */
	private double weeklyFundingSupport;
	/**
	 * the bun in which the camper will be at
	 */
	private Bunk bunk;

	/**
	 * the constructoe which will be creating the camper object
	 * 
	 * @param nameIn         the name of the camper
	 * @param campFees       the weely camp fees
	 * @param excursionFees  the weekly excursion fees
	 * @param fundingSupport the weekly funding the camper will be receiving
	 * @param bunkIn         the bun in which the camper will be at
	 */
	public Camper(String nameIn, double campFees, double excursionFees,
			double fundingSupport, Bunk bunkIn) {
		name = nameIn;
		weeklyCampFees = campFees;
		weeklyExcursionFees = excursionFees;
		weeklyFundingSupport = fundingSupport;
		bunk = bunkIn;
	}

	/**
	 * this mutator method changes name of the camper
	 * 
	 * @param nameIn
	 */
	public void setName(String nameIn) {
		name = nameIn;
	}

	/**
	 * this mutator changes the amount of the weekly camp fees
	 * 
	 * @param campFees
	 */
	public void setCampFees(double campFees) {
		weeklyCampFees = campFees;
	}

	/**
	 * this mutator changes the weekly excursion fees
	 * 
	 * @param excursionFees
	 */
	public void setExcursionFees(double excursionFees) {
		weeklyExcursionFees = excursionFees;
	}

	/**
	 * this mutator changes the weely funding support the camper is reciveiving
	 * 
	 * @param fundingSupport
	 */
	public void setFundingSupport(double fundingSupport) {
		weeklyFundingSupport = fundingSupport;
	}

	/**
	 * this mutator changes the bunk in which the camper is staying at
	 * 
	 * @param bunkIn
	 */
	public void setBunk(Bunk bunkIn) {
		bunk = bunkIn;
	}

	/**
	 * this method calculates the weekly fees owing by the camper
	 * 
	 * @return weeklyCampFees + weeklyExcursionFees + bunk.getPrice() -
	 *         weeklyFundingSupport
	 */
	public double getTotalWeeklyFeesOwing() {
		return weeklyCampFees + weeklyExcursionFees + bunk.getPrice() - weeklyFundingSupport;
	}

	/**
	 * this method returns the location in which the camper is staying at
	 * 
	 * @return name + "\n" + bunk.getBuilding() + ", bed " + bunk.getBedNum()
	 */
	public String getOnSiteMailLabel() {
		return name + "\n" + bunk.getBuilding() + ", bed " + bunk.getBedNum();
	}
}
