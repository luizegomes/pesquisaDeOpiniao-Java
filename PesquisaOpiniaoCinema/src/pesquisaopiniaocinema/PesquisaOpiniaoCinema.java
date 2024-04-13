
package pesquisaopiniaocinema;

import java.util.Scanner;

/**
 *
 * @author LUIZE
 */
public class PesquisaOpiniaoCinema {

    
    public static void main(String[] args) {
        int cont=0, otimo=0, ruim=0, pessimo=0;
        int idade=0, idadeRuim=0, mediaIdRuim=0, porcentagem=0;
        char opiniao, a, d, e;
        
        Scanner leitor = new Scanner(System.in);
        
        while (cont < 4) {
        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.print("Digite a letra referente a sua opinião sobre o filme\na-Ótimo, b-Bom, c-Regular, d-Ruim, e-Péssimo: ");
        opiniao = leitor.next().charAt(0);
        
           switch (opiniao) {
               case 'a':
                   otimo++;
                   break;
               case 'd':
                   ruim++;
                   idadeRuim += idade;
                   mediaIdRuim = idadeRuim/ruim;
                   break;
               case 'e':
                   pessimo++;
                   porcentagem=(pessimo*100)/4;
               default:
                   break;
            } cont++;
        }
        System.out.println("A quantidade de opiniões 'ÓTIMO' foram: "+otimo);
        System.out.println("A média de idade das pessoas que opinaram 'RUIM' é de: "+mediaIdRuim +" anos");
        System.out.println("O percentual de opiniões 'PÉSSIMO' é de: " +porcentagem+"%");
    }
    
}
