package ar.com.dinamicaonline.pagomiscuentas_produccion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.dinamicaonline.pagomiscuentas_produccion.models.ReceiveAndSend;

@Repository
public interface ReceiveAndSendRepository extends JpaRepository<ReceiveAndSend, Integer> {

}
