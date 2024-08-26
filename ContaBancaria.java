public class ContaBancaria {
    

protected int numero;
protected String titular;
protected double saldo;

public ContaBancaria(int numero, String titular, double saldo){
this.numero = numero;
this.titular = titular;
this.saldo = saldo;
}

public void depositar (double saldoadic){
saldo = (saldo + saldoadic);
}
public void sacar (double saque){
saldo = (saldo - saque);
}
public double verificar_saldo (){
    return saldo;
}
}
