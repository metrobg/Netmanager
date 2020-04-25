package com.metrobg.netmanager.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.metrobg.netmanager.persistent.CustomerInfo;
import com.metrobg.netmanager.persistent.DeviceType;
import com.metrobg.netmanager.persistent.OsType;

/**
 * Class _NetworkDevice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkDevice extends CayenneDataObject {

    private static final long serialVersionUID = 1L;

    public static final String HOST_ID_PK_COLUMN = "HOST_ID";

    public static final Property<String> DEVICE_CREDENTIALS = Property.create("deviceCredentials", String.class);
    public static final Property<String> DEVICE_PASSWORD = Property.create("devicePassword", String.class);
    public static final Property<Integer> HOST_ID = Property.create("hostId", Integer.class);
    public static final Property<String> HOST_NAME = Property.create("hostName", String.class);
    public static final Property<String> HOST_NOTES = Property.create("hostNotes", String.class);
    public static final Property<CustomerInfo> CUSTOMER = Property.create("customer", CustomerInfo.class);
    public static final Property<DeviceType> DEVICE_TYPE = Property.create("deviceType", DeviceType.class);
    public static final Property<OsType> OS = Property.create("os", OsType.class);

    public void setDeviceCredentials(String deviceCredentials) {
        writeProperty("deviceCredentials", deviceCredentials);
    }

    public String getDeviceCredentials() {
        return (String) readProperty("deviceCredentials");
    }

    public void setDevicePassword(String devicePassword) {
        writeProperty("devicePassword", devicePassword);
    }

    public String getDevicePassword() {
        return (String) readProperty("devicePassword");
    }

    public void setHostId(int hostId) {
        writeProperty("hostId", hostId);
    }

    public int getHostId() {
        Object value = readProperty("hostId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setHostName(String hostName) {
        writeProperty("hostName", hostName);
    }

    public String getHostName() {
        return (String) readProperty("hostName");
    }

    public void setHostNotes(String hostNotes) {
        writeProperty("hostNotes", hostNotes);
    }

    public String getHostNotes() {
        return (String) readProperty("hostNotes");
    }

    public void setCustomer(CustomerInfo customer) {
        setToOneTarget("customer", customer, true);
    }

    public CustomerInfo getCustomer() {
        return (CustomerInfo) readProperty("customer");
    }


    public void setDeviceType(DeviceType deviceType) {
        setToOneTarget("deviceType", deviceType, true);
    }

    public DeviceType getDeviceType() {
        return (DeviceType) readProperty("deviceType");
    }


    public void setOs(OsType os) {
        setToOneTarget("os", os, true);
    }

    public OsType getOs() {
        return (OsType) readProperty("os");
    }


}
