package com.czj.terminal.pojo.req;

import java.util.List;

/**
 * @ClassName VehicleLocationSocket
 * @Author lee
 * @Time 2018/11/20 16:39.
 */
public class VehicleLocationSocket {

    private List<String> vehicleIdList;

    public List<String> getVehicleIdList() {
        return vehicleIdList;
    }

    public void setVehicleIdList(List<String> vehicleIdList) {
        this.vehicleIdList = vehicleIdList;
    }
}
