package bluehackskalat.likod.modelo.trabaho;

import java.util.ArrayList;

public class JobManager {
	private static JobManager instance;
	private ArrayList<Job> jobList;
	
	private JobManager() {
		jobList = new ArrayList<Job>();
		
		Job job1 = new Job();
		job1.setName("Busywork");
		job1.setPicture("");
		job1.setDescription("A job where you are productive");
		
		jobList.add(job1);
	}
	
	public static JobManager getInstance() {
		if(instance == null) {
			instance = new JobManager();
		}
		return instance;
	}
	
	public Job getJob(String jobName) {
		for(Job j : jobList) {
			if(j.getName().equalsIgnoreCase(jobName)) {
				return j;
			}
		}
		return null;
	}
	
	public boolean addJob(Job job) {
		if(jobList.add(job)) {
			return true;
		}
		return false;
	}
	
	public boolean removeJob(Job job) {
		Job j = getJob(job.getName());
		if(j != null) {
			if(jobList.remove(job)) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Job> getAllJob(){
		return jobList;
	}
}
