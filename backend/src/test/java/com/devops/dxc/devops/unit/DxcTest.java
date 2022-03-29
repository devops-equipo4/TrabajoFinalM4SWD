package com.devops.dxc.devops.unit;

import com.devops.dxc.devops.model.Dxc;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j
class DxcTest {

    Dxc dxc = new Dxc();

    @Test
    void validacionRetiro() {
        int ahorro = 10000000;
        double uf = 31727.74;
        int retiro = dxc.getRetiro(ahorro, uf);
        assertEquals(1000000, retiro);
    }

    @Test
    void validacionImpuesto() {
        int ahorro = 10000000;
        int sueldo = 2500000;
        double uf = 31727.74;
        int impuesto = dxc.getImpuesto(ahorro, sueldo, uf);
        assertEquals(135000, impuesto);
    }

    @Test
    void validacionSaldo(){
        int ahorro = 10000000;
        double uf = 31727.74;
        int saldo = dxc.calculoSaldo(ahorro, uf);
        assertEquals(9000000, saldo);
    }
}