import java.io.*;

public class NicebtreeGIT {
	
	static class No{
		private char conteudo;
		private No esquerda;
		private No direita;
		
		public No(char conteudo){
			this.conteudo = conteudo;
			esquerda = null;
			direita = null;
		}
	}
	
	static class Arv{
		private No raiz;
		private No aux;
		private int id = 0;
		
		public Arv() {
			raiz = null;
		}
		
		
		public void inserir(char c[]) {
			No novoNo = new No(c[id]);
			raiz = novoNo;
			
			if(c[id] == 'n') {
				novoNo.esquerda = adicionarFolha(raiz, c[id+=1], c);
				novoNo.direita = adicionarFolha(raiz, c[id+=1], c);
			}
			
		}
		
		public No adicionarFolha(No p, char conteudo, char c[]) {
			No aux = new No(conteudo);
			
			if(conteudo == 'n') {
				aux.esquerda = adicionarFolha(aux,c[id+=1], c);
				aux.direita = adicionarFolha(aux, c[id+=1], c);

			}
			return aux;
		}
		
		public int calcularProfundidade(No n) {
			if(n.conteudo == 'l') {
				return 0;
			}
			
			int esquerdaP = calcularProfundidade(n.esquerda);
			int direitaP = calcularProfundidade(n.direita);
			
			if(esquerdaP> direitaP) {
				return esquerdaP + 1;
			}else {
				return direitaP + 1;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
			
			int tamanho = Integer.parseInt(ler.readLine());
			int saida[] = new int[tamanho];
			
			for(int i = 0; i < tamanho; i++) {
				
				String aux = ler.readLine();
				char string[] = aux.toCharArray();
				Arv arv = new Arv();
				arv.inserir(string);
				saida[i] = arv.calcularProfundidade(arv.raiz);
			}
			
			for(int i = 0; i< tamanho; i++) {
				System.out.println(saida[i]);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
