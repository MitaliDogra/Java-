// Parent class 
class Animal {
  public void eating() {
  	System.out.println("The animal is eating.");
  }
}

// Child class 
class Dog extends Animal {
  // Dog's eating method overrides Animal's eating method
  @Override
  
  public void eating() {
    System.out.println("The dog is eating.");
  }
}

public class Ani{
    public static void main(String[] args){ 
        Animal ani=new Animal();
        Dog dogi=new Dog();
        ani.eating();
        dogi.eating();}
    }
   
