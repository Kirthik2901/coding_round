package assessment;

public class reversestring {
    public static void main(String[] args) {
        String str = "codecode";

        String reversed = reverse(str);
        System.out.println(reversed);


    }
    static String reverse(String str){
        char[] charstr = str.toCharArray();
        int i = 0;
        int r = charstr.length-1;

        while(i<r){
            char temp = charstr[i];
            charstr[i] = charstr[r];
            charstr[r] = temp;

            i++;
            r--;
        }
        return new String(charstr);

    }
}
