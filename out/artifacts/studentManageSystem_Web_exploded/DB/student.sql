create database studentms;
USE studentms;

CREATE TABLE class(/*班级表*/
	major VARCHAR(20) NOT NULL,/*专业*/
	grade VARCHAR(20) NOT NULL,/*年级*/
	instructor VARCHAR(20) NOT NULL,/*辅导员*/
	class VARCHAR(20) NOT NULL,/*优秀班级*/
	cid INT NOT NULL AUTO_INCREMENT PRIMARY KEY/*id*/
);
insert into class(major,grade,instructor,class,cid)values('外语','19','王德发','1班',1);
insert into class(major,grade,instructor,class,cid)values('计算机','19','王胡发','5班',2);
insert into class(major,grade,instructor,class,cid)values('电子商务','19','王国富','7班',3);

CREATE TABLE student(/*学生信息表*/
	stnumber INT AUTO_INCREMENT PRIMARY KEY, /*学号，主键自增*/
	studentname VARCHAR(20) NOT NULL,/*姓名*/
	sex VARCHAR(20) NOT NULL,/*性别*/
	identityId VARCHAR(20) NOT NULL,/*身份证*/
	sstatus VARCHAR(20) NOT NULL,/*学籍*/
	sttell VARCHAR(20) NOT NULL,/*学生电话*/
	parenttell VARCHAR(20) NOT NULL,/*家长电话*/
	address VARCHAR(100) NOT NULL,/*家庭住址*/
	styState INT NOT NULL,/*学生状态*/
	punishment VARCHAR(20) NOT NULL,/*处分情况*/
	dorm VARCHAR(20) NOT NULL,/*寝室*/
	school VARCHAR(10) NOT NULL,/*是否住校*/
	studentpass VARCHAR(10) NOT NULL,/*学生密码*/
  cid INT NOT NULL ,/*班级id*/
	foreign key(cid) references class(cid)
);
insert into student(studentname,sex,identityId,sstatus,sttell,parenttell,address,styState,punishment,dorm,school,studentpass,cid)
	    values('杨开','女','1234567890123456','大学','13438868025','17683086385','成都',1,'公共场所脱衣服','2-430','是','123456',1);

insert into student(studentname,sex,identityId,sstatus,sttell,parenttell,address,styState,punishment,dorm,school,studentpass,cid)
	    values('大年','女','5222333445656775','大学','13540314098','15237880908','上海市黄浦区',1,'环境好几个','2-430','是','123456',1);
CREATE TABLE teacher(/*老师表*/
	staffid INT AUTO_INCREMENT PRIMARY KEY,/*教工号*/
	teachername VARCHAR(20) NOT NULL,/*姓名*/
	tell VARCHAR(50) NOT NULL,/*电话*/
	birthday DATE NOT NULL,/*生日*/
	teacherpass VARCHAR(10) NOT NULL,/*老师密码*/
	teacherclass VARCHAR(20) NOT NULL/*班级*/
);
insert into teacher(teachername,tell,birthday,teacherpass,teacherclass)values('王德发','15286530903','1986-4-3','654321','1班');

CREATE TABLE masage(/*聊天信息表*/
	id INT AUTO_INCREMENT PRIMARY KEY,/*id*/
	masage VARCHAR(100) NOT NULL,/*信息*/
	fsr VARCHAR(20) NOT NULL,/*发送人*/
	sxr VARCHAR(20) NOT NULL,/*收信人*/
	mtime DATETIME NOT NULL,/*时间*/
	state VARCHAR(20) NOT NULL/*状态*/
);
insert into masage(masage,fsr,sxr,mtime,state)values('你好瓜','王德发','杨开','2020-9-20',1);

CREATE TABLE dorm (/*寝室表*/
	id INT AUTO_INCREMENT PRIMARY KEY,/*id*/
	dormId  varchar(100) NOT NULL,/*寝室号*/
	num INT NOT NULL,/*人数*/
	state INT NOT NULL/*状态*/
);
insert into dorm(dormId,num,state)values('2-403',6,1);

CREATE TABLE title(/*主任表*/
	staffid INT AUTO_INCREMENT PRIMARY KEY,/*教工号*/
	titlename VARCHAR(10) NOT NULL,/*姓名*/
	tell VARCHAR(50) NOT NULL,/*电话*/
	birthday DATE NOT NULL,/*生日*/
	titlepass VARCHAR(10) NOT NULL/*主任密码*/
);
insert into title(titlename,tell,birthday,titlepass)values('赵铁柱','19879777633','1967-7-2','242435');

CREATE TABLE Notice(/*公告表*/
	nid INT AUTO_INCREMENT PRIMARY KEY,/*ID*/
	content VARCHAR(100) NOT NULL,/*内容*/
	form VARCHAR(10) NOT NULL,/*发件人*/
	Ntime DATETIME NOT NULL,/*时间*/
	state INT NOT NULL/*状态*/
);
insert into Notice(content,form,Ntime,state)values('全校停课','赵铁柱','2020-9-20',1);



CREATE TABLE achievement(/*成绩表*/
	Stnumber INT,/*学号*/
	sname VARCHAR(20) NOT NULL,/*姓名*/
	subjects VARCHAR(20) NOT NULL,/*科目*/
	achievement INT NOT NULL,/*成绩*/
	state INT NOT NULL /*缺考*/
);
insert into achievement(Stnumber,sname,subjects,achievement,state)values(1,'杨开','英语','67',1);
insert into achievement(Stnumber,sname,subjects,achievement,state)values(1,'杨开','语文','87',1);
insert into achievement(Stnumber,sname,subjects,achievement,state)values(1,'杨开','数学','97',1);
insert into achievement(Stnumber,sname,subjects,achievement,state)values(1,'杨开','生物','0',0);
insert into achievement(Stnumber,sname,subjects,achievement,state)values(1,'杨开','化学','0',1);

CREATE TABLE curriculum(/*课程表*/
	class VARCHAR(20) NOT NULL,/*班级*/
	curriculum VARCHAR(20) NOT NULL,/*课程表*/
	teacher VARCHAR(20) NOT NULL,/*任课老师*/
	ctime DATE NOT NULL /*时间*/
 );
 insert into curriculum(class,curriculum,teacher,ctime)values('一班','英语','叶良辰','2020-9-19');
