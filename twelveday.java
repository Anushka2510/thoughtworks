package tw;

public class twelveday {
	public static void main(String[] args) {

		for (int i = 1; i <= 12; i++) {
			System.out.print("\n On the ");

			switch (i) {
			case 1:
				System.out.print("First");
				break;

			case 2:
				System.out.print("Second");
				break;

			case 3:
				System.out.print("Third");
				break;

			case 4:
				System.out.print("Fourth");
				break;

			case 5:
				System.out.print("Fifth");
				break;

			case 6:
				System.out.print("Sixth");
				break;
			case 7:
				System.out.print("Seventh");
				break;
			case 8:
				System.out.print("Eighth");
				break;
			case 9:
				System.out.print("Ninth");
				break;
			case 10:
				System.out.print("Tenth");
				break;
			case 11:
				System.out.print("Eleventh");
				break;
			case 12:
				System.out.print("Twelfth");
				break;

			}

			System.out.print(" Day of Christmas my true love gave to me:");

			for (int m = i; m >= 1; m--) {
				switch (m) {
				case 1:
					if (i != 1)
						System.out.print("and");
					System.out.print(" a partridge in a pear tree ");
					break;
				case 2:
					System.out.print(" two Turtle Doves, ");
					break;
				case 3:
					System.out.print(" three French Hens, ");
					break;
				case 4:
					System.out.print(" four Calling Birds, ");
					break;
				case 5:
					System.out.print(" five Golden Rings, ");
					break;
				case 6:
					System.out.print(" six Geese a laying, ");
					break;
				case 7:
					System.out.print(" seven Swans a swimming, ");
					break;
				case 8:
					System.out.print(" eight Maids a milking, ");
					break;
				case 9:
					System.out.print(" nine Ladies Dancing, ");
					break;
				case 10:
					System.out.print(" ten Lords a leaping, ");
					break;
				case 11:
					System.out.print(" eleven Pipers piping, ");
					break;
				case 12:
					System.out.print(" twelve Drummers Drumming, ");
					break;
				}
			}

		}
	}
}
