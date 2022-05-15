package StuManage.been;

public class StudentBeen {
private int stnumber;
private String studentname;
private String sex;
private String identityId;
private String sstatus;
private String sttell;
private String parenttell;
private String address;
private int styState;
private String punishment;
private String dorm;
private String school;
private String studentpass;
private int cid;
private String stuClass;

public StudentBeen() {
	super();
}
public StudentBeen(int stnumber, String studentname, String sex, String identityId, String sstatus, String sttell,
		String parenttell, String address, int styState, String punishment, String dorm, String school,
		String studentpass, String stuClass) {
	super();
	this.stnumber = stnumber;
	this.studentname = studentname;
	this.sex = sex;
	this.identityId = identityId;
	this.sstatus = sstatus;
	this.sttell = sttell;
	this.parenttell = parenttell;
	this.address = address;
	this.styState = styState;
	this.punishment = punishment;
	this.dorm = dorm;
	this.school = school;
	this.studentpass = studentpass;
	this.stuClass = stuClass;
}
public int getStnumber() {
	return stnumber;
}
public void setStnumber(int stnumber) {
	this.stnumber = stnumber;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getIdentityId() {
	return identityId;
}
public void setIdentityId(String identityId) {
	this.identityId = identityId;
}
public String getSstatus() {
	return sstatus;
}
public void setSstatus(String sstatus) {
	this.sstatus = sstatus;
}
public String getSttell() {
	return sttell;
}
public void setSttell(String sttell) {
	this.sttell = sttell;
}
public String getParenttell() {
	return parenttell;
}
public void setParenttell(String parenttell) {
	this.parenttell = parenttell;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getStyState() {
	return styState;
}
public void setStyState(int styState) {
	this.styState = styState;
}
public String getPunishment() {
	return punishment;
}
public void setPunishment(String punishment) {
	this.punishment = punishment;
}
public String getDorm() {
	return dorm;
}
public void setDorm(String dorm) {
	this.dorm = dorm;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getStudentpass() {
	return studentpass;
}
public void setStudentpass(String studentpass) {
	this.studentpass = studentpass;
}
public String getStuClass() {
	return stuClass;
}
public void setStuClass(String stuClass) {
	this.stuClass = stuClass;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}


}
