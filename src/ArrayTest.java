import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {10, -1, 4, 5, 5};
        mt.bunnle(arr);
        System.out.println("sadfasd");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "asdf");
        }
    }


}

class MyTools {
    

    public void bunnle(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
