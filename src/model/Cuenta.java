package model;

public class Cuenta {
    
    private String nomBanco;
    private TipoCuenta tipo;
    private double saldo;
    private double deposito;
    private double retiro;
    
    public Cuenta(String nomBanco, TipoCuenta tipo, double saldo) {

        this.nomBanco = nomBanco;
        this.tipo = tipo;
        this.saldo = saldo;
        

    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDineroCuenta(double saldo, double deposito) {

        if ( deposito > 0 ){

            saldo = saldo + deposito;
        }

    }

    public void retirarDineroCuenta(double saldo, double retiro){

        if (retiro > 0 && saldo > 0 ){

            saldo = saldo - retiro;
        
        }else {
            System.out.println("No puedes realizar el retiro");
            
        }

    }
}
