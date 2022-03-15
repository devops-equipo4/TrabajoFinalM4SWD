package com.devops.dxc.devops.model;

import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;

@Log4j
public class Dxc implements Serializable {

    private static final long serialVersionUID = -2988002029080131424L;

    private int dxc;
    private int saldo;
    private int impuesto;
    private int sueldo;
    private int ahorro;
    private double uf;


    public Dxc(int ahorro, int sueldo, double uf) {
        this.ahorro = ahorro;
        this.sueldo = sueldo;
        this.uf = uf;
    }

    public Dxc() {
    }

    public int getDxc() {
        return getRetiro(ahorro, uf);
    }

    public void setDxc(int dxc) {
        this.dxc = dxc;
    }

    public int getSaldo() {
        return getSaldoAhorro(ahorro);
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getImpuesto() {
        return getImpuesto(ahorro, sueldo, uf);
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAhorro() {
        return ahorro;
    }

    public void setAhorro(int ahorro) {
        this.ahorro = ahorro;
    }

    public double getUf() {
        return uf;
    }

    public void setUf(double uf) {
        this.uf = uf;
    }

    public int getImpuesto(int ahorro, int sueldo, double uf) {
        int sueldoAnual = sueldo * 12;
        if (17864280 < sueldoAnual && sueldoAnual < 29773800)
            return (int) (getRetiro(ahorro, uf) * 0.08);
        if (29700000 < sueldoAnual && sueldoAnual < 41600000)
            return (int) (getRetiro(ahorro, uf) * 0.135);
        if (41600000 < sueldoAnual && sueldoAnual < 53500000)
            return (int) (getRetiro(ahorro, uf) * 0.23);
        if (53500000 < sueldoAnual && sueldoAnual < 71400000)
            return (int) (getRetiro(ahorro, uf) * 0.304);
        if (71400000 < sueldoAnual)
            return (int) (getRetiro(ahorro, uf) * 0.35);
        return 0;
    }

    public int getRetiro(int ahorro, double uf) {
        if (((ahorro * 0.1) / uf) > 150) {
            return (int) (150 * uf);
        } else if ((ahorro * 0.1) <= 1000000 && ahorro >= 1000000) {
            return (int) 1000000;
        } else if (ahorro <= 1000000) {
            return (int) ahorro;
        } else {
            return (int) (ahorro * 0.1);
        }
    }

    public int getSaldoAhorro(int ahorro) {
        double noventaxciento = ahorro * 0.9;
        return (int) noventaxciento;
    }



}
