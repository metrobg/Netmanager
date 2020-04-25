package com.metrobg.netmanager.persistent;

import com.metrobg.netmanager.persistent.auto._Netmanager_datamap;

public class Netmanager_datamap extends _Netmanager_datamap {

    private static Netmanager_datamap instance;

    private Netmanager_datamap() {
    }

    public static Netmanager_datamap getInstance() {
        if (instance == null) {
            instance = new Netmanager_datamap();
        }

        return instance;
    }
}
