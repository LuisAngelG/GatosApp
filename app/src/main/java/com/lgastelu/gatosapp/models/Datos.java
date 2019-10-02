package com.lgastelu.gatosapp.models;

public class Datos {
    private Integer monto;
    private String categoria;
    private String tipo;

    public Datos(Integer monto, String categoria, String tipo) {
        this.monto = monto;
        this.categoria = categoria;
        this.tipo = tipo;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "monto=" + monto +
                ", categoria='" + categoria + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

}
