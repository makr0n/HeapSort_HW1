import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6, 7};
        int N = arr.length;


        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
