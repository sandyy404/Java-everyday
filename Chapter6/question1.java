

public class question1 {

    public static void main(String[] args) {
        float[] arr = new float[5];

        arr[0] = 5.6f;
        arr[1] = 4.7f;
        arr[2] = 2.9f;
        arr[3] = 45.8f;
        arr[4] = 67.0f;
        for (int i = 1; i < 5; i++) {
            arr[0] += arr[i];
            // System.out.println(arr[i]);
        }
        System.out.println(arr[0]);
    }
}
