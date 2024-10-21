
import static java.util.Arrays.*;
// That means you want to import all static entities in this class

import java.util.Arrays;

public class StaticImport {

    public static void main(String[] args) {
        int[] arr = {134, 23, 3, 234, 565};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // after import static class Arrays
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
