public class empWageuuc6 {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 2;
        public static final int MAX_HRS_IN_MONTH = 10;

        public static void main(String[] args) {
                int empHrs = 0, empWage = 0, totalEmpWage = 0, totalWorkingDays = 0;
                while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                        totalWorkingDays < NUM_OF_WORKING_DAYS) {
                        totalWorkingDays++;
                        switch (empCheck) {
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                defult:
                                        empHrs = 0;
                        }
                        empWage = empHrs * Emp_RATE_PER_HOUR;
                        totalEmpWage += empWage;
                        System.out.println("Emp Wage: " +empWage);
                }
                System.out.println("Total Emp Wage: " +totalEmpWage);
        }
}

