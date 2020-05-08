package com.bridgelabz.quantitymeasurementapp.controller;

import com.bridgelabz.quantitymeasurementapp.dto.QuantityMeasurementDTO;
import com.bridgelabz.quantitymeasurementapp.model.QuantityMeasurement;
import com.bridgelabz.quantitymeasurementapp.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quantitycontroller")
public class QuantityMeasurementController {

    @Autowired
    QuantityMeasurementService measurementService;

    @PostMapping("/addConversion")
    public QuantityMeasurement addConversion(@RequestBody QuantityMeasurementDTO measurementDTO) {
        return measurementService.addConversionValue(measurementDTO);
    }

    @GetMapping("/getconcersion/{unitType}/{inputUnit}/{outputUnit}/{inputValue}")
    public double getConversion(@PathVariable String unitType, @PathVariable String inputUnit, @PathVariable String outputUnit, @PathVariable double inputValue) {
        return measurementService.getConversion(unitType, inputUnit, outputUnit, inputValue);
    }

}
