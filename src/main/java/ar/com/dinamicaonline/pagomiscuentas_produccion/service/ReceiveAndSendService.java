package ar.com.dinamicaonline.pagomiscuentas_produccion.service;

import org.springframework.http.ResponseEntity;

import ar.com.dinamicaonline.pagomiscuentas_produccion.dto.AvisoDto;

public interface ReceiveAndSendService {
    // Save operation
    ResponseEntity<?> saveReceiveAndSend(AvisoDto avisoDto);
}
