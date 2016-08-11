package com.star.perfect.netty;

import java.io.Serializable;

/**
 * Created by  wuyunxing on   2016/7/14.
 */

public class RpcRequest implements Serializable {
    private static final long serialVersionUID = -5148079121106659095L;

    private String mClassName;

    private String mMethodDesc;

    private Class<?>[] mParameterTypes;

    private Object[] mArguments;

    public RpcRequest(String cn, String desc, Class<?>[] parameterTypes,Object[] args)
    {
        mClassName = cn;
        mMethodDesc = desc;
        mParameterTypes = parameterTypes;
        mArguments = args;
    }

    public String getClassName()
    {
        return mClassName;
    }

    public String getMethodDesc()
    {
        return mMethodDesc;
    }

    public Class<?>[] getParameterTypes() {
        return mParameterTypes;
    }

    public Object[] getArguments()
    {
        return mArguments;
    }
}
