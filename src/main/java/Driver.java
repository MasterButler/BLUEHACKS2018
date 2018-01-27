import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import bluehackskalat.likod.controller.BeneficiaryController;
import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;
import bluehackskalat.likod.modelo.kahoysaloob.LoginManager;
import bluehackskalat.likod.modelo.trabaho.JobManager;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;
import bluehackskalat.likod.transaksyon.DonationManager;

public class Driver {
	public static void main(String[] args){
//		read images from directory
//		InputStream resourceAsStream = Driver.class.getClassLoader().getResourceAsStream("yuta.png");
//		String here = System.getProperty("user.dir") + "\\src\\main\\resources\\yuta.png";
//		BufferedImage img = ImageIO.read(new File(here));
		
		for(int i = 0; i < BeneficiaryManager.getInstance().getAllBeneficiary().size(); i++) {
			System.out.println("======" + (i+1) + "======");
			Beneficiary b = BeneficiaryManager.getInstance().getAllBeneficiary().get(i);
			System.out.println(b.getName());
			System.out.println("=============");
			System.out.println(b.getDescription());
			System.out.println(b.getPictureDirectory());
			System.out.println("MONEY: " + b.getCurrentMoney() + "/" + b.getGoalMoney());
			System.out.println();
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
		
//		User toLog = LoginManager.loginUser("wisner@gmail.com", "pass");
//		System.out.println(toLog.getName());
	}
}
