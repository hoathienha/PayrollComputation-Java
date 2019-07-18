import java.util.*;
import java.text.NumberFormat;
class BalloonLoan
{

	public void balloonLoan_accept() 
   {
		System.out.println("Balloon Loan Payment Table"+ "\n\n");
		
      Accept obj = new Accept();
		Scanner scan = new Scanner(System.in);
		
		double loan;
		System.out.print("Please enter Loan value (decimal) <0 for Quick exit>:");
		loan = obj.acceptInputDouble();
		if(loan == 0)
			return;
		
		double balanceAmt;
		System.out.print("Please enter Balloon Amount (decimal): ");
		balanceAmt = obj.acceptInputDouble();
		
		double start;
		System.out.print("Please enter START Period in Years (decimal): ");
		start = obj.acceptInputDouble();
		
		double end;
		System.out.print("Please enter END Period in Years (decimal): ");
		end = obj.acceptInputDouble();
		
		if(start > end)
		{
			double temp = start;
			start = end;
			end = temp;
		}
		
		int rate;
  		System.out.print("Please enter rate per month range from 1% to (MAX:7%, integer): ");
		rate = obj.acceptInputInt();
		while(rate < 1 || rate > 7)
		{
		   System.out.println("Re-enter period value (MUST be between 1 and 7 inclusive):");
         System.out.print("Please enter rate per month range from 1% to (MAX:7%, integer): ");
		   rate = obj.acceptInputInt();
		}
		
		Screen.scrollscreen("====================================================================", 1);
		balloonDisplay(loan, balanceAmt, start, end, (double)rate);
	}

	public void balloonDisplay(double loan, double bAmt, double start, double end, double r)
   {
		System.out.println("Loan Amount :" + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(loan));
		System.out.println("Balloon Amount :" + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(bAmt));
		System.out.println("\n");
		
		double monthlyVal;
		for(double i = start-1; i <= end; i++) 
		{
			for(double j = 0.5; j <= r; j+=0.5) 
			{
				if(j == 0.5 && i == (start-1))
					System.out.print("\t\t");
				else if(j == 0.5 && i != (start-1))
					System.out.print("Yrs: "+ i + "\t\t");
				else if(j != 0.5 && i == (start-1))
					System.out.print("\t" + j +"%"+"\t");
				else 
				{
					monthlyVal = balloonCalc(loan, bAmt, j, i);
					if(monthlyVal <= 0) 
					{
						double balance;
						balance = balloonCalc(loan, j, i);
						System.out.print(NumberFormat.getCurrencyInstance(new Locale("en","US")).format(balance) + "#"+ "\t\t");
					}
					else	
						System.out.print(NumberFormat.getCurrencyInstance(new Locale("en","US")).format(monthlyVal)+ "\t\t");
			   }
			}
			System.out.println("");
	   }
	}
	
	public double balloonCalc(double loan, double bAmt, double r, double n)
   {
		double monthVal, x;
		
		r = r/100;
		n = n*12;
		x = Math.pow(1+ r, n);
		
		monthVal = (loan - bAmt/x)*(r/(1-1/x));
		
		return monthVal;
	}

	public double balloonCalc(double loan, double r, double n)
   {
		double bAmt;
		
		r = r/100;
		n = n*12;
		
		bAmt = Math.pow((1 + r), n)*loan;
		
		return bAmt;
	}
}
