/**
 * this class is driver that initilizes the Bunk and the Camper classes
 * 
 * @author Omar Habib ID:3742418
 */
public class Lab3TestDriver {
	public static void main(String[] args) {

		Bunk bed7 = new Bunk("Chickadee Lodge", 7, 155.75);
		Camper anna = new Camper("Anna Marie Sullivan", 250.00, 148.30, 150.00, bed7);
		anna.setExcursionFees(178.80);

		Bunk bed16 = new Bunk("Moose Hall", 16, 131.25);
		Camper porter = new Camper("Porter Smith", 340.00, 277.88, 0, bed16);
		Bunk bed9 = new Bunk("Wolf Lodge", 9, 147.00);
		porter.setBunk(bed9);

		Bunk bed11 = new Bunk("Brookside Cabin", 11, 385.00);
		Camper katharine = new Camper("Katharine Doucet", 565.30, 0, 175.00, bed11);
		katharine.setCampFees(525.00);

		System.out.println(anna.getOnSiteMailLabel());
		System.out.println("Total Amount of Fees Owing: " + anna.getTotalWeeklyFeesOwing());

		System.out.println(porter.getOnSiteMailLabel());
		System.out.println("Total Amount of Fees Owing: " + porter.getTotalWeeklyFeesOwing());

		System.out.println(katharine.getOnSiteMailLabel());
		System.out.println("Total Amount of Fees Owing: " + katharine.getTotalWeeklyFeesOwing());

	}
}
