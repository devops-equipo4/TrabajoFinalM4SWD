package com.devops.dxc.devops.service;

import com.devops.dxc.devops.model.Dxc;
import org.springframework.stereotype.Service;

@Service
public class DXCService {

    public Dxc getValue(int ahorro, int sueldo, double uf) {
        return new Dxc(ahorro, sueldo, uf);
    }

}
