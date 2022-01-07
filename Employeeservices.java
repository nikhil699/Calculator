class EmployeeServices1
{
    private int regId;
    private String name;
    private double salary;
    private String address;
	public int getRegId() 
	{
		return regId;
	}
	public void setRegId(int regId) 
	{
		this.regId = regId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
    
}
public class Employeeservices 
{
	public static void main(String[] args) 
	{
	   EmployeeServices1 OK1 = new EmployeeServices1();
	   EmployeeServices1 OK2 = new EmployeeServices1();
	   EmployeeServices1 OK3 = new EmployeeServices1();
	   EmployeeServices1 OK4 = new EmployeeServices1();
	   
	   OK1.setRegId(100000);
	   OK1.setName("Nikhil");
	   OK1.setSalary(100000.12);
	   OK1.setAddress("Kanpur");
	   
	   OK2.setRegId(100000);
	   OK2.setName("Mike");
	   OK2.setSalary(100000.12);
	   OK2.setAddress("Bangalore");
	   
	   OK3.setRegId(100000);
	   OK3.setName("Samdhesh");
	   OK3.setSalary(100000.12);
	   OK3.setAddress("Lucknow");
	   
	   OK4.setRegId(100000);
	   OK4.setName("Lankeshwar");
	   OK4.setSalary(100000.12);
	   OK4.setAddress("Tiruvanchalpuram");
	   
	   System.out.println(OK1.getRegId());
	   System.out.println(OK1.getName());
	   System.out.println(OK1.getSalary());
	   System.out.println(OK1.getAddress());
	   
	   System.out.println(OK2.getRegId());
	   System.out.println(OK2.getName());
	   System.out.println(OK2.getSalary());
	   System.out.println(OK2.getAddress());
	   
	   System.out.println(OK3.getRegId());
	   System.out.println(OK3.getName());
	   System.out.println(OK3.getSalary());
	   System.out.println(OK3.getAddress());
	   
	   System.out.println(OK4.getRegId());
	   System.out.println(OK4.getName());
	   System.out.println(OK4.getSalary());
	   System.out.println(OK4.getAddress());
	   
	 
	   
	   
	}
}

