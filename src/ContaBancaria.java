import javax.swing.JOptionPane;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(){
        saldo = 0;
        titular = null;
    }

    public ContaBancaria(String nome, double valor){
        saldo = valor;
        titular = nome;
    }

    public boolean depositar(double valor){
    	if(valor < 0) return false;
    	else {
            saldo += valor;
            return true;
        }
    }
    public boolean sacar(double valor){
        if(valor >= saldo) return false;);
        else {
            saldo -= valor;
    	    return true;
    	}
    }

    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String nome) {
        titular = nome;
    }

}
