package Project1;
class A {
    static int i = 0;
    synchronized void print() {
            System.out.println(Thread.currentThread().getName() + " :" + this.i++);}}
class B extends Thread{
    A obj = new A();
    public void run(){
        obj.print();}}
public class Ques3 {
    public static void main(String[] args) {
        //creating and running 10 thread objects (through an array)
        B[] thread_arr = new B[10];
        for(int i =0;i<thread_arr.length;i++){
            thread_arr[i] = new B();
            thread_arr[i].start();
        }
    }
}
