public class Main {
    public static void main(String[] args) {
        System.out.println(factoral(12));
    }

    private static int factoral(int i) {
        if(i==1) return 1;
        return i * factoral(i-1);
    }
}
