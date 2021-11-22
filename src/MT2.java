 class MT2 extends Thread {
    @Override
    public void run()
    {
        System.out.println("thread");
    }
}
class MT2Execution1
{
    public static void main(String[] args) {
        MT2 obj =new MT2();
        obj.start();// whenever we call the start function it is implicitly call the run function....
    }
}
