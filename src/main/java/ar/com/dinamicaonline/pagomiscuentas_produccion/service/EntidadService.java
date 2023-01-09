package ar.com.dinamicaonline.pagomiscuentas_produccion.service;

public interface EntidadService {

    // Read operation
    Long fetchEntidadByDocumentId(String customerId);

    String ingresoDineroProc(Long qIdEntidad, Double qPago, String qOrigen);
}
