public class DailyEmployeeWage {
    public static void main(String[] args) {
		
		int employee = 1;
		int wageperhour = 20;
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random()*10)%2;
		if(empcheck == employee) {
			emphrs = 8;
		}
		else {
			emphrs=0;
		}
		empwage = emphrs * wageperhour ;
		System.out.println("Employee Wage : "+empwage);
		

	}

}
