package com.microservice.payment.repo;


import com.microservice.payment.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    Optional<Payment> findByTransId(String transId);

    List<Payment> findAllByPatientId(Long patientId);




}
