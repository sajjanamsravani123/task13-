package model;

public class Staff {
	private int id;
	  private String name;
	  private long contactNum;
	  private long salary;

	  public Staff() {
	    // TODO Auto-generated constructor stub
	  }

	  public Staff(int id, String name, long contactNum, long salary) {
	    super();
	    this.id = id;
	    this.name = name;
	    this.contactNum = contactNum;
	    this.salary = salary;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  public long getcontactNum() {
		    return contactNum;
		  }

		  public void setDate(long contactNum) {
		    this.contactNum = contactNum;
		  }

		  public long getSalary() {
		    return salary;
		  }

		  public void setSalary(long salary) {
		    this.salary = salary;
		  }

		  @Override
		  public String toString() {
		    return "id=" + id + ", name=" + name + ", contactNum=" + contactNum + ", salary=" + salary;
		  }

		}


