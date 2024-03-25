import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static <T> void selectionSort(ArrayList<T> arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.size() - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (comparator.compare(arr.get(j), arr.get(min_idx)) < 0) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            T temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
    }
}