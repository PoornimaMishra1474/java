class less extends Exception {

    public less(String str) {
        super(str);
    }
}

public class Lesser {
    static void check(int num) throws less {
        if (num < 500) {
            throw new less("Number is less than 500");
        } else {
            System.out.println("Value is correct");
            System.out.println(num);
        }
    }

    public static void main(String args[]) {
        try{
            check(505);
        }

        catch(less e){
            System.out.println(e);
        }
    }
}