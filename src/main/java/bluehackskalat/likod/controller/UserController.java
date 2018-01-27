package bluehackskalat.likod.controller;

import com.google.gson.Gson;

import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;

public class UserController {
	Gson gson = new Gson();
	public String getUser(String name) {
		User user = UserManager.getInstance().getUser(name);
		//convert to json
		String jsonInString = gson.toJson(user);
		System.out.println("user json : " + jsonInString);
		return jsonInString;
	}

}
