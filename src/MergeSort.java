import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] left,int[] right,int[]original)
    {
        int nl= left.length;
        int nr=right.length;
        int i=0,j=0,k=0;
        while (i<nl&&j<nr)
        {
            if(left[i]<=right[j])
            {
                original[k]=left[i];
                i++;
            }
            else
            {
                original[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<nl)
        {
            original[k]=left[i];
            i++;
            k++;
        }
        while (j<nr)
        {
            original[k]=right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] A)
    {
        int n=A.length;
        if (n<2)
        {
            return;
        }
        int mid=n/2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for (int i = 0; i <mid ; i++) {
            left[i]=A[i];
        }
        for (int i = mid; i <n ; i++) {
            right[i-mid]=A[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,A);
    }
    public static void main(String[] args)
    {
        int[] originalArray={2,3,1,9,4,6,5};
        mergeSort(originalArray);
        System.out.println(Arrays.toString(originalArray));
    }
}
