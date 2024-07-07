import java.util.Arrays;

 class LC_2582 {
    public static void main(String[] args) {
        int n = 4, time = 5;

        System.out.println(passThePillow(n, time));
    }

    public static int passThePillow(int n, int time) {
        int nums [] = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = i+1; 
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
