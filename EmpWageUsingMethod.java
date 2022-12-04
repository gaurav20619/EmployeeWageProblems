public class EmpWageUsingMethod {
    
    static int WAGE_PER_HOUR = 20;
    static  int FULL_TIME_HOUR = 8;
    static int PART_TIME_HOUR = 4;
    
	public static void empWageCalculator() {
		int totalWorkingDays = 0;
	    int totalHour = 0;
	    int totalDailyWage = 0;
		   while (totalHour < 100 && totalWorkingDays < 20) {
	            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
	            totalWorkingDays ++;

	            switch (employeeCheck) {
	                case 2:
	                    totalHour =  totalHour + FULL_TIME_HOUR;
	                    totalDailyWage = totalDailyWage + FULL_TIME_HOUR * WAGE_PER_HOUR;
	                    System.out.println("Employee is present full time: " +totalDailyWage);
	                    break;
	                case 1:
	                    totalHour =  totalHour + PART_TIME_HOUR;
	                    totalDailyWage = totalDailyWage + PART_TIME_HOUR * WAGE_PER_HOUR;
	                    System.out.println("Employee is present half time: " +totalDailyWage);
	                    break;
	                default:
	                    System.out.println("Employee is absent: " +totalDailyWage);
	            
	            System.out.println("Working Days is: " +totalWorkingDays+ " Hours: " +totalHour);
	        
	        System.out.println("Employee total wage for month is: " +totalDailyWage);
	            }
	            }
		   }
	    

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		empWageCalculator();
    }
}
