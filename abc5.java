///ARRAY
public class abc5 {
    public static void main(String[] args) {

        // Single dimension array
        String[] arr = { "array", "in", "process" };
        int i;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // change array element
        arr[0] = "Single";
        System.out.println(arr[0]);

        // multidimensional array
        String[][] ar = { { "Array", "is" }, { "displayed" } };
        int u, j;
        for (u = 0; u < ar.length; u++) {
            for (j = 0; j < ar[u].length; j++) {
                System.out.print(ar[u][j]);
            }
        }
    }
}