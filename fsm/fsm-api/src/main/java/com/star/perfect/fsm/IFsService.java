package com.star.perfect.fsm;

import com.star.perfect.fsm.api.IFsRequest;
import com.star.perfect.fsm.api.IFsResponse;

/**
 *  �ļ��������������
 * Created by  ������  on   2016/1/18.
 */
public interface IFsService {
    public IFsResponse doRequest(IFsRequest request);
}
