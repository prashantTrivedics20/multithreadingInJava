//public class MT1 implements Runnable
//{
//    public void run()
//    {
//        for (int i = 0; i <10 ; i++) {
//            System.out.println("MT "+ i);
//
//        }
//
//    }
//
//}
class Test
{
    public static void main(String[] args) {
        //MT1 obj=new MT1();
        Thread obj1=new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Mythread"+i);
            }
        });
        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Mythread"+i);
        }
    }
}