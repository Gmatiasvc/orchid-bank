package objects;

import java.util.GregorianCalendar;

public class Cuenta{
    private String number;
    private GregorianCalendar creationDate;
    private String currency;
    private double balance;
    private float interestRate;
    private int tipoCuenta;
    private static int totalCtaAhorro = 0;
    private static int totalCtaCorriente = 0;

    public Cuenta(String number, GregorianCalendar creationDate, String currency, double balance, float interestRate,int tipoCuenta) {
        this.number = number;
        this.creationDate = creationDate;
        this.currency = currency;
        this.balance = balance;
        this.interestRate = interestRate;
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta(String clave, int tipoCuenta) { 
        this.tipoCuenta = tipoCuenta;
        creationDate = new GregorianCalendar();
        if(tipoCuenta == 1)
            ++totalCtaAhorro;
        else
            ++totalCtaCorriente;
        number = generarNumber();
    }

    private String generarNumber() {
        int numDig=0, num=0, dato=0;
        String numCuenta = "";
        switch(tipoCuenta) {
            case 1 -> {
                num = dato = totalCtaAhorro;
                numCuenta = "A";
            }
            case 2 -> {
                num = dato = totalCtaCorriente;
                numCuenta = "C";
            }
        }
        while (num > 9) {
            numDig++;
            num /= 10;
        }
        numDig++;
        for(int i=0;i<10-numDig; i++)
            numCuenta += "0";
        numCuenta += dato;        
        return numCuenta;
    }   
  
    public String getNumeroCuenta() {
        return number;
    }

    public int getTipoCuenta(){
        return tipoCuenta;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public GregorianCalendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(GregorianCalendar creationDate) {
        this.creationDate = creationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

}