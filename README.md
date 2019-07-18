# PayrollComputation-Java
Intro to Programming II - assignment 2

Write a stand-alone Java application called Assign2 (save as Assign2.java), which contains the main() method to invoke the method “acceptPay()”. The functionality of this assignment is as follows:

Payroll computation

Processing 

A new data entry screen with the appropriate title (see the typical screen dialogue below), will prompt the user to enter the required data in order to calculate what the gross pay for an employee depending upon the hours worked and the rate of pay per hour, both of which is entered by the user. Note however that the company pays “straight time” for the first number of hrs worked by each employee and pays “time and three quarter and a bit” (i.e. 1.77 times their hourly wage) for all hours worked in excess of those hours. 

In addition, it should also calculate the net pay after the tax deduction using the following table:

Pay
From 		  To		    Tax Rate(%)
0.00		  399.99		 8
400.00		899.99		12
900.00		and up		16
So typical screen dialogue should be:
Payroll Computation

Enter number of hours worked (00.0) <-1 for Quick exit>: 39
Enter first number of hours straight (integer or 0 to disable):40
Enter hourly rate of worker (00.00): 10
=================================================================
=================================================================
Gross pay is : $390.00
Tax is	   : 8%
Net pay is   : $358.80

e to exit, any other letter + <Enter> to continue













Payroll Computation

Enter number of hours worked (00.0) <-1 for Quick exit>: 40
Enter first number of hours straight (integer or 0 to disable):40
Enter hourly rate of worker (00.00): 10
=================================================================
=================================================================
Gross pay is : $400.00
Tax is	   : 12%
Net pay is   : $352.00

e to exit, any other letter + <Enter> to continue

Payroll Computation

Enter number of hours worked (00.0) <-1 for Quick exit>: 42
Enter first number of hours straight (integer or 0 to disable):40
Enter hourly rate of worker (00.00): 10
=================================================================
=================================================================
Gross pay is : $435.40
Tax is	   : 12%
Net pay is   : $383.15

e to exit, any other letter + <Enter> to continue

Payroll Computation

Enter number of hours worked (00.0) <-1 for Quick exit>: 40
Enter first number of hours straight (integer or 0 to disable):0
Enter hourly rate of worker (00.00): 10
=================================================================
=================================================================
Gross pay is : $400.00
Tax is	   : 12%
Net pay is   : $352.00

e to exit, any other letter + <Enter> to continue


Payroll Computation

Enter number of hours worked (00.0) <-1 for Quick exit>: -40
Enter first number of hours straight (integer or 0 to disable):-10
Enter hourly rate of worker (00.00): -10.2
=================================================================
=================================================================
Gross pay is : $643.62
Tax is	   : 12%
Net pay is   : $566.39

e to exit, any other letter + <Enter> to continue



In the above example, if the user entered  NEGATIVE NUMBERS for ALL input, then they should be treated as POSITIVE NUMBERS and continue. THE ONLY EXCEPTION IS THE FIRST ENTRY I.E. FOR HOURS WORKED AS IT USES -1 AS QUICK EXIT.

You should clear the screen after each set of calculations, and make sure that hours worked and hourly rate can also handle decimals (i.e. 35.5 hours).

If user enters -1 for number of hours worked then it should go straight to 
e to exit, any other letter + <Enter> to continue
bypassing all calculations. Note however that “-1.5” is still treated as 1.5 hours worked.

Again e or E should go back to Assign2.java and finally exit the program, otherwise it should remain in Payroll Computation.

NOTE the following:

Class Pay
Create a class called Pay (and save it as Pay.java) containing the following instance variables, one for hours worked (float), the rate (float) and straight time hours (integer). Make them all private.

This class should have the following instance methods:

•	calc_payroll(), which will handle the actual calculations. This method should return the gross pay. Note however, if the user enters “0” for number of hours straight, then straight time calculations APPLY ONLY. Also, this method takes no parameters as the data required will be from the private instance variables.
•	tax(…), which will determine the appropriate tax percentage to calculate the net pay.
•	setHours(…), setRate(…) and setHrsStr(…) methods to set the private variables
•	getHours(), getRate() and getHrsStr() methods to retrieve the values from the private variables.

Class Payroll
Create a separate class called Payroll (save it as Payroll.java), which MUST be a subclass of Pay. This will have the following instance method:

•	calc_payroll(), which will have the same method signature as the one in the superclass. However, it will invoke the tax() method to calculate and return back the net pay, rather than the gross pay. This method should invoke calc_payroll() from the superclass to calculate the gross.



Class CalPayroll
Create a separate class called CalPayroll (save it as CalPayroll.java), which MUST also be a subclass of Pay. This will have the following instance methods:

•	displayinfo(), which will invoke the necessary methods to calculate the tax, gross pay, tax applied and net pay and display them in the format as shown above. (i.e. $, %, 2 decimal places and comma delimited). This method takes no paramenters nor return any values.

•	acceptPay(), which will display the main title “Payroll Computations” and accept the necessary values from the user for calculating the gross and net pay. This method takes no paramenters nor return any values. THIS IS THE METHOD THAT WILL BE INVOKED FROM main(), to start the program running.


Additional Classes & methods

Class Accept
This class (save as Accept.java) should consist of at least 4 instance methods used for keyboard input :
1.	acceptInputInt()
Which accepts the input and returns it back as an integer
2.	acceptInputChar()
Which accepts the input and returns it back as a character
3.	acceptInputFloat()
Which accepts the input and returns it back as a float
4.	acceptInputDouble()
Which accepts the input and returns it back as a double

YOU MUST use the Scanner class for keyboard input.

Class Screen
This class (save as Screen.java) should consist of 2 class methods:
1.	scrollscreen(…)
which will clear the screen. To make this flexible it should take one parameter to indicate how many lines to clear.
2.	scrollscreen(…)
overload the first scrollscreen method with this one, which will allow you to display different patterns (use it display those “=======” lines ). Hint: this will take at least 2 parameters, one for what String pattern to display and one for number of lines to display with that pattern.
