package Exercícios;

import java.util.Scanner;

public class OMWG {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y, p;
        
        p = ler.nextInt();
        for(int i=0;i<p;i++){
            x = ler.nextInt();
            y = ler.nextInt();
            x = (x -1) * y + x * (y - 1);
            System.out.println(x);
        }
    }
}
