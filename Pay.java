public class Pay 
{
	   private float workedHrs;
	   private float rate;
	   private int straightHrs;
	   
	   public void setHours(float a)
	   {
	      workedHrs = a;
	   }
	   public void setRate(float b)
	   {
	      rate = b;
	   }
	   public void setHrsStr(int c)
	   {
	      straightHrs = c;
	   }
	   
	   public float getHours()
	   {
	      return workedHrs;
	   }  
	   public float getRate()
	   {
	      return rate;
	   }
	   public int getHrsStr()
	   {
	      return straightHrs;
	   }
	   
	   public double calc_payroll()
	   {
	      float m = workedHrs - straightHrs;
	      if(straightHrs == 0 || m <= 0)
	         return workedHrs*(rate);
	      return (straightHrs + Math.abs(m)*1.77f)*(rate);
	   }  
	   
	   public float tax(double gross)
	   {
	      float t = 0;
	      if(gross >= 0 && gross <= 399.99)
	         t = 8;
	      else if(gross >= 400 && gross <= 899.99)
	         t = 12;
	      else if(gross >= 900)
	         t = 16;
	      return t;
	   }
}
