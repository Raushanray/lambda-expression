package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System Starts !!");
//        MyInterImpl myInter = new MyInterImpl();
//        myInter.seyHello();
        MyInter i = new MyInter() {
            //this is an anonymous class
            @Override
            public void seyHello() {
                System.out.println("this my fist anonymous class !!");
            }
        };
        i.seyHello();
        MyInter i2 = new MyInter() {
            //this is an anonymous class
            @Override
            public void seyHello() {
                System.out.println("this my second anonymous class !!");
            }
        };
        i2.seyHello();

    }
}