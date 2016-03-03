package com.star.perfect.fsm.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *   ģ������������
 * Created by  ������  on   2016/1/18.
 */

public class FsRequest implements IFsRequest {
    private static final long serialVersionUID = 1L;
    /** �ӿ�ģ������ */
    private String serviceName;
    /** ��ƽ̨/������ */
    private String channelId;
    /** �ϴ�bytes */
    private byte[] bytes;
    /** �������� */
    private Map<String, String> params = new HashMap<String, String>();

    public FsRequest(){
        super();
    }
    public FsRequest(String serviceName){
        super();
        this.serviceName = serviceName;
    }
    public FsRequest(String serviceName,String channelId){
        this.serviceName = serviceName;
        this.channelId = channelId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public byte[] getBytes() {
        return new byte[0];
    }

    public Map<String, String> getParams() {
        return Collections.unmodifiableMap(params);
    }

    public FsRequest addParam(String paramName, String paramValue) {
        params.put(paramName, paramValue);
        return this;
    }

    public String getParam(String paramName) {
        return params == null?null:params.get(paramName);
    }
}
