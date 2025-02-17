public class Main {
    public static void main(String[] args) {

        int[] dataInt = {8, 9, 10, 1, 3, 4, 11, 15, 100, 55, 2, 5, 200};
        char[] dataChar = {'v', 'b', 'a', 'z', 'v', 'c', 'f'};
        String[] dataString = {"CODING", "kelas", "XI", "IPA", "I"};

        System.out.println("=== Sorting menggunakan QuickSort ===");
        QuickSorter quickSorter = new QuickSorter(dataInt, dataChar, dataString);
        quickSorter.sortIntAsc();
        quickSorter.sortIntDesc();
        quickSorter.sortCharAsc();
        quickSorter.sortCharDesc();
        quickSorter.sortStringAsc();
        quickSorter.sortStringDesc();

        System.out.println("\n=== Sorting menggunakan Insertion Sort ===");
        InsertionSorter insertionSorter = new InsertionSorter(dataInt, dataChar, dataString);
        insertionSorter.sortIntAsc();
        insertionSorter.sortIntDesc();
        insertionSorter.sortCharAsc();
        insertionSorter.sortCharDesc();
        insertionSorter.sortStringAsc();
        insertionSorter.sortStringDesc();
    }
}

class Sorter {
    private int[] dataInt;
    private char[] dataChar;
    private String[] dataString;

    public Sorter(int[] dataInt, char[] dataChar, String[] dataString) {
        this.dataInt = dataInt.clone();
        this.dataChar = dataChar.clone();
        this.dataString = dataString.clone();
    }

    public int[] getDataInt() {
        return dataInt;
    }

    public char[] getDataChar() {
        return dataChar;
    }

    public String[] getDataString() {
        return dataString;
    }

    public void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void printStringArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

class QuickSorter extends Sorter {

    public QuickSorter(int[] dataInt, char[] dataChar, String[] dataString) {
        super(dataInt, dataChar, dataString);
    }

    public void sortIntAsc() {
        int[] arr = getDataInt().clone();
        quickSortIntAsc(arr, 0, arr.length - 1);
        System.out.print("QuickSort Int Ascending: ");
        printIntArray(arr);
    }

    private void quickSortIntAsc(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionIntAsc(arr, low, high);
            quickSortIntAsc(arr, low, pi - 1);
            quickSortIntAsc(arr, pi + 1, high);
        }
    }

    private int partitionIntAsc(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sortIntDesc() {
        int[] arr = getDataInt().clone();
        quickSortIntDesc(arr, 0, arr.length - 1);
        System.out.print("QuickSort Int Descending: ");
        printIntArray(arr);
    }

    private void quickSortIntDesc(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionIntDesc(arr, low, high);
            quickSortIntDesc(arr, low, pi - 1);
            quickSortIntDesc(arr, pi + 1, high);
        }
    }

    private int partitionIntDesc(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sortCharAsc() {
        char[] arr = getDataChar().clone();
        quickSortCharAsc(arr, 0, arr.length - 1);
        System.out.print("QuickSort Char Ascending: ");
        printCharArray(arr);
    }

    private void quickSortCharAsc(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionCharAsc(arr, low, high);
            quickSortCharAsc(arr, low, pi - 1);
            quickSortCharAsc(arr, pi + 1, high);
        }
    }

    private int partitionCharAsc(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sortCharDesc() {
        char[] arr = getDataChar().clone();
        quickSortCharDesc(arr, 0, arr.length - 1);
        System.out.print("QuickSort Char Descending: ");
        printCharArray(arr);
    }

    private void quickSortCharDesc(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionCharDesc(arr, low, high);
            quickSortCharDesc(arr, low, pi - 1);
            quickSortCharDesc(arr, pi + 1, high);
        }
    }

    private int partitionCharDesc(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sortStringAsc() {
        String[] arr = getDataString().clone();
        quickSortStringAsc(arr, 0, arr.length - 1);
        System.out.print("QuickSort String Ascending: ");
        printStringArray(arr);
    }

    private void quickSortStringAsc(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionStringAsc(arr, low, high);
            quickSortStringAsc(arr, low, pi - 1);
            quickSortStringAsc(arr, pi + 1, high);
        }
    }

    private int partitionStringAsc(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sortStringDesc() {
        String[] arr = getDataString().clone();
        quickSortStringDesc(arr, 0, arr.length - 1);
        System.out.print("QuickSort String Descending: ");
        printStringArray(arr);
    }

    private void quickSortStringDesc(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionStringDesc(arr, low, high);
            quickSortStringDesc(arr, low, pi - 1);
            quickSortStringDesc(arr, pi + 1, high);
        }
    }

    private int partitionStringDesc(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) >= 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class InsertionSorter extends Sorter {

    public InsertionSorter(int[] dataInt, char[] dataChar, String[] dataString) {
        super(dataInt, dataChar, dataString);
    }

    public void sortIntAsc() {
        int[] arr = getDataInt().clone();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort Int Ascending: ");
        printIntArray(arr);
    }

    public void sortIntDesc() {
        int[] arr = getDataInt().clone();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort Int Descending: ");
        printIntArray(arr);
    }

    public void sortCharAsc() {
        char[] arr = getDataChar().clone();
        for (int i = 1; i < arr.length; i++) {
            char key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort Char Ascending: ");
        printCharArray(arr);
    }

    public void sortCharDesc() {
        char[] arr = getDataChar().clone();
        for (int i = 1; i < arr.length; i++) {
            char key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort Char Descending: ");
        printCharArray(arr);
    }

    public void sortStringAsc() {
        String[] arr = getDataString().clone();
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort String Ascending: ");
        printStringArray(arr);
    }

    public void sortStringDesc() {
        String[] arr = getDataString().clone();
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sort String Descending: ");
        printStringArray(arr);
    }
}
