package com.metrobg.netmanager;

import com.metrobg.netmanager.persistent.CustomerInfo;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;


public class Main {

    public static void main(String[] args) {
        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-netmanager.xml")
                .build();
        ObjectContext context = cayenneRuntime.newContext();

        CustomerInfo customerInfo = context.newObject(CustomerInfo.class);
        customerInfo.setCustomerName("Rader Foods");
        customerInfo.setCustomerAddress1("16390 NW 52nd Ave");
        customerInfo.setCustomerCity("Miami");
        customerInfo.setCustomerState("FL");
        customerInfo.setCustomerZip("33014");
        customerInfo.setCustomerPhone("3056282217");
        context.commitChanges();
    }
}