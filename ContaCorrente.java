public class ContaCorrente extends ContaBancaria {

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + 1.00;

        if (getSaldo() >= valorComTaxa) {
            setSaldo(getSaldo() - valorComTaxa);
            return true;
        }

        return false;
    }
}