package StuManage.been;

public class CourseBeen {
	private String classname;
	private String teacher;
	private String kc;
	private String ctime;
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getKc() {
		return kc;
	}
	public void setKc(String kc) {
		this.kc = kc;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public CourseBeen(String classname, String teacher, String kc, String ctime) {
		super();
		this.classname = classname;
		this.teacher = teacher;
		this.kc = kc;
		this.ctime = ctime;
	}
	public CourseBeen() {
		super();
	}
	

}
