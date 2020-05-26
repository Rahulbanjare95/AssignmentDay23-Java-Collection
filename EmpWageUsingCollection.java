class EmpWageUsingCollection{
     	  public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
			private int totalEmpWage;

        public EmpWageUsingCollection(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
                this.company =company;
                this.empRatePerHour=empRatePerHour;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxHoursPerMonth=maxHoursPerMonth;
                }

        public void computeWage()
        {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        int totalWorkingHrs=0;

         while(totalEmpHrs<=maxHoursPerMonth &&
                totalWorkingHrs<numOfWorkingDays)
        {
        totalWorkingDays++;
        int empCheck= (int) (Math.floor(Math.random()*10)%2+1);
                switch (empCheck)
                {
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case IS_PART_TIME:
                        empHrs=4;
                        break;
                default:
                        empHrs=0;
                                break;
                }
        totalEmpHrs+=empHrs;
        }
		 totalEmpWage=totalEmpHrs*empRatePerHour;
         }
			@Override
			public String  toString(){
			return "Total Emp Wage for Company: "+company+" is: "+totalEmpWage;

			}

                public static void main( String args[])
                {
                EmpWageUsingCollection spar = new EmpWageUsingCollection("Spar",20,2,10);
                EmpWageUsingCollection bigbasket= new EmpWageUsingCollection("bigbasket",25,4,20);
					 spar.computeWage();
					System.out.println(spar);
					bigbasket.computeWage();
					System.out.println(bigbasket);

         }
	}
