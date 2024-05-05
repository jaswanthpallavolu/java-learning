// Abstract
abstract class Abstract{
   abstract void getDetails();
}
// abstract class Abstract2{
//    void getDetails1();
// }

// it is not possible for multiple extends 
class Class2 extends Abstract{
    void getDetails(){
        System.out.println("this is Abstract method");
    }
}


// Interface
interface Abstract1{
   void getDetails1(); // default it is public and abstract
}
interface Abstract2{
   void getDetails2();
}

class Class1 implements Abstract1, Abstract2{
    public void getDetails1(){
        System.out.println("Abstract1 method");
    }
    public void getDetails2(){
        System.out.println("Abstract2 method");
    }
}

public class FirstProgram{
    public static void main(String[] args){
        System.out.println("hello this is my first program");
        Class1 obj = new Class1();
        obj.getDetails1();
        obj.getDetails2();

        Class2 obj2 = new Class2();
        obj2.getDetails();
    }
}