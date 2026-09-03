import java.util.*;

class Digital_Permutation{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num,key;

        System.out.print("Number:\t");
        num=in.nextInt();

        System.out.print("Key :\t");
        key=in.nextInt();

        String numStr = Integer.toString(num);
        String keyStr = Integer.toString(key);

        if(num<0 || key<0 || numStr.length()!=keyStr.length()){
            System.out.println("Invalid Key Size");
            System.exit(0);
        }

        int arr_store[]=new int[numStr.length()];
        boolean[] used = new boolean[arr_store.length + 1];

        while(num>0){
            int t_num=num%10;
            int t_key=key%10;

            if(t_key == 0 || t_key > arr_store.length || used[t_key]){
                System.out.println("Invalid Key");
                System.exit(0);
            }

            arr_store[t_key - 1] = t_num;
            used[t_key] = true;
            num/=10;
            key/=10;
        }

        int result=0;
        for(int i=0;i<arr_store.length;i++){
            result=result*10+arr_store[i];
        }
        System.out.println("Result: " + result);
    }
}