package bluehackskalat.likod.controller;

import com.google.gson.Gson;

import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;
import bluehackskalat.likod.transaksyon.DonationManager;

public class UserController {
	public static String getUser(String name) {
		Gson gson = new Gson();
		User user = UserManager.getInstance().getUser(name);
		//convert to json
		String jsonInString = gson.toJson(user);
		System.out.println("user json : " + jsonInString);
		return jsonInString;
	}
	
	public void donateUsingMoney(String uName, long amount, String bName) {
		User u = UserManager.getInstance().getUser(uName);
		Beneficiary b = BeneficiaryManager.getInstance().getBeneficiary(bName);
		
		if(DonationManager.donateUsingMoney(u, amount, b)) {
			System.out.println("Successfully donated");
		}
		else {
			System.out.println("Failed to donate");
		}
	}
	
	public void donateUsingCredit(String uName, long amount, String bName) {
		User u = UserManager.getInstance().getUser(uName);
		Beneficiary b = BeneficiaryManager.getInstance().getBeneficiary(bName);
		
		if(DonationManager.donateUsingCredit(u, amount, b)) {
			System.out.println("Successfully donated");
		}
		else {
			System.out.println("Failed to donate");
		}
	}

}
