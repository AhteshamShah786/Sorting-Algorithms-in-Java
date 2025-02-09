// Insertion Sort (Ascending Order)
public class InsertionSort
{
    public static void main(String args[]) {
        int array[] = {4, 2, 5, 1, 3};
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if(array[j]<array[j-1])
                {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int print:array)
        {
            System.out.print(print+ " ");
        }
    }
}
