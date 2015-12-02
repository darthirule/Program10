/*
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package, 
 * which you can use to obtain the year, month and day of a date. 
 * The no-arg constructor constructs an instance for the current date, and the methods get(GregorianCalendar.YEAR), 
 * get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day. Write a program to perform two tasks:

 *  Display the current year month and day
 *  The GregorianCalendar class has the setTimeInMillis(long) which can be used to set a specified elapsed time since January 1, 1970. Set the value to 1234567898765L and display the year, month, and day.

 * Submit both source code and compiled code ( .java and .class files )
 */
package program10;

import java.util.GregorianCalendar;


public class Program10 {


    public static void main(String[] args) {
      
        int year, month, day;
        
        GregorianCalendar cal = new GregorianCalendar();
        
        year = cal.get(GregorianCalendar.YEAR) + 1; //I am assuming January is month 0?
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("The current date is: " + month + ":" + day + ":" + year);
        
        cal.setTimeInMillis(1234567898765L);
        
        year = cal.get(GregorianCalendar.YEAR) + 1; 
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("The current date is: " + month + ":" + day + ":" + year);
        
        
    }
    
}
