package controller;
import java.util.List;
import dao.StaffImpl;
import dao.IStaff;
import model.Staff;

public class StaffController {
	IStaff eImpl = new StaffImpl();

	  public int addStaff(int id, String name, long contactNum, long salary) {
	    Staff staff = new Staff(id, name, contactNum, salary);
	    return eImpl.addStaff(staff);
	  }

	  public List<Staff> viewStaff() {
	    return eImpl.viewStaff();
	  }

	  public int editStaff(int id, String name, long contactNum, long salary) {
	    Staff staff = new Staff(id, name, contactNum, salary);
	    return eImpl.editStaff(staff);
	  }

	  public int removeStaff(int id) {
	    Staff staff = new Staff();
	    staff.setId(id);
	    return eImpl.removeStaff(staff);
	  }

	}



