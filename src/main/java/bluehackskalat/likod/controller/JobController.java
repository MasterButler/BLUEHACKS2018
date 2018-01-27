package bluehackskalat.likod.controller;

import java.util.ArrayList;

import com.google.gson.Gson;

import bluehackskalat.likod.modelo.beneficiary.Beneficiary;
import bluehackskalat.likod.modelo.beneficiary.BeneficiaryManager;
import bluehackskalat.likod.modelo.trabaho.Job;
import bluehackskalat.likod.modelo.trabaho.JobManager;
import bluehackskalat.likod.modelo.user.User;
import bluehackskalat.likod.modelo.user.UserManager;

public class JobController {
	Gson gson = new Gson();
	
	public String getAllJob(){
		ArrayList<Job> jList = JobManager.getInstance().getAllJob();
		String jsonString;
		//convert to json
		String jsonInString = gson.toJson(jList);
		System.out.println("job jsonString: " + jsonInString);
		return jsonInString;
	}
	
	public String getJob(String jobName) {
		Job job = JobManager.getInstance().getJob(jobName);
		//convert to json
		String jsonInString = gson.toJson(job);
		System.out.println("job json : " + jsonInString);
		return jsonInString;
	}

}
