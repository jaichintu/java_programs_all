package onlypatterns;

public class fibnoccistarpattern {
    public static void main(String[] args) {
        int n = 8;
        int fn = 0;
        int sn = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=fn; j++) {
                System.out.print("*");   
            }
            System.out.println();
            int nextnum = fn + sn;
            fn = sn;
            sn = nextnum;
        }
    }
}