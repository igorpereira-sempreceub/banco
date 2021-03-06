/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Rafael.Soares
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaCorrentista fabrica = new FabricaCorrentista();
        
        Correntista corre1 = fabrica.novo("Maria", 1, 1000, 2000);
        Correntista corre2 = fabrica.novo("Rosa", 1, 500, 1300);
        
        System.out.println("Saldo 1 da Maria:" + corre1.conta1.saldo);
        System.out.println("Saldo 2 da Maria:" + corre1.conta2.saldo);
        System.out.println("Saldo total da Maria:" + corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo 1 da Rosa:" + corre2.conta1.saldo);
        System.out.println("Saldo 2 da Rosa:" + corre2.conta2.saldo);
        System.out.println("Saldo total da Rosa:" + corre2.saldoTotal());
        
        //Tirando dinheiro da conta 1 da maria
        Transacao tx1 = new Transacao();
        tx1.tipo = 1; // DEBITO
        tx1.valor = 1000;
        corre1.conta1.aplicarTransacao(tx1);
        
        //Colocando dinheiro na conta 2 da Rosa
        Transacao tx2 = new Transacao();
        tx2.tipo = 0; // CREDITO
        tx2.valor = 1000;
        corre2.conta2.aplicarTransacao(tx2);
        
        
       
        System.out.println("Saldo 2 da Maria:" + corre1.conta2.saldo);
        
    }
    
}
