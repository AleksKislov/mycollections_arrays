package org.example.arrays;

import java.util.Comparator;

public class MyArrays {

    // да, для каждого метода я сначала создаю массив внутри, в котором
    // уже Comparable объекты, но с другой стороны оптимизировать по памят и не было
    // поставлено задачи :)
    static <T> int binarySearch(T[] a, T key, Comparator<T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    /**
     * @return индекс найденного элемента или (-(insertion point) - 1) как в JAVA
     */
    private static <T> int binarySearch(T[] array, int fromIndex, int toIndex, T key,  Comparator<T> c) {
        if (array == null) {
            throw new NullPointerException();
        }

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = array[mid];
            int comparison = c.compare(midVal, key);

            if (comparison < 0) low = mid + 1;
            else if (comparison > 0) high = mid - 1;
            else return mid;
        }

        return -(low + 1);
    }

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        Byte[] boxed = new Byte[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Byte::compare);
    }

    static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        Character[] boxed = new Character[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Character::compare);
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        Double[] boxed = new Double[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Double::compare);
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        Float[] boxed = new Float[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Float::compare);
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        Integer[] boxed = new Integer[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Integer::compare);
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        Long[] boxed = new Long[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Long::compare);
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        Short[] boxed = new Short[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            boxed[i - fromIndex] = a[i];
        }

        return binarySearch(boxed, fromIndex, toIndex, key, Short::compare);
    }
}
