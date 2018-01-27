package bluehackskalat.likod.modelo.beneficiary;

import java.util.ArrayList;

public class Beneficiary {
	private String name;
	private String description;
	private String category;
	//directory
	private String pictureDirectory;
	private String videoURL;

	private long goalMoney;
	private long currentMoney; 
	
	//for storing the different images that will be seen in the gallery
	private ArrayList<String> galleryDirectory;
	
	//private ArrayList<Miscellaneous> miscNeeded;
	public Beneficiary() {
		currentMoney = 0;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureDirectory() {
		return pictureDirectory;
	}

	public void setPictureDirectory(String pictureDirectory) {
		this.pictureDirectory = pictureDirectory;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public long getGoalMoney() {
		return goalMoney;
	}

	public void setGoalMoney(long goalMoney) {
		this.goalMoney = goalMoney;
	}

	public long getCurrentMoney() {
		return currentMoney;
	}

	public void setCurrentMoney(long goalCurrent) {
		this.currentMoney = goalCurrent;
	}
	
	public void addCurrentMoney(long moneyToAdd) {
		this.currentMoney += moneyToAdd;
	}

	public void deductCurrentMoney(long moneyToRemove) {
		this.currentMoney -= moneyToRemove;
	}
	
	public boolean isGoalReached() {
		return (currentMoney >= goalMoney) ? true : false;
	}


	public ArrayList<String> getGalleryDirectory() {
		return galleryDirectory;
	}

	public void setGalleryDirectory(ArrayList<String> galleryDirectory) {
		this.galleryDirectory = galleryDirectory;
	}
	
	public void addImageInGalleryDirectory(String imageDirectory) {
		this.galleryDirectory.add(imageDirectory);
	}
	
	public void removeImageInGalleryDirectory(String imageDirectory) {
		this.galleryDirectory.remove(imageDirectory);
	}
	
	public int getPercentageToGoal() {
		return (int)(goalMoney/currentMoney);
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
//	public ArrayList<Miscellaneous> getMiscNeeded() {
//		return miscNeeded;
//	}
//
//	public void setMiscNeeded(ArrayList<Miscellaneous> miscNeeded) {
//		this.miscNeeded = miscNeeded;
//	}
	
	
	
}
