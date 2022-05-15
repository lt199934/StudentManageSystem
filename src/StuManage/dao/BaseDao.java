package StuManage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDao {
	public static final String  Driver = "com.mysql.jdbc.Driver";//驱动
	public static final String  URL = "jdbc:mysql://127.0.0.1:3306/studentms";//地址ַ
	public static final String  USERNAME = "root";//数据库用户名
	public static final String  PASSWORD = "123456";//数据库密码
	//打开链接
	public static Connection getcon(){
		Connection con =null;
		try {
			Class.forName(Driver);//加载驱动
			con =DriverManager.getConnection(URL, USERNAME, PASSWORD);//打开链接
			if(con != null){
				System.out.println("连接成功！");
			}else{
				System.out.println("连接失败！");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	//执行增加删除修改
	public static int excute(String sql,Object... obj) {
		// TODO Auto-generated method stub
		int num = -1;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		try {
			con =getcon();
			ps =con.prepareStatement(sql);
			if(obj != null){
				for (int i = 0; i <obj.length; i++) {
					ps.setObject(i+1,obj[i]);
				}
			}
			num =ps.executeUpdate();
			System.out.println(sql);
			System.out.println("("+num+"(rows) affected"+")");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(con,ps,r);
		}
		return num;
	}


	//释放资源
	public static void closeAll(Connection con,PreparedStatement ps,ResultSet r){
		if(con !=null ){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(ps !=null ){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(r !=null ){
			try {
				r.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 查询的案列
	 * **/
//	public List<User> queryAll() {
//		// TODO Auto-generated method stub
//		List<User> userList = new ArrayList<User>();
//		Connection con =null;
//		PreparedStatement ps=null;
//		ResultSet r=null;
//		try {
//			con =BaseDao.getcon();
//			String sql="SELECT ID,USERNAME,USERPASS FROM USERS";
//			ps =con.prepareStatement(sql);
//			r=ps.executeQuery();
//			while(r.next()){
//				User newuser = new User();
//				newuser.setId(r.getInt("id"));
//				newuser.setUsername(r.getString("username"));
//				newuser.setUserpass(r.getString("userpass"));
//				userList.add(newuser);
//			}	
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			BaseDao.closeAll(con, ps, r);
//		}
//		return userList;
//	}
	/**
	 * 集合的遍历案例 与  数据库测试案例
	 * **/
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num =0;
//		UserDao u =new UserDaoImpl();
//		User user = new User();
//		while(true){
//		System.out.println("欢迎来到信息修改系统");
//		System.out.println("1，注册");
//		System.out.println("2，删除");
//		System.out.println("3，修改密码");
//		System.out.println("4，登录");
//		System.out.println("5，查询");
//		System.out.println("6，退出");
//		System.out.println("请选择：");
//		num =sc.nextInt();
//		//注册
//			if(num ==1){
//				System.out.println("请输入用户名");
//				user.setUsername(sc.next());
//				System.out.println("请输入密码");
//				user.setUserpass(sc.next());
//				u.insert(user);
//			}
//		//删除
//			if(num == 2){
//				System.out.println("请输入要删除信息的id");
//				user.setId(sc.nextInt());
//				u.deleteById(user);
//			}
//		//登录
//			if(num == 3){
//				System.out.println("请输入要修改密码的id");
//				user.setId(sc.nextInt());
//				System.out.println("请输入密码");
//				user.setUserpass(sc.next());
//				u.updateById(user);
//				
//			}
//			//登录
//			if(num == 4){
//				System.out.println("请输入用户名");
//				user.setUsername(sc.next());
//				System.out.println("请输入密码");
//				user.setUserpass(sc.next());
//				User o =u.queryByNameOrPass(user);
//				System.out.println(o.getUsername());
//				if(o.getUsername() == null || o.getUserpass() == null){
//					System.out.println("用户名不存在或密码错误");
//				}else{
//					System.out.println("登录成功");
//					List<User> list=u.queryAll();
//					for (User us : list) {
//						System.out.println(us.getId()+"\t"+us.getUsername()+"\t"+us.getUserpass());
//					}
//				}
//			}
//			//查询数据库所有信息
//			if(num == 5){
//				List<User> list=u.queryAll();
//				for (User us : list) {
//					System.out.println(us.getId()+"\t"+us.getUsername()+"\t"+us.getUserpass());
//				}
//			}
//			//退出程序
//			if(num == 6){
//				System.out.println("您已成功退出信息修改系统");
//				break;
//			}
//		}
//		
//	
//		BaseDao.getcon();
//	}
}
