import java.util.*;

public class circular_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k,p=0;
        System.out.print("Enter a number: ");
        String num = in.next();
        int num_copy = Integer.parseInt(num),l=0,num2=num_copy;
        while(num_copy>0){
            k=0;
            int num3=Integer.parseInt(num);
            System.out.println(num3);
            for(int i=1;i<=num3;i++){
                if(num3%i==0){
                    k++;
                }
            }
            if(k==2){
                p++;
            }
            l++;
            int temp = Integer.parseInt(num.substring(num.length() - 1));
            num = Integer.toString(temp).concat(num.substring(0, num.length()-1));
            num_copy/=10;
        }
        if(p==l){
            System.out.println(num2+" is a circular prime number");
        }
        else{
            System.out.println(num2+" is not a circular prime number");
        }
    }
}
