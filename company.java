package project;
import java.util.Scanner;
class SecondClass {
 public void SecondIdeaMethod() {
int option = 0;
Scanner input = new Scanner (System.in);
do {System.out.println("please press 1 for idead one about { Company } ,press 2 for { PHONES } or press 3 for {work day on Company}");
option= input.nextInt();
switch (option){
case 1 :
input = new Scanner (System.in);
String [] company =
{"apple" ,"samsung" , "huawei" ,"microsoft"," "};        
String [] about=
{"\tStart in 1976 \n This article is about the technology company. For other companies named \"Apple\", Start In 1984, Apple launched the Macintosh \n website : http://www.apple.com" ,"\tStart 1938-1969 Samsung's Beginnings ,\n is a South Korean multinational conglomerate company[citation needed] headquartered in Samsung Town, Seoul. It comprises numerous subsidiaries[citation needed] and affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol (business conglomerate).\n website : http://www.samsung " ,
"\tHuawei Start  in 1987 \n by Ren Zhengfei, Huawei is a Chinese multinational networking and telecommunications equipment and services company headquartered in Shenzhen, Guangdong, It is the largest telecommunications equipment manufacturer in the world, having overtaken Ericsson in 2012. \n website http://www.huawei.com/en/ " ,
"\tStrat 1985  \n Microsoft Windows (or simply Windows) is a metafamily of graphical operating systems developed, marketed, and sold by Microsoft. It consists of several families of operating systems, each of which cater to a certain sector of the computing industry.\n http://www.microsoft.com/en-us/windows"," "};
String company1="";
System.out.println("Enter company : ");
company1=input.nextLine();
System.out.println("You put company: "+company1.toUpperCase());
System.out.println("This deatail about it Under :");   
//print details 
for (int i =0;i< company.length ; i++){	
if (company1.equals(company[i])){
System.out.println("Detail about "+company1.toUpperCase()+" "+company[i]);
System.out.println(about[i]);}}
int apple1= 2015 -1976;
int samsung1= 2015 -1938;
int huawei1= 2015 -1987;
int microsoft1= 2015 -1985;
System.out.println("\t Apple     Start to until now "+apple1+" years");
System.out.println("\t Samsung   Start to until now "+samsung1+" years");
System.out.println("\t Huawei    Start to until now "+huawei1+" years");
System.out.println("\t Microsoft Start to until now "+microsoft1+" years");
break;         
case 2 :
input = new Scanner (System.in); 
String [] phone = {"iphone 5" ,"iphone 6" ,"iphone 6s" ,"s6 edge","galaxy s5","lg nexus 5x","lg g5","xperia z3"," "}; 
String [] about2= {"\t Released 2012, September \n" +
"\t 112g, 7.6mm thickness\n" +
"\t iOS 6, up to iOS 9.2\n" +
"\t 16/32/64GB storage, no card slot \n"
+ "\t { Resolution } 640x1136 pixels \n"
+ "\t { Camera }8MP ,1080p\n" +
" \t 1GB RAM {core}Apple A6\n" + "{Battry} 1440mAh Li-Po\n" ,
//iphone6    
"\t Released 2014, September\n"+
"\t {wigth} 129g, 6.9mm thickness\n"+
"\t iOS 8, up to iOS 9.2\n"+
"\t { Storage }16/64/128GB storage, no card slot\n"
+"\t { Screen } 4.7\n "+
                "\t { Resolution } 750x1334 pixels\n"+
"\t {Camera} 8MP 1080p\n"+
" \t 1GB RAM {Core} Apple A8\n"+
"\t {Battry}1810mAh Li-Po\n" ,
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
"\t { Battry } 2600mAh Li-Ion\n",
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
"\t Released 2014, September\n"+
"\t {Wight} 152g, 7.3mm thickness\n"+
"\t {Software} Android OS, v4.4.4, v5.0.2\n"+
"\t {Storge} 16/32GB storage, microSD card slot\n"+
"\t {Screen} 5.2 {Resolution} 1080x1920 pixels\n"+
"\t {Camera} 20MP  2160p\n"+
"\t {RAM} 3GB RAM {CORE} Snapdragon 801\n"+
"\t { Battry }3100mAh Li-Ion\n" +
"",   
            //xperia z3 
"\t Released 2014, September\n"+
"\t {Wight} 152g, 7.3mm thickness\n"+
"\t {Software} Android OS, v4.4.4, v5.0.2\n" +
"\t {Storge} 16/32GB storage, microSD card slot\n"+
"\t {Screen} 5.2 {Resolution} 1080x1920 pixels\n"+
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
System.out.println(about2[i]);}}
System.out.println("\t{ that it detail about it Thnx }");
break;
case 3: 
input = new Scanner(System.in); 
// Prompt the user to enter three points
System.out.println("USE CAPTILZE FISRT WORD !!!!!");
System.out.print("Enter day : ");
String day = input.nextLine();
switch(day) {
case "Sanday":
System.out.println("\topen");
break;
case "Tuesday":
System.out.println("\topen");
break;
case "Wednesday":
System.out.println("\topen");
break;
case "Thursday":
System.out.println("\topen");
break;
case "Friday":
System.out.println("\tclosed");
break;
case "Saturday" :
System.out.println("\tclosed");
break ;
case "Sunday" :
System.out.println("\topen");
break ;default:
System.out.println("Unknown day!!");
break;
}}}while (option >3);
System.out.println("\n Thank you ");}}
