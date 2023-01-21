public class ArrayDemo {
    public static void main(String[] args) {
        // Enhanced for loop demo
        int arr[] = new int[4];
        arr[0] = 10;
        arr[3] = 20;
        arr[2] = 30;
        arr[1] = 40;
        for (int j : arr)
            System.out.println(j);
    }
}
