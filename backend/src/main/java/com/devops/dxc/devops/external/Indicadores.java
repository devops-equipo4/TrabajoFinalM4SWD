package com.devops.dxc.devops.external;

import com.devops.dxc.devops.configuration.EndpointIndicadores;
import com.devops.dxc.devops.configuration.RestTemplateBean;
import com.devops.dxc.devops.external.dto.IndicadoresDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Component
@Log4j
public class Indicadores {


    @Autowired
    EndpointIndicadores endpointIndicadores;

    @Autowired
    RestTemplateBean restTemplate;

    public Double getUF() {
        log.info("Llamado a endpoint para conseguir UF");
        try {

            ResponseEntity<IndicadoresDTO[]> response = restTemplate
                    .customRestTemplate()
                    .getForEntity(endpointIndicadores.getUf().getUrl(), IndicadoresDTO[].class);
            Optional<IndicadoresDTO> dto = List.of(response.getBody()).stream()
                    .filter(i -> i.getCodigo().equals("UF"))
                    .findFirst();
            if (dto.isEmpty()) {
                log.warn("Endpoint no trae informacion necesaria, se configura un valor por defecto");
                return 31718.54;
            }
            return Double.valueOf(dto.get().getValor().replace(",", "."));
        } catch (Exception e) {
            log.error("Enpoint de UF Caido, se confioura valor por defecto");
            return 31718.54;
        }

    }


}
