package com.metrobg.netmanager.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _HostServiceTypes was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _HostServiceTypes extends CayenneDataObject {

    private static final long serialVersionUID = 1L;

    public static final String SERVICE_ID_PK_COLUMN = "SERVICE_ID";

    public static final Property<String> SERVICE_NAME = Property.create("serviceName", String.class);

    public void setServiceName(String serviceName) {
        writeProperty("serviceName", serviceName);
    }

    public String getServiceName() {
        return (String) readProperty("serviceName");
    }

}
