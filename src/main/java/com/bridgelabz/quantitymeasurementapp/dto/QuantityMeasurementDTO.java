package com.bridgelabz.quantitymeasurementapp.dto;

public class QuantityMeasurementDTO {

    String conversion;
    String unitType;
    Double conversionValue;

    public String getConversion() {
        return conversion;
    }

    public String getUnitType() {
        return unitType;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

    public QuantityMeasurementDTO(String conversion, String unitType, Double conversionValue) {
        this.conversion = conversion;
        this.unitType = unitType;
        this.conversionValue = conversionValue;
    }
}
