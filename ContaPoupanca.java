public class ContaPoupanca extends ContaBancaria {

    public void renderJuros() {
        double juros = getSaldo() * 0.01;
        setSaldo(getSaldo() + juros);
    }
}