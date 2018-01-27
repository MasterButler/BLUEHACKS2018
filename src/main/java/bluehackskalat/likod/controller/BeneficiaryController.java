package bluehackskalat.likod.controller;

import java.util.ArrayList;

import com.google.gson.Gson;

import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;


public class BeneficiaryController {
//	BeneficiaryManager.getInstance();
	public static String getAllBeneficiary(){
		Gson gson = new Gson();
		
		ArrayList<Beneficiary> bList = BeneficiaryManager.getInstance().getAllBeneficiary();
		String jsonString;
		//convert to json
		String jsonInString = gson.toJson(bList);
		System.out.println("jsonString: " + jsonInString);
		return jsonInString;
	}
	
	public static String getBeneficiary(String name) {
		Gson gson = new Gson();
		
		Beneficiary beneficiary = BeneficiaryManager.getInstance().getBeneficiary(name);
		//convert to json
		String jsonInString = gson.toJson(beneficiary);
		System.out.println("jsonString 2 : " + jsonInString);
		return jsonInString;
	}
}