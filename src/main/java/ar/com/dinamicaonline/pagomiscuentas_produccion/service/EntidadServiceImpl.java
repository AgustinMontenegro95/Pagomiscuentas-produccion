package ar.com.dinamicaonline.pagomiscuentas_produccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.dinamicaonline.pagomiscuentas_produccion.repositories.EntidadRepository;

@Service
public class EntidadServiceImpl implements EntidadService {

    @Autowired
    private EntidadRepository entidadRepository;

    @Override
    public Long fetchEntidadByDocumentId(String customerId) {
        return entidadRepository.findByDocumentId(customerId);
    }

    @Override
    public String ingresoDineroProc(Long qIdEntidad, Double qPago, String qOrigen) {
        return entidadRepository.ingresoDinero(qIdEntidad, qPago, qOrigen);
    }

}