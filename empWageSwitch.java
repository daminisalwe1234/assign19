public class empWageuc3 {

        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static void main(String[] args){
		int empHrs = 0;
        	int empWage = 0;
        	double empCheck = Math.floor(Math.random() * 10) % 3;
        	switch (empCheck) {
			case IS_PART_TIME:
                		empHrs = 8;
        		case IS_PART_TIME:
                		empHrs = 4;
			default:
				empHrs = 0;
		}
        	empWage = empHrs * EMP_RATE_PER_HOUR;
        	System.out.println("emp wage:" +empWage);
	}
}


