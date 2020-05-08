package com.bridgelabz.quantitymeasurementapp.repository;

import com.bridgelabz.quantitymeasurementapp.model.QuantityMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityMeasurementRepository extends JpaRepository<QuantityMeasurement,String> {
}
