
package first_project;
import java.util.Scanner;



public class phones {
   
    public static void main (String []args){

	//user put name 
	Scanner input = new Scanner (System.in);
	String [] phone = {"iphone 5" ,
            "iphone 6" ,
            "iphone 6s" ,
            "s6 edge",
            "galaxy s5",
            "lg nexus 5x",
            "lg g5",
            "xperia z3",
            " "}; 
        String [] about= {"\tReleased 2012, September \n" +
"\t 112g, 7.6mm thickness\n" +
"\t iOS 6, up to iOS 9.2\n" +
"\t 16/32/64GB storage, no card slot \n"
                + "\t { Resolution } 640x1136 pixels \n"
                + "\t { Camera }8MP ,1080p\n" + 
                " \t 1GB RAM {core}Apple A6\n" + "{Battry} 1440mAh Li-Po\n" ,


            
            
                                         //iphone6    
            "\t Released 2014, September\n" +
"\t {wigth} 129g, 6.9mm thickness\n" +
"\t iOS 8, up to iOS 9.2\n" +
"\t { Storage }16/64/128GB storage, no card slot\n"
                + "\t { Screen } 4.7\n " +
                "\t { Resolution } 750x1334 pixels\n"+
"\t {Camera} 8MP 1080p\n" +
" \t 1GB RAM {Core} Apple A8\n" +
"\t {Battry}1810mAh Li-Po\n" 
 ,
            
            
            
            
            
            
                                         //iphone 6s
            "\t Released 2015, September\n" +
"\t 143g, 7.1mm thickness\n" +
"\t { Software } iOS 9, up to iOS 9.2\n" +
"\t { Stroge } 16/64/128GB storage, no card slot\n" 
+"\t { Screen } 4.7\"\n" +
"\t { resolution }750x1334 pixels" 
+"\t {Camera} 12MP {Video} 2160p\n" +
"\t 2GB RAM      {Core} Apple A9\n"+
"\t {Battry}  1715mAh ,Li-Po\n" +
"",
            
            
            
            
            
            
            
            
                                          // s6 edge
            "\t Released 2015, April\n" +
"\t {Wight}132g, 7mm thickness\n" +
"\t {Software} Android OS, v5.0.2\n" +
"\t {Storge} 32/64/128GB storage, no card slot\n"
                +"{Screen} 5.1\"\n" +
"{Resolution}1440x2560 pixels\n"
   +"\t{Camera} 16MP   {Video}2160p\n" +
"{RAM} 3GB RAM  {CORE} Exynos 7420" +
                "\t { Battry } 2600mAh Li-Ion\n" 

             
                
                
                ,
            
            
            
            
            
                                            //galaxy s5
            "Released 2014, April\n" +
"145g, 8.1mm thickness\n" +
"Android OS, v4.4.2, up to v5.0\n" +
"16/32GB storage, microSD card slot\n",
            
            
                                          //lg nexus 5x
           "\t Released 2015, October\n" +
"\t {Wight}136g, 7.9mm thickness\n" +
"\t {Software}Android OS, v6.0\n" +
"\t {Storge}16/32GB storage, no card slot\n"
                +"\t {Screen} 5.2 {Resolution}1080x1920 pixels\n" +
"\t {Camera}12MP  {Video}2160p\n" +
"\t {RAM} 2GB RAM {CORE} Snapdragon 808\n" +
"\t { Battry } 2700mAh Li-Po\n" +
"",
            
            
            
                                 //lg g5
            " ",
            
            
            //xperia z3 
"\t Released 2014, September\n" +
"\t {Wight} 152g, 7.3mm thickness\n" +
"\t {Software} Android OS, v4.4.4, v5.0.2\n" +
"\t {Storge} 16/32GB storage, microSD card slot\n"+
"\t {Screen} 5.2 {Resolution} 1080x1920 pixels\n" +
"\t {Camera} 20MP  2160p\n" +
"\t {RAM} 3GB RAM {CORE} Snapdragon 801\n" +
"\t { Battry }3100mAh Li-Ion\n" +
"",
            
            
            
            // no phone
            ""};
        String phone1="";

//deatils not really
	
System.out.println("Enter you phone :(not captlize some space becarefull space!!)");
	phone1=input.nextLine();
        
        System.out.println("detail about "+phone1.toUpperCase());
	for (int i =0;i< phone.length ; i++){
		
            if (phone1.equals(phone[i])){
                System.out.println(phone[i]);
		System.out.println(about[i]);}
                
	}
	System.out.println("\t{ that it detail about it Thnx }");
}}


        
        
    

