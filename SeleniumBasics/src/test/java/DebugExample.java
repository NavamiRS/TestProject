
public class DebugExample {

	public static void main(String[] args) {
		int term =10;
		float interestRate=10;
		double amount=10000;
		double interestAmount=calcInterest(term,interestRate,amount);
		double totalAmount=amount+interestAmount;
		System.out.println(totalAmount);

	}

	private static double calcInterest(int term, float interestRate, double amount) {
		double res=term*interestRate*amount;
		res=res/100;
		
		return res;
		
		
	}

}
