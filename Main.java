package ONP;

import ADAQUEUE.Filas;
import java.util.Scanner;
import java.util.Stack;



public class Main {
 
    
public static class No{
	private String conteudo;
	private No prox;
	
	public No(){
		setProx(null);
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
}

public static class PilhaEnc {
	No topo;
	int nElementos;
	
	public PilhaEnc(){
		topo = null;
		nElementos = 0;
	}
	
	/** Verifica se a Pilha está vazia*/
	public boolean vazia () {
	    if (nElementos == 0)
	        return true;
	    else
	        return false;
	}


	/** Consulta o elemento do topo da Pilha

	/** Insere um elemento no topo da pilha.
	    Retorna true se a insercao funcionar*/
	public boolean push(String valor) {
	    
		// Aloca memoria para novo no e preenche conteudo 
	    No novoNo = new No();
	    novoNo.setConteudo(valor);

	    // Faz o novo no apontar pro atual topo da pilha
	    novoNo.setProx(topo);
	    
	    // Atualiza o topo da pilha que agora sera o novo nó 
	    topo = novoNo;

	    // Atualiza o tamanho da pilha 
	    nElementos++;
	    return true;
	}

	/** Retira o elemento do topo da pilha.
	    Retorna -1 se a pilha estiver vazia.
	    Caso contrário retorna o valor removido */
	public String pop () {
	    if (vazia()) {
	    		return ("Lista Vazia"); // pilha vazia 
	    }
	    // Guarda o nó que é topo da pilha e o seu conteudo
	    No p = topo;
	    String valor = p.getConteudo();

	    /* Modifica o topo da pilha para ser o proximo elemento (2o elemento da pilha) */
	    /* Isso equivale a retirar o 1o elemento (topo) da pilha */
	    topo = p.getProx();

	    // Decrementa o tamanho da pilha 
	    nElementos--;

	    /* sugere ao garbage collector que libere a memoria
	     *  da regiao apontada por p*/
	    p= null;

	    return valor;
	}

}


	public static void main(String[] args){
        
        PilhaEnc p = new PilhaEnc();
	Scanner r = new Scanner(System.in);
	String	s = null,y = "";
	int a;     
        
	a = r.nextInt();
        for(int i = 0; i < a; i++){
            s = r.next();
            Stack stk = new Stack();
            char c;
            for(int k = 0; k<s.length();k++){
                c = s.charAt(k);
                switch(c){
		case '(': break;

		case '+': stk.push(c);
			  break;
	
		case '-': stk.push(c);		
			  break;
		
		case '*': stk.push(c);		
			  break;
 
		case '/': stk.push(c);		
			  break;
 	
		case '^': stk.push(c);
			  break;

		case ')': y += stk.pop();
			  break;

		default : y += c;	
			   break;
		}	
			
            }
            
            System.out.println(y);
            y = "";
        }      
    }
}
