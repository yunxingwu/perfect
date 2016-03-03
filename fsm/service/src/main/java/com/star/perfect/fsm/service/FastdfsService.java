package com.star.perfect.fsm.service;

import com.star.perfect.fsm.IFsService;
import com.star.perfect.fsm.api.IFsRequest;
import com.star.perfect.fsm.api.IFsResponse;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by  伍运星  on   2016/1/18.
 */
@Component
public class FastdfsService implements IFsService{


    public IFsResponse doRequest(IFsRequest request) {
        return null;
    }
}
