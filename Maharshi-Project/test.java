public class test {
    public static void main(String[] args) {
        // String str = "Hello, World!";
        // String str2=str.substring(0,5);
        // System.out.println(str2);
        String num = "12345";
        int temp = Integer.parseInt(num.substring(num.length() - 1));
        System.out.println(temp);
        num = Integer.toString(temp).concat(num.substring(0, num.length()-1));
        System.out.println(num);
    }    
}
