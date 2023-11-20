import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        check method selection Sort
        Sort sorts = new Sort();
        int[] arr = new int[] {3, 45,66,2,13,51};
        System.out.println(Sort.selectionSort(arr, 0));
        System.out.println(Sort.selectionSort(arr, 1));
    }
}