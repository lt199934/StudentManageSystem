package StuManage.been;

public class ScoreBeen {
	private int stnumber;
	private String sname;
	private String subjects;
	private String achievement;
	private int state;
	
	public ScoreBeen() {
		super();
	}
	public ScoreBeen( String sname,String achievement, int state) {
		super();
		this.sname = sname;
		this.achievement = achievement;
		this.state = state;
	}
	
	public ScoreBeen(int stnumber, String sname, String subjects, String achievement, int state) {
		super();
		this.stnumber = stnumber;
		this.sname = sname;
		this.subjects = subjects;
		this.achievement = achievement;
		this.state = state;
	}
	public int getStnumber() {
		return stnumber;
	}
	public void setStnumber(int stnumber) {
		this.stnumber = stnumber;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	
}
