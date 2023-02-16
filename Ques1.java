package Project1;

class ExtendThread extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);}
        System.out.println("End of thread : "+Thread.currentThread().getName());}
}
class RunnableInterface implements Runnable{
    public void run(){
        for(int i =10;i<15;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);}
        System.out.println("End of thread : "+Thread.currentThread().getName());}
}
public class Ques1{
    public static void main(String[] args) {
        ExtendThread obj1 = new ExtendThread();
        ExtendThread obj2 = new ExtendThread();
        obj1.start();
        obj2.start();
        RunnableInterface a = new RunnableInterface();
        RunnableInterface b = new RunnableInterface();
        Thread tx = new Thread(a);
        tx.setName("Vidhant");
        Thread ty = new Thread(b);
        tx.setName("danny");
        tx.start();
        ty.start();
    }
}
