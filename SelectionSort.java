//1. Selection sort (Ascending Order)

public class SelectionSort
{
    public static void main(String args[])
    {
        int array[] = {5,3,6,4,2,1};

        for(int i = 0; i<array.length;i++)
        {
            int min = i;
            for(int j = i+1; j<array.length;j++)
            {
                if(array[min]>array[j])
                {
                    min = j;
                }
            }
            int temp = array[min];
            array[min]=array[i];
            array[i] = temp;
        }
        for(int print:array)
        {
            System.out.print(print+" ");
        }
    }
}
