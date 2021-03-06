package com.metrobg.netmanager.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.metrobg.netmanager.persistent.NetworkDevice;

/**
 * Class _DeviceType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeviceType extends CayenneDataObject {

    private static final long serialVersionUID = 1L;

    public static final String DEVICE_TYPE_ID_PK_COLUMN = "DEVICE_TYPE_ID";

    public static final Property<String> DEVICE_TYPE_NAME = Property.create("deviceTypeName", String.class);
    public static final Property<List<NetworkDevice>> NETWORK_DEVICES = Property.create("networkDevices", List.class);

    public void setDeviceTypeName(String deviceTypeName) {
        writeProperty("deviceTypeName", deviceTypeName);
    }

    public String getDeviceTypeName() {
        return (String) readProperty("deviceTypeName");
    }

    public void addToNetworkDevices(NetworkDevice obj) {
        addToManyTarget("networkDevices", obj, true);
    }

    public void removeFromNetworkDevices(NetworkDevice obj) {
        removeToManyTarget("networkDevices", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<NetworkDevice> getNetworkDevices() {
        return (List<NetworkDevice>) readProperty("networkDevices");
    }


}
