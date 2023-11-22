import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Sort sorts = new Sort();
        int[] arr = new int[] {3, 45,66,2,13,51};

        for (int i:Sort.selectionSort(arr, 0)) {
            System.out.print(i + " ");
        }


    }
}