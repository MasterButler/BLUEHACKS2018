package bluehackskalat.likod.modelo.beneficiary;

import java.util.ArrayList;

import bluehackskalat.likod.tagatulong.ImageUtil;

public class BeneficiaryManager {
	private static BeneficiaryManager instance;
	private ArrayList<Beneficiary> beneficiaryList;
	
	private BeneficiaryManager() {
		beneficiaryList = new ArrayList<Beneficiary>();
		
		//SAMPLE GROUP 1
		Beneficiary aeta = new Beneficiary();		
		aeta.setName("Aeta");           
		aeta.setDescription("The Aeta or Agta, are an indigenous people who live in scattered, isolated mountainous parts of the island of Luzon, the Philippines. These people are considered to be Negritos, whose skin ranges from dark to very dark brown, and possessing features such as a small stature and frame; hair of a curly to kinky texture and a higher frequency of naturally lighter colour (blondism) relative to the general population; small nose; and dark brown eyes. They are thought to be among the earliest inhabitants of the Philippines, preceding the Austronesian migrations.");
		aeta.setGoalMoney(10000);
		aeta.setCurrentMoney(0);
		aeta.setPictureDirectory(ImageUtil.concatPathToFileName("aeta.jpeg"));
		aeta.setVideoURL("");
		
		//SAMPLE GROUP 2
		Beneficiary mangyan = new Beneficiary();
		mangyan.setName("Mangyan");           
		mangyan.setDescription("Mangyan is the generic name for the eight indigenous groups found on the island of Mindoro, southwest of the island of Luzon, the Philippines, each with its own tribal name, language, and customs. The total population may be around 280,000, but official statistics are difficult to determine under the conditions of remote areas, reclusive tribal groups and some having little if any outside world contact. The ethnic groups of the island, from north to south, are: Iraya, Alangan, Tadyawan, Tawbuid (called Batangan by lowlanders on the west of the island), Buhid, and Hanunoo. An additional group on the south coast is labelled Ratagnon. They appear to be intermarried with lowlanders. The group known on the east of Mindoro as Bangon may be a subgroup of Tawbuid, as they speak the 'western' dialect of that language. They also have a kind of poetry which is called the Ambahan.");
		mangyan.setGoalMoney(100);
		mangyan.setCurrentMoney(0);
		mangyan.setPictureDirectory(ImageUtil.concatPathToFileName("mangyan.jpg"));
		mangyan.setVideoURL("");
				
		//SAMPLE GROUP 3
		Beneficiary tboli = new Beneficiary();
		tboli.setName("Tboli");           
		tboli.setDescription("The Tboli people are one of the indigenous peoples of South Cotabato in Southern Mindanao. The body of ethnographic and linguistic literature on Mindanao, they are variously known as Tboli, T'boli, Tböli, Tiboli, Tibole, Tagabili, Tagabeli, and Tagabulu. They term themselves Tboli or T'boli. Their whereabouts and identity are somewhat imprecise in the literature; some publications present the Tboli and the Tagabili as distinct peoples; some locate the Tbolis to the vicinity of the Lake Buluan in the Cotabato Basin or in Agusan del Norte. The Tbolis, then, reside on the mountain slopes on either side of the upper Alah Valley and the coastal area of Maitum, Maasim and Kiamba. In former times, the Tbolis also inhabited the upper Alah Valley floor. After World War II, i.e., since the arrival of settlers originating from other parts of the Philippines, they have been gradually pushed onto the mountain slopes. As of now, they are almost expelled from the fertile valley floor.");
		tboli.setGoalMoney(20000);
		tboli.setCurrentMoney(0);
		tboli.setPictureDirectory(ImageUtil.concatPathToFileName("tboli.jpg"));
		tboli.setVideoURL("");
		
		
		Beneficiary blind = new Beneficiary();
		
		//SAMPLE GROUP 4
		blind.setName("Juan");           
		blind.setDescription("Visual impairment, also known as vision impairment or vision loss, is a decreased ability to see to a degree that causes problems not fixable by usual means, such as glasses. Some also include those who have a decreased ability to see because they do not have access to glasses or contact lenses. Visual impairment is often defined as a best corrected visual acuity of worse than either 20/40 or 20/60. The term blindness is used for complete or nearly complete vision loss. Visual impairment may cause people difficulties with normal daily activities such as driving, reading, socializing, and walking.");
		blind.setGoalMoney(20300);
		blind.setCurrentMoney(0);
		blind.setPictureDirectory(ImageUtil.concatPathToFileName("blind.jpg"));
		blind.setVideoURL("");
		
		
		
		Beneficiary deaf = new Beneficiary();
		
		//SAMPLE GROUP 1
		deaf.setName("Hannah");           
		deaf.setDescription("A person who is not able to hear as well as someone with normal hearing – hearing thresholds of 25 dB or better in both ears – is said to have hearing loss. Hearing loss may be mild, moderate, severe, or profound. It can affect one ear or both ears, and leads to difficulty in hearing conversational speech or loud sounds.");
		deaf.setGoalMoney(60000);
		deaf.setCurrentMoney(0);
		deaf.setPictureDirectory(ImageUtil.concatPathToFileName("deaf.jpg"));
		deaf.setVideoURL("");
		
		
		Beneficiary alzheimers = new Beneficiary();
		
		//SAMPLE GROUP 1
		alzheimers.setName("John");           
		alzheimers.setDescription("Alzheimer's is the most common form of dementia, a general term for memory loss and other cognitive abilities serious enough to interfere with daily life. Alzheimer's disease accounts for 60 to 80 percent of dementia cases.  Alzheimer's is not a normal part of aging. The greatest known risk factor is increasing age, and the majority of people with Alzheimer's are 65 and older. But Alzheimer's is not just a disease of old age. Approximately 200,000 Americans under the age of 65 have younger-onset Alzheimer’s disease (also known as early-onset Alzheimer’s). ");
		alzheimers.setGoalMoney(20000);
		alzheimers.setCurrentMoney(0);
		alzheimers.setPictureDirectory(ImageUtil.concatPathToFileName("alzheimers.jpg"));
		alzheimers.setVideoURL("");
		
		beneficiaryList.add(aeta);
		beneficiaryList.add(mangyan);
		beneficiaryList.add(tboli);
		beneficiaryList.add(blind);
		beneficiaryList.add(deaf);
		beneficiaryList.add(alzheimers);
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
