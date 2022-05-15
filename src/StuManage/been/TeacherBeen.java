package StuManage.been;

public class TeacherBeen {
	private int staffid ;
	private String teachername  ;
	private String tell ;
	private String birthday ;
	private String teacherpass  ;
	private String teacherclass ;
	private int cid;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
	public String getTeacherpass() {
		return teacherpass;
	}
	public void setTeacherpass(String teacherpass) {
		this.teacherpass = teacherpass;
	}
	public String getTeacherclass() {
		return teacherclass;
	}
	public void setTeacherclass(String teacherclass) {
		this.teacherclass = teacherclass;
	}
	@Override
	public String toString() {
		return "TeacherBeen [staffid=" + staffid + ", teachername=" + teachername + ", tell=" + tell + ", birthday="
				+ birthday + ", teacherpass=" + teacherpass + ", teacherclass=" + teacherclass + "]";
	}
	public TeacherBeen(int staffid, String teachername, String tell, String birthday, String teacherpass,
			String teacherclass) {
		super();
		this.staffid = staffid;
		this.teachername = teachername;
		this.tell = tell;
		this.birthday = birthday;
		this.teacherpass = teacherpass;
		this.teacherclass = teacherclass;
	}
	public TeacherBeen() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
