abstract class Shape{
  abstract void Draw();
}

class Rectangle extends Shape{
    void Draw(){
        System.out.println("this is Rectangle");
    }
}

class Triangle extends Shape{
    void Draw(){
        System.out.println("this is Triangle");
    }
}

public class AbstractionTest{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        rectangle.Draw();
        triangle.Draw();
    }
}