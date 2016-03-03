package com.star.perfect.adapter;

import com.star.perfect.adapter.adaptee.MacProInterface;
import com.star.perfect.adapter.target.UsbInterface;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/15.
 */

public class MacToUseAdapter implements UsbInterface{
    private MacProInterface macProInterface;
    MacToUseAdapter(MacProInterface macProInterface){
        this.macProInterface = macProInterface;
    }

    public void export() {
        macProInterface.info();
    }
}
