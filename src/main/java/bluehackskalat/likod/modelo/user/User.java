package bluehackskalat.likod.modelo.user;

public class User {
	private String name;
	private String email;
	private String contactNo;
	
	private String homeAddress;
	
	private int bDayDate;
	private int bDayMonth;
	private int bDayYear;
	
	private long creditCount;
	private long finishedTasks;

	private long moneyDonated;
	private long creditDonated;
	
	public User() {
		creditCount = 0;
		finishedTasks = 0;
		moneyDonated = 0;
		creditDonated = 0;
	}
	
	public int getbDayDate() {
		return bDayDate;
	}

	public void setbDayDate(int bDayDate) {
		this.bDayDate = bDayDate;
	}

	public int getbDayMonth() {
		return bDayMonth;
	}

	public void setbDayMonth(int bDayMonth) {
		this.bDayMonth = bDayMonth;
	}

	public int getbDayYear() {
		return bDayYear;
	}

	public void setbDayYear(int bDayYear) {
		this.bDayYear = bDayYear;
	}

	public long getFinishedTasks() {
		return finishedTasks;
	}

	public void setFinishedTasks(long finishedTasks) {
		this.finishedTasks = finishedTasks;
	}
	
	public void incrementFinishedTasks() {
		this.finishedTasks++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public int getBDayDate() {
		return bDayDate;
	}

	public void setBDayDate(int bDayDate) {
		this.bDayDate = bDayDate;
	}

	public int getBDayMonth() {
		return bDayMonth;
	}

	public void setBDayMonth(int bDayMonth) {
		this.bDayMonth = bDayMonth;
	}

	public int getBDayYear() {
		return bDayYear;
	}

	public void setBDayYear(int bDayYear) {
		this.bDayYear = bDayYear;
	}

	public long getCreditCount() {
		return creditCount;
	}

	public void setCreditCount(long creditCount) {
		this.creditCount = creditCount;
	}
	
	public void addCreditCount(long toAdd) {
		creditCount += toAdd;
	}
	
	public void deductCreditCount(long toRemove) {
		creditCount -= toRemove;
	}

	public long getMoneyDonated() {
		return moneyDonated;
	}

	public void setMoneyDonated(long MoneyDonated) {
		this.moneyDonated = moneyDonated;
	}

	public long getCreditDonated() {
		return creditDonated;
	}

	public void setCreditDonated(long creditDonated) {
		this.creditDonated = creditDonated;
	}
	
	public void addMoneyDonated(long moneyDonated) {
		this.moneyDonated += moneyDonated;
	}
	
	public void addCreditDonated(long creditDonated) {
		this.creditDonated += creditDonated;
	}
}
