
import java.util.Scanner;

public class ED {

    public static void main(String[] args) {
        int s[], q[], p[];
        int x = 0, y = 0, z = 0, c = 0;

        Scanner d = new Scanner(System.in);
        x = d.nextInt();
        s = new int[x];
        p = new int[100];
        for (int i = 0; i < x; i++) {
            s[i] = d.nextInt();
        }

        y = d.nextInt();
        q = new int[y];
        for (int i = 0; i < y; i++) {
            q[i] = d.nextInt();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (s[i] != q[j]) {
                    z++;
                    if (z == y) {
                        p[c] = s[i];
                        c++;
                    }
                }
            }
            z = 0;
        }

        for (int i = 0; i < c; i++) {
            System.out.print(p[i]+" ");
        }
    }
}
