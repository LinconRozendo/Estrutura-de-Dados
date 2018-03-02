
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
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
                    // System.out.println("if 1     Z: "+z);
                    if (z == y) {
                        p[c] = s[i];
                        //System.out.println("if  .. 2 ..     Z: "+z);
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
