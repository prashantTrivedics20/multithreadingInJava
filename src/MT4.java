 class MT4 implements Runnable  {
    @Override
    public void run()
    {
        // write any logic part it is up to you......
            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                }
                System.out.println(i);
            }
    }
}
class MT4Execution
{
    public static void main(String[] args) {
        MT3 obj=new MT3();
        Thread obj1=new Thread(obj);
        Thread obj2=new Thread(obj);

        obj1.start();
        obj2.start();
        // it is implicitly call the run function.... which is overriden by the MT3 class(it is derived class
        // which is implements the Runnable interface....


    }
}
