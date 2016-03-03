package com.star.perfect.fsm.api;

import java.io.Serializable;
import java.util.Map;

/**
 *   ���󷵻ز���
 * Created by  ������  on   2016/1/18.
 */
public interface IFsResponse extends Serializable {
    /** �ɹ������� */
    String CODE_SUCCESS = "0";
    /** �ɹ����������� */
    String CODE_DESC_SUCCESS = "�ɹ�";

    /**
     * ������
     *
     * @return
     */
    String getCode();

    /**
     * ����������
     *
     * @return
     */
    String getCodeDesc();

    /**
     * �����ļ��ֽ�����
     *
     * @return
     */
    byte[] getBytes();

    /**
     * �ӿڵ����Ƿ�ɹ�
     *
     * @return
     */
    boolean isSuccess();

    /**
     * ȡ����
     *
     * @param paramName
     * @return
     */
    String getParam(String paramName);

    /**
     * ȡ���в���
     *
     * @return
     */
    Map<String, String> getParams();

    /**
     * ģ����
     *
     * @return
     */
    String getServiceName();
}
