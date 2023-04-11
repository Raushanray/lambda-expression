package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System Starts !!");
//        MyInterImpl myInter = new MyInterImpl();
//        myInter.seyHello();
//        MyInter i = new MyInter() {
//            //this is an anonymous class
//            @Override
//            public void seyHello() {
//                System.out.println("this my fist anonymous class !!");
//            }
//        };
//        i.seyHello();
//        MyInter i2 = new MyInter() {
//            //this is an anonymous class
//            @Override
//            public void seyHello() {
//                System.out.println("this my second anonymous class !!");
//            }
//        };
//        i2.seyHello();

        //using our interface with the help of lambda
        MyInter i = () -> {
            System.out.println("this is first time i am using lambda");
        };
        i.seyHello();
        //apply the lambda rule
        /*If the body of the lambda expression contains only
         one statement then the curly braces are optional. */

        MyInter i1 = () -> System.out.println("this is first time i am using lambda with rule");
        i1.seyHello();

        //2nd time create
        MyInter i2 = () -> System.out.println("this is second time i am using lambda with rule");
        i2.seyHello();


    }
}