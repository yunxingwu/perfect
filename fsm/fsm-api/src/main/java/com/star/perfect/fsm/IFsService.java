package com.star.perfect.fsm;

import com.star.perfect.fsm.api.IFsRequest;
import com.star.perfect.fsm.api.IFsResponse;

/**
 *  文件服务器请求入口
 * Created by  伍运星  on   2016/1/18.
 */
public interface IFsService {
    public IFsResponse doRequest(IFsRequest request);
}
