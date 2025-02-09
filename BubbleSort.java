//2. Bubble sort
//Space Complexity O(1) because no elements are stored in any other array, in same array elements are just swapped
//Time Complexity Best Case O(n)when it iS ALREADY SORTED and Worst Case O(n2)
// n is number of comparisons(swaps)(only one loop will run if there is no swapping)
public class BubbleSort
{
    public static void main(String args[])
    {
        int arr[] = {3,4,2,1,5}; //unsorted Array
        int swapped = 0;
        int n = arr.length;
        for(int i = 0; i<n-1; i++)
        {
            for(int j = 1; j<n-i; j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                swapped = 1;
                }
            }
            if(swapped == 0)
            {
                System.out.println("It is already sorted ");
                break;
            }
        }

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
