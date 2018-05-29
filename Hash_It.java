package Exercícios;
import java.util.Scanner;

/**
 *
 * @author Lincon
 */
public class Hash_It {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int t = ler.nextInt();
        

        while (t-- > 0) {           
           
            String[] tabela = new String[101];
            int cont = 0, opr = ler.nextInt(); 
                 
            for(int i = 0; i < opr; i++){ 
                
                String op = ler.next(), v = op.substring(4);               
                int funcHash = funcHash(v);                
               
                if (op.charAt(0) == 'A') {                    
            
                    boolean control = false;
                        
                    for (int j = 0; j < tabela.length; j++) {
                        if (tabela[j] != null && tabela[j].equals(v)) {
                            control = true;
                        }
                    }
                                   
                    if (control) {
                        continue;
                    }
                                        
                    int x = 0;
                                      
                    while (x < 20) {
                        
                        int newfuncHash = (int) (funcHash + Math.pow(x, 2) + 23 * x) % 101;
                                   
                        if (tabela[newfuncHash] == null || tabela[newfuncHash].equals(v)) {

                            if (tabela[newfuncHash] == null) {
                                cont++;
                            }
                            
                            tabela[newfuncHash] = v;
                            break;
                        }
                        x++;
                    }

                } 
                
                else {

                    int y = 0;                    

                    while (y < 20) {
                        int newfuncHash = (int) (funcHash + Math.pow(y, 2) + 23 * y) % 101;

                        if (tabela[newfuncHash] != null && tabela[newfuncHash].equals(v)) {

                            cont--;
                            
                            tabela[newfuncHash] = null;
                            break;
                        }
                        y++;
                    }
                }
            }
            
            System.out.println(cont);
            
            for (int i = 0; i < tabela.length; i++) {
                if (tabela[i] != null) {
                    System.out.println(i + ":" + tabela[i]);
                }
            }
        }
    }
    
    static int funcHash(String chave) {
        return h(chave) % 101;
    }

    static int h(String chave) {
        int h = 0;

        
        for (int i = 0; i < chave.length(); i++) {
            h += chave.charAt(i) * (i + 1);
        }

        return 19 * h;
    }


}
