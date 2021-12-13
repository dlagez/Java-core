package leetcode;

public class demo1011 {
    public static void main(String[] args) {
// [1,2,3,4,5,6,7,8,9,10]
//        5
//                [3,2,2,4,1,4]
//        3
//                [1,2,3,1,1]
//        4
        int[] weights = new int[] {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int results = shipWithinDays(weights, days);
        System.out.println(results);
    }
    // 求最低运载能力
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 1;
        for (int weight : weights) {
            // 最小载重要大于其中一个货物，因为货物并不能拆分装运
            left = Math.max(left, weight);
            // 最大载重要为所有货物的重量和即可
            right = right + weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(weights, mid) == days) {
                right = mid;
            } else if (f(weights, mid) < days) {
                right = mid;
            } else if (f(weights, mid) > days) {
                left = mid + 1;
            }
        }
        // 这里是需要return left，为什么要return left
        return left;


    }

    // 根据货物的重量weights和运载能力x计算出需要运输的时间day
    static int f(int[] weights, int x) {
        int days = 0;
        for (int i = 0; i < weights.length; ) {
            // 尽可能多装货物
            int cap = x;
            while (i < weights.length) {
                if (cap < weights[i]) break;
                else cap -= weights[i];
                i++;
            }
            days++;
        }
        return days;
    }
}
