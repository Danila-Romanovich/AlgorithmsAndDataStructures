import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static List<Integer> selectionSort(int[] arr, int mode) {
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> arrClone = new ArrayList<>();
        for (int i:arr) {
            arrClone.add(i);
        }
        int length = arrClone.size();
        if (mode == 0) {
            for (int i=0; i<length; i++){
                int smallest = findSmallest(arrClone);
                newArr.add(arrClone.get(smallest));
                arrClone.remove(smallest);
            }
        } else {
            for (int i=0; i<length; i++){
                int smallest = findBiggest(arrClone);
                newArr.add(arrClone.get(smallest));
                arrClone.remove(smallest);
            }
        }

        return newArr;
    }

    private static int findSmallest(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) < smallest){
                smallest = arr.get(i);
                smallest_index = i;
            } else {
                continue;
            }
        }
        return smallest_index;
    }

    private static int findBiggest(ArrayList<Integer> arr) {
        int biggest = arr.get(0);
        int biggest_index = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) > biggest){
                biggest = arr.get(i);
                biggest_index = i;
            } else {
                continue;
            }
        }
        return biggest_index;
    }
}
