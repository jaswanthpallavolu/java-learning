class Customer {
    public static void doAnyStaticAction() {
        System.out.println("this is parent static method");
    }
}

class User extends Customer {
    private static int counter;

    {
        ++counter;
    }

    public int getCounter() {
        return counter;
    }

    public static void doAnyStaticAction() {
        System.out.println("this is child static method");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        User child1 = new User();
        System.out.println("counter: " + child1.getCounter());
        User child2 = new User();
        System.out.println("counter: " + child2.getCounter());
        User.doAnyStaticAction();
        Customer.doAnyStaticAction();
    }
}
