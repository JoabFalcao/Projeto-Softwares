
/**
 *
 * @author Jose Barros
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Banco da POO");
        ContaCorrente conta = new ContaCorrente(1, "Joao", 200, 300);
        banco.adicionarConta(conta);
        ContaCorrente contaCorrente = new ContaCorrente(2, "André", 100, 50);
        banco.adicionarConta(contaCorrente);
        System.out.println(banco.listarContas());
        banco.deposito(1, 1000);
        System.out.println(banco.getContaPeloCodigo(1));
        
        System.out.println("Saldo: " + banco.getSaldo(1));
        
        banco.saque(2, 50);
        banco.deletarConta(1);
        banco.deletarConta(2);
        System.out.println(banco.listarContas());

    }
}
