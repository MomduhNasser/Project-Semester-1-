package project;
import java.util.Scanner;
public class Project {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
boolean flag = true;
char repeat;
int option;
FirstClass firstclass = new FirstClass();
SecondClass secondclass= new SecondClass();
do{System.out.println("To chose the first idea about your {AGE} press 1, second idea about {Company} press 2 ");
option = input.nextInt();
while (option !=1 && option !=2 ){
System.out.println("Please press either 1or 2 ");
System.out.println("Number 1 for first idea , number 2 for second idea , number 3 fot third idea ");
option = input.nextInt();}
switch (option){
case 1 : firstclass.FirstIdeaMethod(); 
break;
case 2 : secondclass.SecondIdeaMethod();
break;
default:} //end switch
System.out.println("Do you want re-enter the program again? press 'y' for yes or press 'n' for no");
repeat = input.next().charAt(0);
if (repeat =='n'){
flag = false;}
else if (repeat == 'y'){flag = true;}
else{System.out.println("Please next time prees either 'y' for Yes or 'n' for No");
System.out.println("The program will finish now , thanks for trying it ");flag =false;}
}while (flag ==true);}}
