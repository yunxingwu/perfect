package com.star.perfect.proxy;

import com.star.perfect.proxy.handler.ProxyHandler;
import com.star.perfect.proxy.services.IStation;
import com.star.perfect.proxy.services.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/15.
 */

public class Client {
    public static void main(String[] args) {
        IStation station = new TrainStation();
        InvocationHandler handler = new ProxyHandler(station);
        Type[] cl = station.getClass().getInterfaces();
        System.out.println(cl.length);
        System.out.println(cl[0].getClass().getName());
        IStation iStation = (IStation) Proxy.newProxyInstance(station.getClass().getClassLoader(),station.getClass().getInterfaces(),handler);
        iStation.saleTicket();
    }
}
