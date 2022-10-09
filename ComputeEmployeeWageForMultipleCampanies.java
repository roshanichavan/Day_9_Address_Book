package addressBookMain;

import java.util.Scanner;

public class ComputeEmployeeWageForMultipleCampanies {
	public static void main( String[] args )
    {		
	 String cRun="y";
	 welcomeMessage();
	 while(cRun.equals("y")||cRun.equals("Y"))
	 {
	    
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		Scanner name1= new Scanner(System.in); 
    	System.out.print("Enter Name Of Company-: ");
    	String COMPANY_NAME= name1.nextLine();
    	
    	Scanner sc= new Scanner(System.in); 
		System.out.print("Total No Of Working Days : ");
		int NUM_OF_WORKING_DAYS= sc.nextInt();
		
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Maximum Hours In Month : ");
		int MAX_HRS_IN_MONTH= sc.nextInt();
		
		Scanner sc2= new Scanner(System.in); 
		System.out.print("Emp Rate Per Hour : ");
		int EMP_RATE_PER_HOUR= sc.nextInt();
        
        CalculateEmployeeWage(COMPANY_NAME,NUM_OF_WORKING_DAYS,MAX_HRS_IN_MONTH,EMP_RATE_PER_HOUR);
        
        System.out.println("                  Do You Want To Calculate Wage For Another Company?");
        System.out.println("Enter 'Y'- continue 'N'- exit");
        Scanner run= new Scanner(System.in);
        cRun= run.nextLine();
	 }
		
   	 
    }
 
 public static void welcomeMessage() {
	 System.out.println(""
          + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
          + " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
          + "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
          + " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
          + "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
          + "--------------- CAlCULATE EMPLOYEE WAGE COMPUTATION----------------\r\n");
	 
 }
 public static void CalculateEmployeeWage(String CompanyName,int MAX_HRS_IN_MONTH ,int NUM_OF_WORKING_DAYS,int EMP_RATE_PER_HOUR) 
 {
	 int empWage=0, empHrs=0, totalEmployeewage=0, totalEmpHrs=0, totalWorkingDays=0;
	 while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
		 totalWorkingDays++;
		 int empCheck = (int) Math.floor(Math.random() * 10)% 3;
		 switch(empCheck) {
		    case 1:
		    empHrs = 4;
		    break;
		    case 2:
			    empHrs = 8;
			    break;
			default:
				empHrs=0;
		 }
		 totalEmpHrs += empHrs;
		 empWage = empHrs * EMP_RATE_PER_HOUR;
		 totalEmployeewage += empWage;
	 }
	 DisplayResult(CompanyName,totalWorkingDays,totalEmpHrs,totalEmployeewage);
	 
 }
 public static void DisplayResult(String CompanyName,int totalWorkingDays,int totalEmpHrs,int totalEmployeewage){
	 System.out.println(""
          + " ****************************************************************************************\r\n"
          + " **                            *Company Name:"+CompanyName+"*                          **\r\n"
          + " **                            ******************************                          **\r\n"
          + " **Total Employee WorkingDays is:" + totalWorkingDays+"                                                **\r\n" 
          + " **Total Employee WorkingHour is:" + totalEmpHrs+"                                                     **\r\n"
          + " **                                                                                     **\r\n"
          + " **                        Total Employee Wage is:" + totalEmployeewage+"                                  **\r\n"
          + " *****************************************************************************************");
	
	 
 }
 


}


