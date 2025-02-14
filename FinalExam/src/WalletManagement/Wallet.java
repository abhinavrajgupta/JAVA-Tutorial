package WalletManagement;

public class Wallet {
	 double balance=50.0;
	 
	 public Wallet(double amount) throws InsufficientFundsException{
		 if (amount <= 0)
		 {
			 throw new IllegalArgumentException("Not Valid!");
		 }
		 try {
			if (amount > balance) {
				 System.out.println("Invalid!");
			 }
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	 }
}
