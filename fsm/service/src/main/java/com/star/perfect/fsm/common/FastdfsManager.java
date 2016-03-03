package com.star.perfect.fsm.common;

import com.star.perfect.fsm.util.BytesUtils;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by  伍运星  on   2016/1/18.
 */
@Component
public class FastdfsManager {
    static {
        try {
            System.out.println("init start");
            ClientGlobal.init("E://project/perfect/fsm/service/src/main/resources/fastdfs_client.conf");
            System.out.println("init end");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public boolean upload(String file_name) throws MyException {
        TrackerClient trackerClient = new TrackerClient();
        try {
            TrackerServer trackerServer = trackerClient.getConnection();
            System.out.println(trackerServer.getSocket());
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer,storageServer);
            NameValuePair [] nvp = new NameValuePair[]{
                    new NameValuePair("name","aaa")
            };
            String fileInfo [] = storageClient.upload_file(file_name, "txt", nvp);
            System.out.println(fileInfo[0]);
            System.out.println(fileInfo[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public void download() throws IOException, MyException {
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer,storageServer);
        byte [] b =storageClient.download_file("group1", "M00/00/00/rBoGElah0CuAPjSWAAAAV_T1Gt8733.txt");
        BytesUtils.byteToFile(b,"C://Users/Administrator/Desktop/yizhifu/aaa.txt");
        System.out.println("文件下载成功！");
    }
}
