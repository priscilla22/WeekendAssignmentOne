import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

class Employee{
	private String firstname, lastname, phoneNumber, emailID;
	

	public Employee(String firstname, String lastname, String phoneNumber, String emailID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getEmailID() {
		return emailID;
	}


	
}
public class EmployeeRegister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees");
		int n = sc.nextInt();
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		for(int i=0;i<n;i++){
			System.out.println("EMPLOYEE " + i + " DETAILS : ");
			System.out.print("First name : ");
			String firstName = sc.next();
			System.out.print("Last Name : ");
			String lastName = sc.next();
			System.out.print("Phone Number : ");
			String phoneNumber = sc.next();
			System.out.print("Email ID : ");
			String emailID = sc.next();
			Employee employee = new Employee(firstName,lastName,phoneNumber,emailID);
			employeeList.add(employee);
		}
		
		Collections.sort(employeeList, new Comparator<Employee>() {
		    @Override
			public int compare(Employee o1, Employee o2) {
		    	if(o1.getFirstname().equals(o2.getFirstname()))
					return 0;
				else if(o1.getFirstname().compareTo(o2.getFirstname())>0)
					return 1;
				else return -1;
			}
		});
		
		System.out.format("%-15s %-15s %-15s %-30s\n","Firstname","Lastname","Mobile","Email");
		for(Employee e : employeeList){
			System.out.format("%-15s %-15s %-15s %-30s\n",e.getFirstname(),e.getLastname(),e.getPhoneNumber(),e.getEmailID());
		}

	}

}
