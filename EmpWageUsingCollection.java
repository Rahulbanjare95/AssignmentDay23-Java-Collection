class EmpWageUsingCollection {

	public static final int isPartTime=1;
	public static final int isFullTime=2;
	private int nuCompany=0;
	private CompWage[] compWageArray;
	public EmpWageUsingCollection() {
		compWageArray = new CompWage[5];
		}
	private void addCompanyWage(String company, int empRatePerHour, int 
numOfWorkingDays, int maxHoursPerMonth)
	{
		compWageArray[nuCompany] = new 
CompWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		nuCompany++;
	}
	private void computeWage() {
		for (int i =0;i<nuCompany;i++)
		{
compWageArray[i].setTotalEmpWage(this.computeWage(compWageArray[i]));
			System.out.println(compWageArray[i]);
		}
	}
	private int computeWage(CompWage compWage) {
		int empHrs = 0 , totalEmpHrs = 0, totalWorkingDays=0;
    while(totalEmpHrs <= CompWage.maxHoursPerMonth && totalWorkingDays <
CompWage.numOfWorkingDays)
    {
    	totalWorkingDays++;
    	 int empCheck= (int) (Math.floor(Math.random()*10)%3);
    	switch (empCheck)
    {
    case isFullTime:
            empHrs=8;
            break;
    case isPartTime:
            empHrs=4;
            break;
    default:
            empHrs=0;
                    break;
    }
    totalEmpHrs+=empHrs;
    System.out.println("Day : "+totalWorkingDays+ " EmpHr: "+empHrs);
}
    return totalEmpHrs*CompWage.empRatePerHour;
}
    public static void main( String args[])
    {
    EmpWageUsingCollection em = new EmpWageUsingCollection();
    em.addCompanyWage("Dmart", 20, 2, 10);
    em.addCompanyWage("bigBasket", 10, 4, 20);
    em.computeWage();

    }
}

