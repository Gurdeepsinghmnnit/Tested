class Bike5 extends Vehicle{  
  Bike5(){  
   super();//will invoke parent class constructor  
   System.out.println("Bike is created"); 
   super.display();
  }  
  public static void main(String args[]){  
   Bike5 b=new Bike5();  
  
        
}
  
}