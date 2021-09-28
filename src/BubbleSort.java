import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array)
    {
        boolean swapped=false;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] originalArray={2,3,1,9,4,6,5};
        bubbleSort(originalArray);
        System.out.println(Arrays.toString(originalArray));
    }
}
