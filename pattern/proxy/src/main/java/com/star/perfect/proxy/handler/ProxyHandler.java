package com.star.perfect.proxy.handler;

import com.star.perfect.proxy.services.IStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by  ŒÈ‘À–«  on   2016/1/15.
 */

public class ProxyHandler implements InvocationHandler {
    private IStation station;
    public ProxyHandler(IStation station){
        this.station = station;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy begin");
        method.invoke(station,args);
        System.out.println("proxy end");
        return null;
    }
}
