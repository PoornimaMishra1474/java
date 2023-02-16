package Project1;

class Demo1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);}}}}
class Demo2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+i);}}}}
public class Ques2 {
    public static void main(String[] args) {
        Demo1 t1 = new Demo1();
        Demo2 tx = new Demo2();
        tx.start();
        t1.start();
    }
}
