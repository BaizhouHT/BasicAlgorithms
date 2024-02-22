package Sort;

public class SelectionSort {
    public static void sort(String[] input, int start) {
        // 未排序的序列中找到最小值
        // 交换元素
        // 继续遍历剩余未排序的序列(此处递归实现)
        // base case
        if (start == input.length) {
            return;
        }
        // minimum subprocess
        int smallestIndex = findSmallest(input, start);
        swap(input, start, smallestIndex);
        // recursive process
        sort(input, start + 1);

    }

    public static void sort(int[] input) {

        for (int i=0; i<input.length; i++) {
            // 继续遍历剩余未排序的序列
            int minTemp = input[i];
            int minIndex = i;
            for (int j=i+1; j<input.length; j++) {
                // 未排序的序列中找到最小值
                if (input[j] < minTemp) {
                    minTemp = input[j];
                    minIndex = j;
                }
            }
            // 交换元素
            swap(input, i, minIndex);
        }
    }

    /** Swap two element in int[]. */
    public static void swap(int[] input, int currIndex, int preIndex) {
        int temp = input[currIndex];
        input[currIndex] = input[preIndex];
        input[preIndex] = temp;
    }

    /** Swap two element in String[]. */
    public static void swap(String[] input, int currIndex, int preIndex) {
        String temp = input[currIndex];
        input[currIndex] = input[preIndex];
        input[preIndex] = temp;
    }

    /** Returns the smallest string in x. */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i ++) {
            // String compare if a < b, return <0, or return >0
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
