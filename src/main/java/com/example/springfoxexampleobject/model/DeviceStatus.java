package com.example.springfoxexampleobject.model;

import springfox.documentation.swagger.annotations.SwaggerExampleObject;

@SwaggerExampleObject(example = DeviceStatus.class)
public class DeviceStatus {
    private String deviceName;
    private DeviceState state;

    public DeviceStatus(String deviceName, DeviceState state) {
        this.deviceName = deviceName;
        this.state = state;
    }

    public DeviceStatus() {
        this.deviceName = "ExampleDevice";
        this.state = DeviceState.Stopped;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceState getState() {
        return state;
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public enum DeviceState {
        Started,
        Stopped
    }
}
