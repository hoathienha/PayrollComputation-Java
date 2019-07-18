import java.util.*;

class Accept
{
    Scanner in = new Scanner(System.in);

   public int acceptInputInt()  
	   {
	   
       return(in.nextInt());

    }
       
   public char acceptInputChar()
    {
	   return(in.nextLine().charAt(0));
	 }

   public String acceptInputString()
    {
       return(in.nextLine());
    }

   public float acceptInputFloat()
    {
	   return(in.nextFloat());
       
    }
	
	public double acceptInputDouble()
	{
		
       return(in.nextDouble());
	}

}