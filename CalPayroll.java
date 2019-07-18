import java.util.*;
import java.text.NumberFormat;
public class CalPayroll extends Pay
{

	   public void displayinfo()
	   {
         Payroll obj = new Payroll();
         
         float wHrs = super.getHours();
	      int strHrs = super.getHrsStr();
	      float r = super.getRate();
         
         obj.setHours(wHrs);
	      obj.setHrsStr(strHrs);
	      obj.setRate(r);
         
	      double a = super.calc_payroll();
	      float t = super.tax(a);
         double net = obj.calc_payroll();
	 
	      System.out.println("Gross pay is: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(a));
	      System.out.println("Tax is: " + t + "%");
	      System.out.println("Net pay is: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(net));
	   
	   }
	   public void acceptPay()
	   {
	      Accept std = new Accept();
	      char input;
	      float wHrs;
	      int strHrs;
	      float r;
	      do
	      {
	      System.out.println("Payroll Computation\n" );
	      
	      System.out.print("Enter number of hours worked (00.0) <-1 for Quick exit>: ");
	      wHrs = std.acceptInputFloat();
	      
	      if(wHrs != -1)
	      {   
	         System.out.print("Enter first number of hours straight (integer or 0 to disable): ");
	         strHrs = std.acceptInputInt();
	         
	         System.out.print("Enter hourly rate of worker (00.00): ");
	         r = std.acceptInputFloat();	         
	         
	         wHrs = Math.abs(wHrs);
	         if(strHrs < 0 && r < 0)
	         {
	        	 strHrs = Math.abs(strHrs);
	        	 r = Math.abs(r);
	         }
	         super.setHours(wHrs);
	         super.setHrsStr(strHrs);
	         super.setRate(r); 
	         
	         Screen.scrollscreen("=============================================", 2);
	         displayinfo();
	      }
	         System.out.print("'e' or 'E' to exit, any other letter + <Enter> to continue: ");
	         input = (new Scanner(System.in)).nextLine().charAt(0);  
	         Screen.scrollscreen(30);
	         
	      }while(input != 'e' && input !='E');
	}
}
