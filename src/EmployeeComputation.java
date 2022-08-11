
public class EmployeeComputation {

	public static void main(String[] args) {
			
			int IS_FULL_TIME = 5;
			
			double empCheck = Math.floor(Math.random() * 10)% 2;
			
			if (empCheck == IS_FULL_TIME)
			   System.out.println("Employee is Present");
			else
		       System.out.println("Employee is Abscent");		
			
			IS_FULL_TIME = 1;
			int EMP_RATE_PER_HOUR = 20;
			int empHrs = 0;
			int empWage = 0;
			empCheck = Math.floor(Math.random() * 10) %2;
			if (empCheck == IS_FULL_TIME)
				empHrs = 8;
			else 
				empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("emp Wage:" + empWage);
			
			int IS_PART_TIME = 1;
			IS_FULL_TIME = 2;
			EMP_RATE_PER_HOUR = 20;
			empHrs = 0;
			empWage = 0;
			empCheck = Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_PART_TIME)
				empHrs = 4;
			else if (empCheck == IS_FULL_TIME)
				empHrs = 8;
			else
				empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
			
			
			}
	}


