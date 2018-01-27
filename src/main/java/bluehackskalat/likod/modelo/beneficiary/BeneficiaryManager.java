package bluehackskalat.likod.modelo.beneficiary;

import java.util.ArrayList;

public class BeneficiaryManager {
	private static BeneficiaryManager instance;
	private ArrayList<Beneficiary> beneficiaryList;
	
	private BeneficiaryManager() {
		beneficiaryList = new ArrayList<Beneficiary>();
		
		Beneficiary aeta = new Beneficiary();
		
		//SAMPLE GROUP 1
		aeta.setName("Aeta");           
		aeta.setDescription("The aeta is an indigenous group that...");
		
		aeta.setGoalMoney(10000);
		aeta.setCurrentMoney(0);
		
		aeta.setPictureDirectory("");
		aeta.setVideoURL("");
		
		
		beneficiaryList.add(aeta);
	}
	
	public static BeneficiaryManager getInstance() {
		if(instance == null) {
			instance = new BeneficiaryManager();
		}
		return instance;
	}
	
	public boolean addBeneficiary(Beneficiary beneficiary) {
		if(getBeneficiary(beneficiary.getName()) == null) {
			if(beneficiaryList.add(beneficiary)) {
				return true;
			}			
		}
		return false;
	}
	
	public boolean removeBeneficiary(Beneficiary beneficiary) {
		Beneficiary b = getBeneficiary(beneficiary.getName());
		if(b != null) {
			 if(beneficiaryList.remove(b)) {
				 return true;
			 }else {
				 return false;
			 }
		}
		return true;
	}
	
	public Beneficiary getBeneficiary(String name) {
		for(Beneficiary b: beneficiaryList) {
			if(b.getName().equalsIgnoreCase(name)) {
				return b;
			}
		}
		return null;
	}
	
	public Beneficiary getBeneficiary(int index) {
		if(index < beneficiaryList.size()) {
			return beneficiaryList.get(index);
		}
		return null;
	}

	public ArrayList<Beneficiary> getAllBeneficiary() {
		return beneficiaryList;
	}
}
