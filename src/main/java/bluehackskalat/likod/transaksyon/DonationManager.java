package bluehackskalat.likod.transaksyon;

import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;

public class DonationManager {
	
	public static boolean donateUsingMoney(User u, long amount, Beneficiary b) {
		b.addCurrentMoney(amount);
		return true;
	}
	
	public static boolean donateUsingCredit(User u, long amount, Beneficiary b) {
		if(amount <= u.getCreditCount()) {
			u.deductCreditCount(amount);
			b.addCurrentMoney(amount);
			
			return true;
		}
		return false;
	}
}
