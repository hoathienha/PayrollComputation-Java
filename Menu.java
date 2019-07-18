import java.util.*;
class Menu
{

	static void mainmenu() 
   {
		System.out.println("Hoa Thien Ha Financial Analysis MENU");
		System.out.println("1.B)alloon Loan Payment Table"+"\n\n\n");
		System.out.println("0.E)xit");
		System.out.print("Enter Selection: ");
		
		Menu obj = new Menu();
		obj.acceptSelection();
	}
	
	public void acceptSelection()
   {
		Accept obj = new Accept();
		char finput = obj.acceptInputChar();
		
		switch(finput) 
      {
   		case '1':
   		case 'B':
   		case 'b':
			   Screen.scrollscreen(30);
		   	do 
            {
				   BalloonLoan payment = new BalloonLoan();
				   payment.balloonLoan_accept();
				   System.out.println("e to exit, any other letter + <ENTER> to continue:");
				   finput = obj.acceptInputChar();
			   }while(finput != 'e'&& finput != 'E');
			   Menu.mainmenu();
				break;
            
		   case '0':
	   	case 'E':
	   	case 'e':
				break;
            
		   default:
				Screen.scrollscreen(30);
				Menu.mainmenu();
	   }
	}
}