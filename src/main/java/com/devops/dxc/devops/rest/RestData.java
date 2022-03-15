package com.devops.dxc.devops.rest;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.devops.dxc.devops.external.Indicadores;
import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.service.DXCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/msdxc")
public class RestData {

    @Autowired
    DXCService dXCService;
    @Autowired
    Indicadores indicadores;

    private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");

    @GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Dxc getData(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro) {

        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado Diez por ciento>");
        Double uf = indicadores.getUF();

        //Dxc response = dxc(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
        Dxc response = dXCService.getValue(Integer.parseInt(ahorro), Integer.parseInt(sueldo), uf);
        return response;
    }

  /*  @GetMapping({"/", "/login"})
    public String index() {
        return "index";
    }*/
}