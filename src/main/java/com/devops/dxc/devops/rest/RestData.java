package com.devops.dxc.devops.rest;

import com.devops.dxc.devops.configuration.WebDriverChromedriver;
import com.devops.dxc.devops.external.Indicadores;
import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.service.DXCService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j
@CrossOrigin()
@RestController
@RequestMapping(path = "/rest/msdxc")
public class RestData {

    Double valorUF;

   //@Autowired
    //WebDriverChromedriver webDriverChromedriver;

    @Autowired
    DXCService dXCService;
    @Autowired
    Indicadores indicadores;

    @GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Dxc getData(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro) {
        //log.info("Ruta del driver: " + webDriverChromedriver.getRuta());
        valorUF = valorUF == null ? indicadores.getUF() : valorUF;
        return dXCService.getValue(Integer.parseInt(ahorro), Integer.parseInt(sueldo), valorUF);
    }
}