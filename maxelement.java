package assessment;

public class maxelement {
    public static void main(String[] args) {
        int[] arr = {54,546,548,60};

        max(arr);

    }
    static  void max(int[] arr){
        int max = arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
