package project;
import java.util.Scanner;
import java.util.Date;
class FirstClass {
 public void FirstIdeaMethod() {
Scanner input = new Scanner (System.in);//user input somethig
System.out.println ("ENTER number !!!");//Display to user 
System.out.println("Enter your day: ");
int day = input.nextInt();
System.out.println("Enter your Month");
int month = input.nextInt();
System.out.println("Enter your year:");
int year = input.nextInt();
System.out.println("You birhday is "+day+"/"+month+"/"+year);
System.out.println("Today is: " + java.time.LocalDate.now());
String date1=java.time.LocalDate.now()+"";
String year1=date1.substring(0, 4);//disply 0 to 4 about year
System.out.println("Year : "+year1);
String month1=date1.substring(5, 7);
System.out.println("Month : "+month1);
String day1=date1.substring(8, 10);
System.out.println("Day : "+day1);
System.out.println(" ");
      //callulate year
int year2 = Integer.parseInt(year1);
int year3 = year2-year;//conver string to int 
System.out.println("You age is "+year3);
int month2 = Integer.parseInt(month1);
int month3 = month2-month;//conver string to int 
System.out.println("You life in month or your month :"+month3);
int day2 = Integer.parseInt(day1);
int day3 = day2-day;//conver string to int 
System.out.println("You life in day or your day : "+day3);
System.out.println("\n Thank you ");}}
