package com.example.springfoxexampleobject.model;

import springfox.documentation.swagger.annotations.SwaggerExampleObject;

import static com.example.springfoxexampleobject.model.CommandMessage.Command.StartDevice;

@SwaggerExampleObject(example = StartDeviceReq.class)
public class StartDeviceReq extends CommandMessage {

    public StartDeviceReq(String deviceName) {
        super(deviceName, StartDevice);
    }

    public StartDeviceReq() {
        this("SecondExampleDevice");
    }
}
