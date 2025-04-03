package sololessons;

public class les6 {
    public static void main(String[] args) { // Массивы данных

        int[] nums = new int[5]; // Идет смещение на еденицу (счет с нуля)
        // Заполнение массива значениями
        nums[0] = 45; // 1 [0]
        nums[1] = 32; // 2 [1]
        nums[2] = 1;  // 3 [2]
        nums[3] = 9;  // 4 [3]
        nums[4] = 3;  // 5 [4]

        int res = nums[2] + nums[3];

        System.out.println("Result: " + res);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f}; // Массив с типом данных float
        System.out.println(nums2[2]);

        for(int i = 0; i < nums2.length; i++) { // length - длинна массива (занятая память)
            System.out.println("Float element: " + nums2[i]);
        }
    }
}
