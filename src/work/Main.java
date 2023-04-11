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
//        MyInter i = () -> {
//            System.out.println("this is first time i am using lambda");
//        };
//        i.seyHello();
        //apply the lambda rule
        /*If the body of the lambda expression contains only
         one statement then the curly braces are optional. */

//        MyInter i1 = () -> System.out.println("this is first time i am using lambda with rule");
//        i1.seyHello();
//
//        //2nd time create
//        MyInter i2 = () -> System.out.println("this is second time i am using lambda with rule");
//        i2.seyHello();

        //here use SumInter interface
        SumInter sumInter = (int a, int b) -> {
            return a + b;
        };
        System.out.println(sumInter.sum(2, 6));
        System.out.println(sumInter.sum(5, 8));

        //apply the lambda rule
        /*If the body of the lambda expression contains only
         one statement then the curly braces are optional. */
        /* Java compiler also inter the type of variable
        passed in arguments, hence type is optional.*/
        SumInter sumInter1 = (a, b) -> a + b;
        System.out.println("run lambda with rule");

        System.out.println(sumInter1.sum(5, 6));
        System.out.println(sumInter1.sum(5, 9));


    }
}