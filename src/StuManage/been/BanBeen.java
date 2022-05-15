package StuManage.been;

public class BanBeen {
	private String grade;
	private String instructor;
	private String bj;
	private String major;
	private int cid;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBj() {
		return bj;
	}

	public void setBj(String bj) {
		this.bj = bj;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "BanBeen{" +
				"grade='" + grade + '\'' +
				", instructor='" + instructor + '\'' +
				", bj='" + bj + '\'' +
				", major='" + major + '\'' +
				", cid=" + cid +
				'}';
	}

	public BanBeen(String grade, String instructor, String bj, String major, int cid) {
		this.grade = grade;
		this.instructor = instructor;
		this.bj = bj;
		this.major = major;
		this.cid = cid;
	}

	public BanBeen() {
		super();
	}
	
	
}
