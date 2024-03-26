package assessment;

public class revNumber {
    public static void main(String[] args) {
        int num = 6100;
        reversed(num);

    }
    static void reversed(int num){
        int ans =0;
        while(num>0){
            int temp = num %10;
            num /=10;
            ans = ans * 10 + temp;
        }
        System.out.println(ans);
    }
}
