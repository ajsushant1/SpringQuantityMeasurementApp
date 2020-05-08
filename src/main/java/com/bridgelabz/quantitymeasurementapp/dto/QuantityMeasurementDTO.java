package com.bridgelabz.quantitymeasurementapp.dto;

public class QuantityMeasurementDTO {

    String conversion;
    String unitType;
    long conversionValue;

    public String getConversion() {
        return conversion;
    }

    public String getUnitType() {
        return unitType;
    }

    public long getConversionValue() {
        return conversionValue;
    }

    public QuantityMeasurementDTO(String conversion, String unitType, long conversionValue) {
        this.conversion = conversion;
        this.unitType = unitType;
        this.conversionValue = conversionValue;
    }
}
