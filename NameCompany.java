
package first_project;
import java.util.Scanner;
//array
public class NameCompany {
    public static void main (String []args){
      Scanner input = new Scanner (System.in);
	String [] company =
        {"apple" ,
            "samsung" , 
            "huawei" ,
            "microsoft",
            " "}; 
        
        String [] about=
        {"Start in 1976 \n This article is about the technology company. For other companies named \"Apple\", Start In 1984, Apple launched the Macintosh \n website : http://www.apple.com" ,
            "Start 1938-1969 Samsung's Beginnings ,\n is a South Korean multinational conglomerate company[citation needed] headquartered in Samsung Town, Seoul. It comprises numerous subsidiaries[citation needed] and affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol (business conglomerate).\n website : http://www.samsung " ,
            "Huawei Start  in 1987 \n by Ren Zhengfei, Huawei is a Chinese multinational networking and telecommunications equipment and services company headquartered in Shenzhen, Guangdong, It is the largest telecommunications equipment manufacturer in the world, having overtaken Ericsson in 2012. \n website http://www.huawei.com/en/ " ,
            "Strat 1985  \n Microsoft Windows (or simply Windows) is a metafamily of graphical operating systems developed, marketed, and sold by Microsoft. It consists of several families of operating systems, each of which cater to a certain sector of the computing industry.\n http://www.microsoft.com/en-us/windows",
            " "};
        
        String company1="";
        System.out.println("Enter company : ");
	company1=input.nextLine();
        System.out.println("You put company: "+company1.toUpperCase());
        System.out.println("This deatail about it Under :");
        
        //print details
        
	for (int i =0;i< company.length ; i++){
		
            if (company1.equals(company[i])){
                System.out.println("Detail about "+company1.toUpperCase()+" "+company[i]);
		System.out.println(about[i]);}
            
                
	}
        int apple1= 2015 -1976;
       int samsung1= 2015 -1938;
       int huawei1= 2015 -1987;
       int microsoft1= 2015 -1985;
	System.out.println("\t Apple     Start to until now "+apple1+" years");
        System.out.println("\t Samsung   Start to until now "+samsung1+" years");
        System.out.println("\t Huawei    Start to until now "+huawei1+" years");
        System.out.println("\t Microsoft Start to until now "+microsoft1+" years");
}}
    

