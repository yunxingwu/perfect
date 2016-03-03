package com.star.perfect.adapter;

import com.star.perfect.adapter.adaptee.MacProInterface;
import com.star.perfect.adapter.adaptee.impl.MacProImpl;
import com.star.perfect.adapter.target.UsbInterface;
import com.star.perfect.adapter.target.impl.Usb2_0;

/**
 * Created by  伍运星  on   2016/1/15.
 */

public class Client {
    //客户端拥有一个usb的接口
    private UsbInterface usb2_0;
//    Client(UsbInterface usb2_0){
//        this.usb2_0 = usb2_0;
//    }
    public void execute(UsbInterface usbInterface){
        usbInterface.export();
    }

    public static void main(String[] args) {
        //客户端需要为mac电脑充电
        //创建一个客户端
        UsbInterface usbInterface = new Usb2_0();
        Client client = new Client();
        client.execute(usbInterface);
        //拥有一台mac电脑，上面只有mac接口
        MacProInterface mac = new MacProImpl();
        //添加一个电源适配器，可以将mac接口转化为usb接入
        UsbInterface adapter = new MacToUseAdapter(mac);
        client.execute(adapter);

    }
}
