import java.util.*;
interface rbi{
        public void intrest();
        public void roi(int p, int t);

}
class BankDetails {
    private int accno;
    private String name;
    private String acc_type;
    private long balance=0;

    Scanner sc = new Scanner(System.in);

    public void BankDetails() {
        System.out.println("Enter Account No: ");
        accno = sc.nextInt();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

        void display(){
                System.out.println("Account Number : "+accno);
                System.out.println("Account Number : "+acc_type);
                System.out.println("Account Number : "+name);
                System.out.println("Account Number : "+balance);
        }

        void deposit(){
                int money;
                money = sc.nextInt();
                balance = balance + money;
        }

        void withdraw(){
                int wtd;
                wtd = sc.nextInt();
                balance = balance -wtd;
        }
}
class icici implements rbi{
        public void intrest(){
}
	final int inicici =  8;
        public void roi(int p, int t){
                int roii = (p*inicici*t)/100;
                System.out.println("The Return on Investment will be : "+roii);
        }

}

class axis implements rbi{
final int inaxis = 9 ;
        public void intrest(){
}
        public void roi(int p, int t){
                int roia = (p*inaxis*t)/100;
                System.out.println("The Return on Investment will be : "+roia);
        }
}

class sbi implements rbi{
                final int insbi = 10;
        public void intrest(){
}
        public void roi(int p, int t){
                int rois = (p*insbi*t)/100;
                System.out.println("The Return on Investment will be : "+rois);
        }
}



class Bank {
        public static void main(String args[]){
                System.out.println("What bank do you want to open your account :");
                System.out.println("1.ICICI\n2.AXIS\n3.SBI");
                int choice;

                icici ic = new icici();
                axis ax  = new axis();
                sbi sb = new sbi();

                ic.roi(10000, 10);
                switch(choice){
                        case 1:

                }
        }
}