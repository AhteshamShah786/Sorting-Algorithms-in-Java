// Ascending order
public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int p = low + 1;
        int q = high;

        while (p <= q)
        {
            while (p <= q && arr[p] <= pivot)
            {
                p++;
            }
            while (p <= q && arr[q] >= pivot)
            {
                q--;
            }
            if (p <= q)
            {
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
                p++;
                q--;
            }
        }

        int temp = arr[low];
        arr[low] = arr[q];
        arr[q] = temp;
        return q;
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args)
    {
        int[] myArray = {29, 10, 14, 37, 13};
        quickSort(myArray, 0, myArray.length - 1);
        for (int num : myArray)
        {
            System.out.print(num + " ");
        }
    }
}
