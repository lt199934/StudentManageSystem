package StuManage.been;

public class UserBeen {
private String userName;//用户名
private String userPass;//密码
private int type;//身份 

public UserBeen(String userName, String userPass, int type) {
	super();
	this.userName = userName;
	this.userPass = userPass;
	this.type = type;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPass() {
	return userPass;
}

public void setUserPass(String userPass) {
	this.userPass = userPass;
}

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}

public UserBeen() {
	super();
}
 
	
}
