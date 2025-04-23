package com.alura.conversormoneda.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    private String monedaBase ;
    @SerializedName("target_code")
    private String monedaFinal;
    @SerializedName("conversion_rate")
    private double TasaDeConversion;
    private double totalConversion;
    private double montoConvertir;
    private String fechaHora;

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getMontoConvertir() {
        return montoConvertir;
    }

    public void setMontoConvertir(double montoConvertir) {
        this.montoConvertir = montoConvertir;
    }

    public double getTotalConversion() {
        return totalConversion;
    }

    public void setTotalConversion(double totalConversion) {
        this.totalConversion = totalConversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public double getTasaDeConversion() {
        return TasaDeConversion;
    }

    public void setTasaDeConversion(double tasaDeConversion) {
        TasaDeConversion = tasaDeConversion;
    }

    public void calculaConversion(double tasa, double monto){
        totalConversion = tasa * monto;
    }

    @Override
    public String toString() {
        return "El Valor " + montoConvertir +
                " [ " + monedaBase + " ] corresponde al valor final de " +
                "=>> " + totalConversion + " [ " + monedaFinal + " ].";
    }
}
