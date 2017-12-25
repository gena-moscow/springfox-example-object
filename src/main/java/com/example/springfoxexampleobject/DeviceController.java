package com.example.springfoxexampleobject;

import com.example.springfoxexampleobject.model.DeviceStatus;
import com.example.springfoxexampleobject.model.GetDeviceStatusReq;
import com.example.springfoxexampleobject.model.StartDeviceReq;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeviceController {
    @RequestMapping(value="/device/status", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public DeviceStatus getDeviceStatus(@RequestBody GetDeviceStatusReq req) {
        return new DeviceStatus(req.getDeviceName(), DeviceStatus.DeviceState.Stopped);
    }
    @RequestMapping(value="/device/start", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public DeviceStatus startDevice(@RequestBody StartDeviceReq req) {
        return new DeviceStatus(req.getDeviceName(), DeviceStatus.DeviceState.Started);
    }
}
