package com.example.springfoxexampleobject.model;

import springfox.documentation.swagger.annotations.SwaggerExampleObject;

import static com.example.springfoxexampleobject.model.CommandMessage.Command.DeviceStatus;

@SwaggerExampleObject(example = GetDeviceStatusReq.class)
public class GetDeviceStatusReq extends CommandMessage {

    public GetDeviceStatusReq(String deviceName) {
        super(deviceName, DeviceStatus);
    }

    public GetDeviceStatusReq() {
        this("ExampleDevice");
    }
}
