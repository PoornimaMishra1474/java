package Project1;
class MyThread extends Thread{
    Thread t;String name;int priority;int count = 0;
    MyThread(String name,int priority){
        this.name = name;
        this.priority = priority;
        t = new Thread(this,name);
        t.setPriority(priority);
        System.out.println(t.getName() + " thread started");
        t.start();}
    public void run(){
        try {
            if(t.getPriority()>7){
                t.sleep(1000);}
            System.out.println(t.getName() + "is Alive : " + t.isAlive());
            while (t.isAlive() && count !=5){
                System.out.println(t.getName() +" :" +count);
                count++;}
        }catch (InterruptedException e){
            System.out.println(e);}}}
public class Ques4 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("thread-1",8);
        MyThread t2 = new MyThread("thread-2",10);
        MyThread t3 = new MyThread("thread-3",5);
        MyThread t4 = new MyThread("thread-4",7);
        MyThread t5 = new MyThread("thread-5",3);

    }
}
