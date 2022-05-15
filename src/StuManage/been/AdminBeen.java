package StuManage.been;

public class AdminBeen {
	private int staffid ;
	private String titlename ;
	private String tell ;
	private String birthday ;
	private String titlepass ;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTitlepass() {
		return titlepass;
	}
	public void setTitlepass(String titlepass) {
		this.titlepass = titlepass;
	}
	@Override
	public String toString() {
		return "AdminBeen [staffid=" + staffid + ", titlename=" + titlename + ", tell=" + tell + ", birthday="
				+ birthday + ", titlepass=" + titlepass + "]";
	}
	public AdminBeen() {
		super();
	}
	public AdminBeen(int staffid, String titlename, String tell, String birthday, String titlepass) {
		super();
		this.staffid = staffid;
		this.titlename = titlename;
		this.tell = tell;
		this.birthday = birthday;
		this.titlepass = titlepass;
	}
	
	
}
