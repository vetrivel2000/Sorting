import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[]original,int start,int end)
    {
        if (start<end)
        {
            int pIndex=partition(original,start,end);
            quickSort(original,start,pIndex-1);
            quickSort(original,pIndex+1,end);
        }
    }
    public static int partition(int[] original,int start,int end)
    {
        int pivot=original[end];
        int pIndex=start;
        for (int i = start; i <end ; i++) {
            if (original[i]<=pivot)
            {
                int temp=original[i];
                original[i]=original[pIndex];
                original[pIndex]=temp;
                pIndex++;
            }
        }
        int temp=original[pIndex];
        original[pIndex]=original[end];
        original[end]=temp;
        return pIndex;
    }
    public static void main(String[] args)
    {
        int[] originalArray={2,3,1,9,4,6,5};
        quickSort(originalArray,0,originalArray.length-1);
        System.out.println(Arrays.toString(originalArray));
    }
}
