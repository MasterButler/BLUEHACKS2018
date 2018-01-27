import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;
import bluehackskalat.likod.transaksyon.DonationManager;

public class Driver {
	public static void main(String[] args) {
		
		for(int i = 0; i < BeneficiaryManager.getInstance().getAllBeneficiary().size(); i++) {
			System.out.println("======" + (i+1) + "======");
			System.out.println(BeneficiaryManager.getInstance().getAllBeneficiary().get(i).getName());
		}
		Beneficiary b = BeneficiaryManager.getInstance().getAllBeneficiary().get(0);
		User u = UserManager.getInstance().getAllUser().get(0);
		
		DonationManager.donateUsingMoney(u, 1000, b);
		System.out.println(b.getName() + " money: " + b.getCurrentMoney() + "/" + b.getGoalMoney());
		
		System.out.println();
		System.out.println("Credit Count: " + u.getCreditCount());
		System.out.println(DonationManager.donateUsingCredit(u, 2000, b));
		System.out.println(b.getName() + " money: " + b.getCurrentMoney() + "/" + b.getGoalMoney());
		
		System.out.println();
		System.out.println("Credit Count: " + u.getCreditCount());
		System.out.println(DonationManager.donateUsingCredit(u, 1000, b));
		System.out.println(b.getName() + " money: " + b.getCurrentMoney() + "/" + b.getGoalMoney());

	}
}
