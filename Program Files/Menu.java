/*
* Name: Kalil Black
* Date: 18 March 2021
* Description: Interface of phonebook program
*/
import java.io.*;
import java.util.Scanner;
public class Menu { 
    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    Phonebook pb = new Phonebook();
    
    System.out.println("Choose 0 to make new tree, choose 1 to load previous tree");
    int choice = scan.nextInt();    
    
    try {
    if(choice == 1) { 
    File inputFile = new File( "bst.txt" );
    Scanner file = new Scanner( inputFile );
    
    while(file.hasNext()) {
    String stringRead = file.nextLine();
    Scanner parse = new Scanner(stringRead);
    parse.useDelimiter(",");
    String person = parse.next();
    long num = parse.nextLong();
    pb.add(person, num ); } 
    file.close();
    } 
    else {
    System.out.println("Using new tree");
    } }
    catch( FileNotFoundException fnfe) {
    System.out.println(fnfe); } 
   
   /*
   pb.add("J6", 6236);
   pb.add("J7", 6548);
   pb.add("J8", 6146);
   pb.add("J9", 3546);
   pb.add("J10", 6926); */
   /*
   System.out.println("Enter name then number");
   String s = scan.next();
   long l = scan.nextLong();
   pb.add(s, l); */
   
   //System.out.println("Enter name to find number of");
   //String f = scan.next();
   //System.out.println(pb.find(f));
   //System.out.println("Changing number of " +  s);
   //pb.changenum(s, 1234567890L);
   //System.out.println("The new number is " + pb.find("Joe"));
   
   
   do {
   System.out.println("Choose 1 to add person, 2 to find number, 3 to change number, anything else to exit and save");
   String opt = scan.next();
   if(opt.equals("1")){
   System.out.println("Enter name");
   String s = scan.next();
   System.out.println("Enter number");
   long l = scan.nextLong();
   pb.add(s, l);}
   else if(opt.equals("2")){
   System.out.println("Enter name to find number of");
   String f = scan.next();
   System.out.println(pb.find(f)); }
   else if(opt.equals("3")){
   System.out.println("Enter name");
   String f = scan.next();
   System.out.println("Current number is " + pb.find(f));
   if(pb.find(f) != -1) {
   System.out.println("Enter new number");
   long l = scan.nextLong();
   System.out.println(pb.find(f));
   pb.changenum(f, l);
   System.out.println("The new number is " + pb.find(f)); }}
   else {
   try {
   FileWriter fw = new FileWriter("bst.txt", false);
   PrintWriter pw = new PrintWriter( fw ); 
   System.out.println("Printing preorder traversal of saved tree");
   System.out.println(pb.getTree());
   String data = pb.getTree();
   pw.println(data);
   fw.close();}
   catch (IOException ioe) {
   System.out.println(ioe); }
   break; }
	}
   while(true); 
}     
}