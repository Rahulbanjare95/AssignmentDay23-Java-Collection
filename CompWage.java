public class CompWage{

    public  String company;
    public static  int empRatePerHour;
    public static   int numOfWorkingDays;
    public static  int maxHoursPerMonth;
    public int totalEmpWage;

    public CompWage(String company,int empRatePerHour,int
numOfWorkingDays,int maxHoursPerMonth)
       {
          this.company=company;
          this.empRatePerHour=empRatePerHour;
          this.numOfWorkingDays=numOfWorkingDays;
          this.maxHoursPerMonth=maxHoursPerMonth;
              }
    public void setTotalEmpWage(int totalEmpWage){
          this.totalEmpWage=totalEmpWage;
    }
    @Override
    public String toString() {
    return 	"Total Emp Wage for Company : "+company+ " is "+totalEmpWage;
    }
}


