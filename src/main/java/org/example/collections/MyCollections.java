package org.example.collections;

import java.util.Comparator;
import java.util.List;

public class MyCollections {
    /**
     * @return индекс найденного элемента или (-(insertion point) - 1) как в JAVA
     */
    public static <T> int binarySearch(List<T> list, T key, Comparator<T> c) {
        if (list == null || key == null || c == null) {
            throw new NullPointerException("List, key, or comparator cannot be null");
        }

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = list.get(mid);

            int comparison = c.compare(midVal, key);

            if (comparison < 0) {
                low = mid + 1;
            } else if (comparison > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -(low + 1);
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, Comparable::compareTo);
    }
}
