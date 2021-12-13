package leetcode;


public class demo875 {
    public static void main(String[] args) {
//         [3,6,7,11]       8
//         [30,11,23,4,20]  5
//         [30,11,23,4,20]  6
        int[] piles = new int[]{3,6,7,11};
        int H = 8;
        int result = minEatingSpeed(piles, H);
        System.out.println(result);
    }

    public static int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 1000000000 + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(piles, mid) == H) {
                // 这里需要注意，寻找左边界需要这样做。
                right = mid;
            } else if (f(piles, mid) < H) {
                right = mid;
            } else  if (f(piles, mid) > H) {
                left = mid + 1;
            }
        }
        return left;
    }


    // 吃完需要的时间， piles表示N堆香蕉，x表示吃香蕉的速度
    static int f(int[] piles, int x) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            // 吃其中一堆，如果还有剩余的，需要下一个小时再吃
            hours += piles[i] / x;
            // 这里加上吃剩下的
            if (piles[i] % x > 0) {
                hours++;
            }
        }
        return hours;
    }
}
