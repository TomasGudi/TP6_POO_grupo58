package ar.edu.unju.escmi.tp6.dominio;

import java.time.LocalDate;

public class TarjetaCredito {

    private long numero;
    private LocalDate fechaCaducacion;
    private Cliente cliente;
    private double limiteCompra;
    private boolean ahora30Usado;

    public TarjetaCredito() {
    }

    public TarjetaCredito(long numero, LocalDate fechaCaducacion, Cliente cliente, double limiteCompra) {
        super();
        this.numero = numero;
        this.fechaCaducacion = fechaCaducacion;
        this.cliente = cliente;
        this.limiteCompra = limiteCompra;
        this.ahora30Usado = false;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getFechaCaducacion() {
        return fechaCaducacion;
    }

    public void setFechaCaducacion(LocalDate fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public boolean isAhora30Usado() {
        return ahora30Usado;
    }

    public void setAhora30Usado(boolean ahora30Usado) {
        this.ahora30Usado = ahora30Usado;
    }

    @Override
    public String toString() {
        return "\nNumero: " + numero + " Fecha De Caducacion: " + fechaCaducacion + "\nNombre Titular: "
                + cliente.getNombre() + ", Limite De Compra Actual:" + limiteCompra + ", Ahora 30 Usado: " + ahora30Usado;
    }
}