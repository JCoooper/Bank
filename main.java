
import java.util.ArrayList;
import java.util.Scanner;
//------------------------------------------------------------------------------

class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double money;
		int acc;
		int accType;

		ArrayList<BAccount> index = new ArrayList<BAccount>();
		index.add(new BAccount(1000, 2, 0));
		index.add(new BAccount(100, 2, 1));

		// accType = acc.getAccType();

		boolean q = true;
		String input;
		System.out.println("Enter account number: ");
		acc = s.nextInt();

		accType = index.get(acc).getAccType();

		while (q == true) {
			System.out.println(
					"Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit");
			input = s.nextLine();

			if (input.equals("D")) {
				System.out.println("Enter da moneyz");
				money = s.nextInt();
				index.get(acc).setBal(index.get(acc).getBal() + money);
				System.out.println(index.get(acc).getBal());

			} else if (input.equals("W")) {
				if (accType == 1) {

				}

			}

		}
	}
}

/*
 * import java.util.Scanner;
 * //---------------------------------------------------------------------------
 * ---
 * 
 * class main { public static void main(String[] args) { Scanner s = new
 * Scanner(System.in);
 * 
 * double money; double acc;
 * 
 * BAccount acc1 = new BAccount(0, 2, 001);
 * 
 * boolean q = true; String input;
 * System.out.println("Enter da moneyz account number"); acc = s.nextInt();
 * while (q == true) { System.out.println(
 * "Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit"
 * ); input = s.nextLine();
 * 
 * if (input.equals("D")) { System.out.println("Enter da moneyz"); money =
 * s.nextInt();
 * 
 * acc1.setBal(acc1.getBal() + money);
 * 
 * System.out.println(acc1.getBal());
 * 
 * } else if (input.equals("W")) {
 * 
 * }
 * 
 * } } }
 */