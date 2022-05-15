package StuManage.been;

public class MessgeBeen {
private String masage;
private String fxr;
private String sxr;
private String mtime;
private int state;

public MessgeBeen() {
	super();
}
public MessgeBeen(String masage, String fxr, String sxr, String mtime, int state) {
	super();
	this.masage = masage;
	this.fxr = fxr;
	this.sxr = sxr;
	this.mtime = mtime;
	this.state = state;
}
public String getMasage() {
	return masage;
}
public void setMasage(String masage) {
	this.masage = masage;
}
public String getFxr() {
	return fxr;
}
public void setFxr(String fxr) {
	this.fxr = fxr;
}
public String getSxr() {
	return sxr;
}
public void setSxr(String sxr) {
	this.sxr = sxr;
}
public String getMtime() {
	return mtime;
}
public void setMtime(String mtime) {
	this.mtime = mtime;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
}
