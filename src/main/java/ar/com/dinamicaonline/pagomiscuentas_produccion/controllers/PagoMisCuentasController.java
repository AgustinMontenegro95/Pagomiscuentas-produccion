package ar.com.dinamicaonline.pagomiscuentas_produccion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dinamicaonline.pagomiscuentas_produccion.dto.AvisoDto;
import ar.com.dinamicaonline.pagomiscuentas_produccion.service.ReceiveAndSendService;

@RestController
@RequestMapping("/api/v1")
public class PagoMisCuentasController {

    @Autowired
    private ReceiveAndSendService receiveAndSendService;

    @RequestMapping(value = "/payment_notify", method = RequestMethod.POST)
    public ResponseEntity<?> obtenerNotificacion(@RequestBody AvisoDto avisoDto) {
        return receiveAndSendService.saveReceiveAndSend(avisoDto);
    }

}
