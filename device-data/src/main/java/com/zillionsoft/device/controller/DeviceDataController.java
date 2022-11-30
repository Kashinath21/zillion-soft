package com.zillionsoft.device.controller;
import com.fasterxml.jackson.databind.JsonNode;
import com.zillionsoft.device.service.DeviceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DeviceDataController {

    @Autowired
    private DeviceDataService deviceDataService;

    @PostMapping("/device")
    public void createOrUpdateDeviceDetails(@RequestBody JsonNode deviceInfo){

          deviceDataService.createOrUpdateDeviceDetails(deviceInfo);

    }
    @GetMapping
    public String sayHello(){
        return "Hello world !";
    }
}