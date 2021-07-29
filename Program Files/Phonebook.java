/*
* Name: Kalil Black
* Date: 18 March 2021
* Description: Creates the Person instance and stores them in a binary tree
*/
public class Phonebook { 
    
	 BSTReferenceBased pb = new BSTReferenceBased();
  
    public Phonebook() {
    System.out.println("Phonebook opened"); }
    
    public void add(String name, long number) {
    Person p = new Person(name, number);
    pb.insert(name, p); }
    
    /*
    public String findwnum(long number) {
      if(pb.search(number)==null) {
      return "no person found"; }
      else {
      return pb.search(number).p.name; }} */
    
    public long find(String name) {
      if(pb.search(name) == null) {
      System.out.println("no number found, returning -1");
      return -1L; }
      else {
      return pb.search(name).p.number; } }
      
    public void changenum(String name, long number) {
      if(pb.search(name) == null) {
      System.out.println("no person found"); }
      else {
      pb.search(name).p.number = number; } }
      
   public String getTree() {
   return pb.preorder(); }
		
    
}