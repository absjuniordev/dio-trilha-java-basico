package model.entities;

import model.exceptions.DomainException;

public class ContaDIO {

    private Integer numero;
    private String agencia;
    private String nome;
    private double saldo;
     
    public ContaDIO(Integer numero, String agencia, String nome, double saldo) throws DomainException{
        if (saldo <0 ) {
            throw new DomainException("O valor não pode ser inferiro a R$ 0,00");
        }       
        
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public Integer getNumero() {
        return numero;
    }
  
    public String getAgencia() {
        return agencia;
    }
    public String getNome() {
        return nome;
    }
 
    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString() {
    return "Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta " +numero+ " e seu saldo R$"+ String.format("%.2f",saldo)+ " já está disponível para saque";
    }
   

    

}
