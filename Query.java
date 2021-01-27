package util;

public class Query {
	public static String adminAuthentication = "select * from admin where username=? and password=?";
	  public static String addStaff = "insert into staff values(?,?,?,?)";
	  public static String viewStaff = "select * from staff";
	  public static String editStaff = "update employee set name=?,contactNum=?,salary=? where id=?";
	  public static String removeStaff = "delete from staff where id=?";
	}



