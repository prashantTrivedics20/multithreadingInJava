public class MT5 extends Thread {
    public void run()
    {
        Thread t=currentThread();// current thread is used to give an object reference...
        for (int i = 0; i < 5; i++) {
            try
            {
                //Thread.sleep(1000);// after execution the thread thousend milli second every thread is waiting ..
                t.sleep(1000);// we can also use this..
            }
            catch(Exception e)
            {

            }
            System.out.println(i);
        }
    }
}
class MT5Execution
{
    public static void main(String[] args) {
        MT5 obj=new MT5();// here obj denotes the thread object..
        MT5 obj1=new MT5();

        /*System.out.println("Id="+obj.getId());
        System.out.println("name of the thread is="+obj.getName());
        obj.setName("prashant");// by using this we can change the name  of the thread ...
        System.out.println("name od the thread after changing its name");
        System.out.println("name of the thread is="+obj.getName());
        System.out.println("Priority od thread is "+obj.getPriority());
        obj.setPriority(1);// by using this we can change the priority..
        System.out.println("priority of thread after changing the thread is "+obj.getPriority());
        // note- we can't predict that which thread is executing first...(because we have 100 thread so we can't predict which
        // thread is executing first..*/
        obj.start();
        obj1.start();
    }
}