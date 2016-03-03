package com.star.perfect.fsm.api;

import java.io.Serializable;
import java.util.Map;

/**
 *  �������
 * Created by  ������  on   2016/1/18.
 */
public interface IFsRequest extends Serializable {
    /** �ӿ�ģ������ */
    String getServiceName();

    /** ��ƽ̨/������ */
    String getChannelId();

    /** �ϴ��ļ� */
    byte[] getBytes();

    /** ������� */
    Map<String, String> getParams();

    /** ĳ����� */
    String getParam(String paramName);
}
