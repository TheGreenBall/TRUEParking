/*
 * $2 minimum
 $0.50 per hour for each hour.



 * Example output:
 *
 *	 Pack Em and Stack Em
 *        Parking Garage
 *
 *Address:	1900 E. Thomas
 *		    Arlington Heights, IL 60004
 *		
 * Number of hours:	3
 *
 * Total Cost: $3.50
 *
 *
 * Thank You for Your Service!
 */

public class Parking {

	public static void main( String args[] ) {
	
		int number_of_hours = IO.getInt();

		double r = getTotal(number_of_hours);
		printTotal(number_of_hours, r);
		
	}


	public static double getTotal(int a) {

		double total = 2 + (0.5 * a);
		return total;

	}

	public static void printTotal(int a, double r) {


		System.out.println(" Pack Em and Stack Em\n" +
				" *        Parking GarageAddress:\t1900 E. Thomas\n" +
				" *\t\t    Arlington Heights, IL 60004 \n Number of hours:\t" + a + "\n" +
				" *\n" +
				" * Total Cost: " + r + "\n" +
				" *\n" +
				" *\n" +
				" * Thank You for Your Service!" );

	}

}
