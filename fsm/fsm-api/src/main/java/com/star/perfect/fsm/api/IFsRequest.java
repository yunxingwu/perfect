package com.star.perfect.fsm.api;

import java.io.Serializable;
import java.util.Map;

/**
 *  请求入参
 * Created by  伍运星  on   2016/1/18.
 */
public interface IFsRequest extends Serializable {
    /** 接口模块名字 */
    String getServiceName();

    /** 各平台/渠道号 */
    String getChannelId();

    /** 上传文件 */
    byte[] getBytes();

    /** 所有入参 */
    Map<String, String> getParams();

    /** 某个入参 */
    String getParam(String paramName);
}
