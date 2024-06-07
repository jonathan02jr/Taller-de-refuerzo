package Proyect_Datos_Quemados;

import java.security.PublicKey;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    public void depositar(double monto) {
        System.out.println();
    }

    public void retirar() {
        System.out.println();
    }

    public void mostrar_info() {
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
    }

    public void info_compartir() {
        mostrar_info();
    }
}

class CuentaCorriente extends CuentaBancaria {
    public double limiteDescubierto;

    public CuentaCorriente(int numeroCuenta, double limiteDescubierto) {
        super(numeroCuenta);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void info_compartir() {
        super.info_compartir();
    }

    @Override
    public void retirar() {
        System.out.println("El limite de descubierto es de "+limiteDescubierto);
    }


}

class CuentaAhorros extends CuentaBancaria {
    public double tasaInteres;

    public CuentaAhorros(int numeroCuenta, double tasaInteres) {
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void info_compartir() {
        super.info_compartir();
    }

    /*public double calcularInteres(double monto) {
        double interes=17.80;
        double capitalInicial=;
        double interes=17.80;
        double interes=17.80;

        return monto;
    }*/
}

