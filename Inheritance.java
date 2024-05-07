class Product{
    String name;
    public Product(String name){
        this.name = name;
    }

    void ring(){
        System.out.println("default ringtone...");
    }
    void getName(){
        System.out.println("Product name is " + this.name);
    }
}

class Phone extends Product{
    String name;
    public Phone(String name){
        super(name); // this line should be in the first line
        this.name = name + "-234dff";
    }
    void getName(){
        System.out.println(super.name + " " + this.name);
        super.getName();
        super.ring();
    }
}


class Parent{
    static {
        System.out.println("parent static init block");
    }

    {
        System.out.println("parent init block");
    }

    Parent(){
        System.out.println("parent constructor");
    }
}

class Child extends Parent{
    static {
        System.out.println("child static init block");
    }

    {
        System.out.println("child init block");
    }

    Child(){
        System.out.println("child constructor");
    }
}


public class Inheritance{
    public static void main(String[] args){
        Product phone1 = new Phone("iphone");
        phone1.getName();

        Parent child = new Child();
        System.out.println("---------");
        child = new Child();
    }
}