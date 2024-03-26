package assessment;
import java.util.Scanner;

public class isprime {public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    prime(num);

}
    static void prime(int num){

        if(num == 0 || num == 1){
            System.out.println("Not a Prime!");
            return;
        }

        for(int i=2; i* i <=num; i++){
            if(num%i == 0){
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("prime number!");

    }
}
