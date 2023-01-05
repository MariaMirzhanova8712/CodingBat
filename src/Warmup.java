public class Warmup {

    public static void main(String[] args) {
        arrayCount9(1, 9, 1, 2, 9); // 1
        arrayCount9(1, 9, 1, 9, 9); // 2
        arrayCount9(1, 9, 9, 3, 9); // 3

    }

    private static void arrayCount9(int i, int i1, int i2, int i3, int i4) {
    }

    //private static void arrayCount9(int i4, int i3, int i, int i1, int i2) {
    //}

    public static int arrayCount9(int[] nums) {

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public boolean arrayFront9(int[] nums) {
        // First figure the end for the loop
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

}
