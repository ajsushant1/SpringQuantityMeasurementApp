package com.bridgelabz.quantitymeasurementapp.service;

import com.bridgelabz.quantitymeasurementapp.dto.QuantityMeasurementDTO;
import com.bridgelabz.quantitymeasurementapp.model.QuantityMeasurement;
import com.bridgelabz.quantitymeasurementapp.repository.QuantityMeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementImpl implements QuantityMeasurementService {

    @Autowired
    QuantityMeasurementRepository measurementRepository;

    //METHOD ADD CONVERSION VALUE
    @Override
    public QuantityMeasurement addConversionValue(QuantityMeasurementDTO measurement) {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(measurement.getConversion(), measurement.getUnitType(), measurement.getConversionValue());
        return measurementRepository.save(quantityMeasurement);
    }

    //METHOD TO GET CONVERSION VALUE
    @Override
    public double getConversion(String unitType, String inputUnit, String outputUnit, double inputValue) {
        if (inputUnit.equals("Celsius"))
            return (inputValue * 9 / 5) + 32;
        if (inputUnit.equals("Fahrenheit"))
            return (inputValue - 32) * 5 / 9;
        double inputUnitValue = measurementRepository.findById(inputUnit).get().getConversionValue();
        double outputUnitValue = measurementRepository.findById(outputUnit).get().getConversionValue();
        return (inputUnitValue / outputUnitValue) * inputValue;
    }
}
