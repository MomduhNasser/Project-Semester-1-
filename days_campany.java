
package first_project;
import java.util.Scanner;

public class days_campany {
 public static void main(String[] args) {
    Scanner keybord = new Scanner(System.in);
    
    // Prompt the user to enter three points
     System.out.println("USE CAPTILZE FISRT WORD !!!!!");
    System.out.print("Enter day : ");
   String day = keybord.nextLine();
  
    
 
     switch(day) {

          case "Sanday":

               System.out.println("open");

               break;

          case "Tuesday":

               System.out.println("open");

               break;

          case "Wednesday":

               System.out.println("open");

               break;

          case "Thursday":

               System.out.println("open");

               break;

          case "Friday":
                  
                System.out.println("closed");
                break;
                
              
          case "Saturday" :
              
              System.out.println("closed");
              break ;
              
          case "Sunday" :
              System.out.println("open");
              break ;
              
         default:
             

               System.out.println("Unknown day!!");

               break;
               
    
     
         }
  
    }

    }
      
    
    

