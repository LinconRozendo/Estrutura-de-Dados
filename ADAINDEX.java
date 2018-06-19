/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Lincon
 */
public class Adaindex {
    
    static class Lista {
        
	private No cabeca;
	private int nElementos;
        private int tamanho;

	public Lista(int x){
		cabeca = null;
		nElementos = 0;
                tamanho = x;
	}
	
	/** Verifica se a Lista está vazia */
	public boolean vazia() {
	    if (nElementos == 0)
	        return true;
	    else
	        return false;
	}
        
	public int tamanho() {
	    //return nElementos;
		No aux = cabeca;
		int cont = 0;
		while(aux != null){
			aux = aux.getProx();
			cont++;
		}
		return cont;
	}


	/**Insere um elemento em uma determinada posição
	    Retorna true se conseguir inserir e 
	    false caso contrario */
	public void inserir(String s) {
            No novoNo = new No();
            novoNo.setConteudo(s);
            
            if (vazia()){
	        cabeca = novoNo;
                nElementos++;
	    }else{
                No aux = cabeca;
                while(aux.getProx()!=null){
                    aux = aux.getProx();
                }
                aux.setProx(novoNo);
            }

	    
	}
        
        public int verificar(String s){
            No aux = cabeca;
            int cont = 0;
            
            if(vazia()){
                return -1;
            }
            
            for(int i = 0; i < tamanho(); i++){
                if(aux.getConteudo().startsWith(s)){
                    cont++;
                }
                aux = aux.getProx();
            }
            
            return cont;
        }

    }
    
    static class No {
        
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
    
    public static void main(String[] args) throws Exception{
        
        
        int x = 0, y = 0;
        Lista l;
        String prefixo, quant, teste;
        
        BufferedReader ler = new BufferedReader( new InputStreamReader(System.in));
        
        quant = ler.readLine();
        String[] p = quant.split(" ");// parte a String quant no momento do espaço
        l = new Lista(x = Integer.parseInt(p[0]));//pega a primeira parte, antes de partir, da String quant e inicializa a Lista
        y = Integer.parseInt(p[1]);//pega a segunda parte da String quant
        
        for(int i = 0; i < x; i++){
            teste = ler.readLine();
            l.inserir(teste);
        }
        
        for(int i = 0; i < y; i++){
            prefixo = ler.readLine();
            
            int resultado = l.verificar(prefixo);
            System.out.println(resultado);
        }
        
    }
}







