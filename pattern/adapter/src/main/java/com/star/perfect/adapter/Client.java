package com.star.perfect.adapter;

import com.star.perfect.adapter.adaptee.MacProInterface;
import com.star.perfect.adapter.adaptee.impl.MacProImpl;
import com.star.perfect.adapter.target.UsbInterface;
import com.star.perfect.adapter.target.impl.Usb2_0;

/**
 * Created by  ������  on   2016/1/15.
 */

public class Client {
    //�ͻ���ӵ��һ��usb�Ľӿ�
    private UsbInterface usb2_0;
//    Client(UsbInterface usb2_0){
//        this.usb2_0 = usb2_0;
//    }
    public void execute(UsbInterface usbInterface){
        usbInterface.export();
    }

    public static void main(String[] args) {
        //�ͻ�����ҪΪmac���Գ��
        //����һ���ͻ���
        UsbInterface usbInterface = new Usb2_0();
        Client client = new Client();
        client.execute(usbInterface);
        //ӵ��һ̨mac���ԣ�����ֻ��mac�ӿ�
        MacProInterface mac = new MacProImpl();
        //���һ����Դ�����������Խ�mac�ӿ�ת��Ϊusb����
        UsbInterface adapter = new MacToUseAdapter(mac);
        client.execute(adapter);

    }
}
