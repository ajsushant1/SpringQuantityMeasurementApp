package com.bridgelabz.quantitymeasurementapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuantityMeasurement {

    @Id
    String conversion;
    String unitType;
    Double conversionValue;

    public QuantityMeasurement(String conversion, String unitType, Double conversionValue) {
        this.conversion = conversion;
        this.unitType = unitType;
        this.conversionValue = conversionValue;
    }

    protected QuantityMeasurement() {
    }

    public String getConversion() {
        return conversion;
    }

    public String getUnitType() {
        return unitType;
    }

    public Double getConversionValue() {
        return conversionValue;
    }
}
