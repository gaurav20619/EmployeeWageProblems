public class EmployeePresentAbsent {
    public static void main(String[] args) {
		
		int isFullTime = 1;
		int empcheck =(int) Math.floor(Math.random()*10)%2;
		if (empcheck == isFullTime) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");                     
		}

	}
}
