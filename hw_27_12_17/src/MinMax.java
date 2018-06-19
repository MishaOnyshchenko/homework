public class MinMax {
    public static void main(String[] args) {
        int min, max;
        int nums [] = {99, -10, 100123, 18, -978};
        min = max = nums[0];
        for (int i = 1; i < 5; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if (nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
        int sum = 0;
        for (int i = 0; i < 5; i++){
            if (nums[i] != min && nums[i] != max){
                sum += nums[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
