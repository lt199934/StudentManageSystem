package StuManage.been;

public class NoteBeen {
private int nid;
private String content;
private String form;
private String ntime;
public int getNid() {
	return nid;
}
public void setNid(int nid) {
	this.nid = nid;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getForm() {
	return form;
}
public void setForm(String form) {
	this.form = form;
}
public String getNtime() {
	return ntime;
}
public void setNtime(String ntime) {
	this.ntime = ntime;
}
public NoteBeen(int nid, String content, String form, String ntime) {
	super();
	this.nid = nid;
	this.content = content;
	this.form = form;
	this.ntime = ntime;
}
public NoteBeen() {
	super();
}


}
