public class MT3 implements Runnable {

    @Override
    public void run() {
        // write any logic part it is up to you......
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
        ;
        System.out.print(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
    }
}
class MT3Execution
{
    public static void main(String[] args) {
        MT3 obj=new MT3();
        //System.out.println("prashant");
        Thread obj1=new Thread(obj);
        //Thread obj2=new Thread(obj);
        //obj1.setDaemon(true);
        obj1.setDaemon(true);//it wil provide service to the main Thread...
        System.out.println("prashant");
        obj1.start();
     // obj2.start();
        // it is implicitly call the run function.... which is overriden by the MT3 class(it is derived class
        // which is implements the Runnable interface....
    }
}

