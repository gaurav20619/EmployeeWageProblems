public class PartTimeEmployeeWage {
    public static void main(String[] args) {
		
		int IsPartTime = 1;
		int IsFullTime = 2;
		int RateperHour = 20;
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random()*10)%3;
		if (empcheck == IsPartTime) {
			emphrs = 8;
		}
		else if (empcheck == IsFullTime ) {
			emphrs = 16;
		}
		else {
			emphrs = 0;
		}
		empwage = emphrs*RateperHour ;
		System.out.println("Employee Wage : "+ empwage);

	}
}
