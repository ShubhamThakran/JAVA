//recursion
public class recursion {
    static int poo(int s, int t) {
        if (t > s) {
            return t + poo(s, t - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int r = poo(90, 800);
        System.out.println(r);
    }

}