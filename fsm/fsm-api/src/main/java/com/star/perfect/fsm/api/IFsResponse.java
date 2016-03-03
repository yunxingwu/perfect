package com.star.perfect.fsm.api;

import java.io.Serializable;
import java.util.Map;

/**
 *   请求返回参数
 * Created by  伍运星  on   2016/1/18.
 */
public interface IFsResponse extends Serializable {
    /** 成功返回码 */
    String CODE_SUCCESS = "0";
    /** 成功返回码描述 */
    String CODE_DESC_SUCCESS = "成功";

    /**
     * 返回码
     *
     * @return
     */
    String getCode();

    /**
     * 返回码描述
     *
     * @return
     */
    String getCodeDesc();

    /**
     * 下载文件字节数组
     *
     * @return
     */
    byte[] getBytes();

    /**
     * 接口调用是否成功
     *
     * @return
     */
    boolean isSuccess();

    /**
     * 取参数
     *
     * @param paramName
     * @return
     */
    String getParam(String paramName);

    /**
     * 取所有参数
     *
     * @return
     */
    Map<String, String> getParams();

    /**
     * 模块名
     *
     * @return
     */
    String getServiceName();
}
