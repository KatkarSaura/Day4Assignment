
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
			
			final int IS_PART_TIME1 = 1;
			final int IS_FULL_TIME1 = 2;
		    int EMP_RATE_PER_HOUR1 = 20;
			
			empHrs = 0;
			empWage = 0;
			int empCheck1 = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck1) {
			case IS_PART_TIME1:
			        empHrs = 4;
			        break;
			case IS_FULL_TIME1:
			        empHrs = 8;
			        break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR1;
			System.out.println("Emp Wage: " + empWage);
			
			int EMP_RATE_PER_HOUR2 = 20;
			final int IS_PART_TIME2 = 1;
			final int IS_FULL_TIME2 = 2;
			int NUM_OF_WORKING_DAYS2 = 2;
	    	int empHrs2 = 0, empWage2= 0, totalEmpWage = 0;
	    	for (int day = 0; day < NUM_OF_WORKING_DAYS2; day++){
	    		int empCheck2= (int) Math.floor(Math.random() * 10) % 3;
	    		switch (empCheck2){
	    		case IS_PART_TIME2:
	    			empHrs2= 4;
	    			break;
	    		case IS_FULL_TIME2:
	    			empHrs2= 8;
	    			break;
	    	    default:
	    	    	empHrs2= 0;
	    		}
	    		empWage2= empHrs2* EMP_RATE_PER_HOUR2;
	    		totalEmpWage += empWage;
	    		System.out.println("Emp Wage:" + empWage2);
	    	}
	    	System.out.println("Total Emp Wage:" + totalEmpWage);

		
				
			
			
			}
	}


