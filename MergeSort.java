//Merge Sort
import java.util.Arrays;

public class MergeSort
{
    public static int[] merge(int[] first, int[] second)
    {
        int mix[]  = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j< second.length)
        {
            if(first[i]<second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else
            {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static int[] mergeSort(int arr[])
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));      // Instead of this, we can copy left half of  arr manually
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); // Instead of this, we can copy right half of  arr manually

        return merge(left,right);
    }

    public static void main(String args[])
    {
        int array[] = {3,4,2,6,1,5};
        array = mergeSort(array);
        for(int i: array)
        {
            System.out.print(i+" ");
        }
        //0r System.out.println(Arrays.toString(array));
    }
}
