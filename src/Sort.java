public class Sort {
    public static int[] selectionSort(int[] arr, int mode) {
        int[] newArr = new int[arr.length];
        int[] arrClone = arr;
        for (int i=0; i<arr.length; i++){
            int index = 0;
            if (arrClone.length > 1) {
                index = findIndex(arrClone, mode);
            }
            newArr[i] = arrClone[index];
            arrClone = arrCopyWithRm(arrClone, index);
        }
        return newArr;
    }

    public static int[] arrCopyWithRm(int[] arr, int indexRm) {
        int[] arrClone = new int[arr.length-1];

        for (int i=0; i<arr.length; i++) {
            if (i < indexRm) {
                arrClone[i] = arr[i];
            } else if (i > indexRm) {
                arrClone[i-1] = arr[i];
            }
        }
        return arrClone;
    }

    private static int findIndex(int[] arr, int mode) {
        int item = arr[0];
        int item_index = 0;
        for (int i=1; i<arr.length; i++) {
            if (mode == 0) {
                if (arr[i] > item){continue;}
            } else {
                if (arr[i] < item){continue;}
            }
            item = arr[i];
            item_index = i;
        }
        return item_index;
    }
}
