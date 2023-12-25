public class Main {
    public static void main(String[] args) {

        int arr[] = { 5, 1, 4, 2, 8 };
        BubbleSort ob = new BubbleSort();

        System.out.println("Mảng ban đầu:");
        printArray(arr);
        ob.bubbleSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }


    // In các phần tử của arr
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
