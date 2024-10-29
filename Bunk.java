/**
 * this class creats the bunk in which the camper will be sleeping at
 * 
 * @author Omar Habib ID:3742418
 */
public class Bunk {
	/**
	 * the building in which the camper is staying
	 */
	private String buildingName;
	/**
	 * the number of the bed
	 */
	private int bedNum;
	/**
	 * the price of the bed for a week
	 */
	private double weeklyPrice;

	/**
	 * the constructor which creats the bun object
	 * 
	 * @param building the building in which the camper is staying
	 * @param bedNumIn the number of the bed
	 * @param price    the price of the bed for a week
	 */

	public Bunk(String building, int bedNumIn, double price) {
		buildingName = building;
		bedNum = bedNumIn;
		weeklyPrice = price;
	}

	/**
	 * retrives the location of the building the camper is staying at
	 * 
	 * @return buildingName
	 */
	public String getBuilding() {
		return buildingName;
	}

	/**
	 * retrives the number of the bed
	 * 
	 * @return bedNum
	 */
	public int getBedNum() {
		return bedNum;
	}

	/**
	 * retrives the price of the bed for a wee
	 * 
	 * @return weeklyPrice
	 */
	public double getPrice() {
		return weeklyPrice;
	}
}
