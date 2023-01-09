package ar.com.dinamicaonline.pagomiscuentas_produccion.service;

public interface ParameterService {

    String fetchTokenById(int id);

    String fetchTokenByParameterName(String parameterName);
}
