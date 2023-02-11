// Java program to demonstrate interface implementation 
// with hierarchical inheritance

interface MyInf {
    //Method Declaration
    void Method1();
  }
  
  class Sample1 implements MyInf {
    //Method definition
    public void Method1() {
      System.out.println("Method1() called");
    }
  }
  
  class Sample2 extends Sample1 {
    //Method definition
    public void Method2() {
      System.out.println("Method2() called");
    }
  }
  
  class Sample3 extends Sample1 {
    //Method definition
    public void Method3() {
      System.out.println("Method3() called");
    }
  }
  
  public class HierarchialInheritanceUsingInterface{
    public static void main(String[] args) {
      Sample2 S2 = new Sample2();
      Sample3 S3 = new Sample3();
  
      S2.Method1();
      S2.Method2();
  
      S3.Method1();
      S3.Method3();
    }
  }
  