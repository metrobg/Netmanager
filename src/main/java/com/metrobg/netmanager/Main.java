package com.metrobg.netmanager;

import com.metrobg.netmanager.persistent.CustomerInfo;
import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.EJBQLQuery;
import org.apache.cayenne.query.ObjectSelect;

import java.util.List;
/*         https://cayenne.apache.org/docs/4.0/cayenne-guide/    */

public class Main {

    public static void main(String[] args) {
        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-netmanager.xml")
                .build();
        ObjectContext context = cayenneRuntime.newContext();
        /*  select query
        List<CustomerInfo> cust = ObjectSelect.query(CustomerInfo.class)
                .where(CustomerInfo.CUSTOMER_NAME.likeIgnoreCase("Rader%"))
                .select(context);
        System.out.println("Customer address is :" + cust.get(0));
        */
        /*  select by primary key  */
        CustomerInfo customerInfo = Cayenne.objectForPK(context, CustomerInfo.class, 109);
        System.out.println("Customer Name: " + customerInfo.getCustomerName());
 /*
        EJBQLQuery select =
                new EJBQLQuery("select a FROM Artist a WHERE a.name =EJBQLQuery select =
        new EJBQLQuery("select a FROM Artist a WHERE a.name = 'Salvador Dali'");
        List<Artist> artists = context.performQuery(select);
        EJBQLQuery delete = new EJBQLQuery("delete from Painting");
        context.performGenericQuery(delete);
        EJBQLQuery update =
                new EJBQLQuery("UPDATE Painting AS p SET p.name = 'P2' WHERE p.name = 'P1'");
        context.performGenericQuery(update);
        'Salvador Dali' ");
        List<Artist> artists = context.performQuery(select);
         */
       /*    record insert
       CustomerInfo customerInfo = context.newObject(CustomerInfo.class);
        customerInfo.setCustomerName("Rader Foods");
        customerInfo.setCustomerAddress1("16390 NW 52nd Ave");
        customerInfo.setCustomerCity("Miami");
        customerInfo.setCustomerState("FL");
        customerInfo.setCustomerZip("33014");
        customerInfo.setCustomerPhone("3056282217");
        context.commitChanges();
        */
    }
}