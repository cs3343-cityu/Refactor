package poker;

public class Player {
	private String firstname;
	private String lastname;
	private String middleName;
	private int age;
	private String gender;
	private String dOB;
	private String sID;
	private String classEnl;
	private int playerLevel;
	private int skillLevel;

	public Player(String firstname, String lastname, String middleName, int age, String gender, String dOB, String sID,
			String classEnl, int playerLevel, int skillLevel) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.middleName = middleName;
		this.age = age;
		this.gender = gender;
		this.dOB = dOB;
		this.sID = sID;
		this.classEnl = classEnl;
		this.playerLevel = playerLevel;
		this.skillLevel = skillLevel;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public String getClassEnl() {
		return classEnl;
	}

	public void setClassEnl(String classEnl) {
		this.classEnl = classEnl;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
}