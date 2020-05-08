package com.bridgelabz.quantitymeasurementapp.service;

import com.bridgelabz.quantitymeasurementapp.dto.QuantityMeasurementDTO;
import com.bridgelabz.quantitymeasurementapp.model.QuantityMeasurement;

public interface QuantityMeasurementService {
    QuantityMeasurement addConversionValue(QuantityMeasurementDTO measurement);

    double getConversion(String unitType, String inputUnit, String outputUnit, double inputValue);
}
