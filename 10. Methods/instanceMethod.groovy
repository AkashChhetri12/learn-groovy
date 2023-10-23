class Employee { 
   String name; 
	
   public String getName() { 
      return name; 
   } 
	
   public void setName(String pName) { 
      name = pName ; 
   } 
	
   static void main(String[] args) { 
      Employee emp = new Employee(); 
      emp.setName('Ram'); 
      println(emp.getName()); 
   } 
}