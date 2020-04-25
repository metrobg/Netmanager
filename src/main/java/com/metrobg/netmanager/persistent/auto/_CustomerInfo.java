package com.metrobg.netmanager.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.metrobg.netmanager.persistent.NetworkDevice;

/**
 * Class _CustomerInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CustomerInfo extends CayenneDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CUSTOMER_ID_PK_COLUMN = "CUSTOMER_ID";

    public static final Property<String> CUSTOMER_ADDRESS1 = Property.create("customerAddress1", String.class);
    public static final Property<String> CUSTOMER_ADDRESS2 = Property.create("customerAddress2", String.class);
    public static final Property<String> CUSTOMER_CITY = Property.create("customerCity", String.class);
    public static final Property<String> CUSTOMER_NAME = Property.create("customerName", String.class);
    public static final Property<String> CUSTOMER_PHONE = Property.create("customerPhone", String.class);
    public static final Property<String> CUSTOMER_STATE = Property.create("customerState", String.class);
    public static final Property<String> CUSTOMER_ZIP = Property.create("customerZip", String.class);
    public static final Property<List<NetworkDevice>> NETWORK_DEVICES = Property.create("networkDevices", List.class);

    public void setCustomerAddress1(String customerAddress1) {
        writeProperty("customerAddress1", customerAddress1);
    }

    public String getCustomerAddress1() {
        return (String) readProperty("customerAddress1");
    }

    public void setCustomerAddress2(String customerAddress2) {
        writeProperty("customerAddress2", customerAddress2);
    }

    public String getCustomerAddress2() {
        return (String) readProperty("customerAddress2");
    }

    public void setCustomerCity(String customerCity) {
        writeProperty("customerCity", customerCity);
    }

    public String getCustomerCity() {
        return (String) readProperty("customerCity");
    }

    public void setCustomerName(String customerName) {
        writeProperty("customerName", customerName);
    }

    public String getCustomerName() {
        return (String) readProperty("customerName");
    }

    public void setCustomerPhone(String customerPhone) {
        writeProperty("customerPhone", customerPhone);
    }

    public String getCustomerPhone() {
        return (String) readProperty("customerPhone");
    }

    public void setCustomerState(String customerState) {
        writeProperty("customerState", customerState);
    }

    public String getCustomerState() {
        return (String) readProperty("customerState");
    }

    public void setCustomerZip(String customerZip) {
        writeProperty("customerZip", customerZip);
    }

    public String getCustomerZip() {
        return (String) readProperty("customerZip");
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
