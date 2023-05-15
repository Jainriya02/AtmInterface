import java.util.*;
public class Input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);    // make a object of Scanner class
        int a= sc.nextInt();
        String c=sc.nextLine();     // take upto next line  (\n)
        String b= sc.next();        // take upto next space
        byte j= sc.nextByte();
        char ch = sc.next().charAt(1);     //  take char as input
        //System.out.println(ch);
       short k= sc.nextShort();;
        long e= sc.nextLong();
        float  l= sc.nextFloat();
        double q = sc.nextDouble();
        boolean w= sc.nextBoolean();



    }
}
