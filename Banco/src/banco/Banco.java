package banco;

public class Banco {

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
        
        Transacao tx1 = new Transacao();
        tx1.tipo = 1; // DEBITO
        tx1.valor = corre1.conta1.saldo;
        corre1.conta1.aplicarTransacao(tx1);
        tx1.tipo = 2;
        corre2.conta2.aplicarTransacao(tx1);

        Transacao tx2 = new Transacao();
        tx2.tipo = 1; // DEBITO
        tx2.valor = corre2.conta1.saldo;
        corre2.conta1.aplicarTransacao(tx2);
        tx2.tipo = 2;
        corre1.conta2.aplicarTransacao(tx2);

        System.out.println("");       
        System.out.println("Saldo 1 da Maria:" + corre1.conta1.saldo);
        System.out.println("Saldo 2 da Maria:" + corre1.conta2.saldo);
        System.out.println("Saldo total da Maria:" + corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo 1 da Rosa:" + corre2.conta1.saldo);
        System.out.println("Saldo 2 da Rosa:" + corre2.conta2.saldo);
        System.out.println("Saldo total da Rosa:" + corre2.saldoTotal());
        
        Investimento inv1 = new Investimento();
        inv1.rentabilidade = 0.01f;
        
        float retorno = inv1.aplicar(1000f, 2);
        
        System.out.println("Rendeu: " + retorno);
        
        
    }
    
}
