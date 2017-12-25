package com.example.springfoxexampleobject.model;

public class CommandMessage {
    private String deviceName;
    private Command command;

    public CommandMessage(String deviceName, Command command) {
        this.deviceName = deviceName;
        this.command = command;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public enum Command {
        DeviceStatus,
        StartDevice,
        StopDevice
    }
}
