import java.util.Scanner;
	public class DaysHoursMinutesSeconds {
		private static Scanner input;


		 public static void main(String[] Strings) {


		        double secondsInday = 60 * 60 * 24;

		        Scanner input = new Scanner(System.in);

		        System.out.print("Number of seconds: ");

		        int n = input.nextInt();

		        
		        int days = n/86400;
		        int hours = (n%86400)/3600;
		        int minutes = ((n%86400)%3600) /60;
		        int sec =(((n%86400)%3600)%60);


		        System.out.println((int) n+ " Seconds are " + days + " days " + hours + " hour " + minutes + " minutes and " +sec+ " seconds");
		    }
		}

