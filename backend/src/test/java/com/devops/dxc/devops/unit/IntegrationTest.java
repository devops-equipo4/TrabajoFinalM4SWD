package com.devops.dxc.devops.unit;

import com.devops.dxc.devops.external.Indicadores;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationTest {
    @Autowired
    Indicadores indicadores;

    @Test
    void getUfTest() {
        Double uf = indicadores.getUF();
        Assertions.assertTrue(uf > 0.0);
    }

}