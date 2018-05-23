package Exercícios;
import java.lang.*;
import java.io.*;

class BST {

    static class No{
        private int conteudo;
        private No esquerda;
        private No direita;

        public No(int conteudo) {
            this.conteudo = conteudo;
            esquerda = null;
            direita = null;
        }
    }

    static class  Arv{
        private No raiz;
        private int c;

        public Arv() {
            raiz = null;
            c = 0;
        }

        public void inserirRaiz(int x) {
            No novoNo = new No(x);
            raiz = novoNo;
        }

        public void inserir(int x, No n) {
            while (true) {
                c++;
                if (x < n.conteudo) {
                    if (n.esquerda == null) {
                        No novoNo = new No(x);
                        n.esquerda = novoNo;
                        break;
                    } else {
                        n = n.esquerda;
                    }
                } else {
                    if (n.direita == null) {
                        No novoNo = new No(x);
                        n.direita = novoNo;
                        break;
                    } else {
                        n = n.direita;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
            Arv arv = new Arv();

            int tamanho = Integer.parseInt(ler.readLine());

            for (int i = 0; i < tamanho; i++) {
                int x = Integer.parseInt(ler.readLine());

                if (i == 0) {
                    arv.inserirRaiz(x);
                    System.out.println(arv.c);
                } else {
                    arv.inserir(x, arv.raiz);
                    System.out.println(arv.c);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

