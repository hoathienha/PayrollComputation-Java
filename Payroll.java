public class Payroll extends Pay
{
	   public double calc_payroll()
	   {
	      double gross = super.calc_payroll();
	      float t = super.tax(gross);
	      return gross*(1-t/100);
	   }
}