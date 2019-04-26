package examples.oop;

public class TestClass {
    public static void main(String[] args) {
        Cat myCat = new Cat ();
        Cat myCat2 = new Cat ("Tisha", "black", -7);
        myCat.color = "white";
        myCat.name = "Eva";
        myCat.setAge(-2);
        System.out.println(myCat2.meow());
        String hello = myCat.meow ();
        System.out.println(myCat.meow());
        myCat.eat("Royal Canin", 5);
//        Cat myCat2 = myCat;
//        System.out.println(myCat.color);
//        System.out.println(myCat2.color);
//        myCat2.color = "red";
//        System.out.println(myCat.color);
//        System.out.println(myCat2.color);
//        System.out.println(myCat.meow());

    }
}
