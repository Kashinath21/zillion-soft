package com.zillionsoft.device.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.zillionsoft.device.entity.ConnectedDevices;
import com.zillionsoft.device.repository.DeviceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
@Service
public class DeviceDataService {

    @Autowired
    private DeviceDataRepository deviceDataRepository;
    @Transactional 
    public void createOrUpdateDeviceDetails(JsonNode deviceInfo) {

        ConnectedDevices connectedDevices = new ConnectedDevices();
        connectedDevices.setDeviceId(deviceInfo.get("DeviceID").asLong());
        connectedDevices.setTimestamp(Instant.parse(deviceInfo.get("Timestamp").asText()+".00Z"));
        connectedDevices.setPayload(deviceInfo.toString());
        connectedDevices.setPayload_raw(deviceInfo.toString());
        deviceDataRepository.save(connectedDevices);
    }
}