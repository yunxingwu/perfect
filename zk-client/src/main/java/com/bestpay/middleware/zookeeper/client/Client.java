package com.bestpay.middleware.zookeeper.client;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by  伍运星  on   2016/3/14.
 */

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private ZkClient zkClient ;
    Client(String address){
        zkClient = new ZkClient(address);
    }
    public  void read(String path){
            String string = zkClient.readData(path);
            logger.info(string);
    }

    public  void register(String path){
        zkClient.subscribeDataChanges(path, new IZkDataListener() {
            public void handleDataChange(String s, Object o) throws Exception {
                logger.info(s+" 节点数据发生变化");
                read(s);
            }

            public void handleDataDeleted(String s) throws Exception {

            }
        });
        read(path);
    }
    public List<String> getNodes(){
        return  zkClient.getChildren("/");
    }
    public void start(String path){
        if (zkClient.exists(path)){
            register(path);
        }else {
            logger.info("节点"+path+"不存在");
        }

    }


    public static void main(String[] args) throws InterruptedException {
        Client client = new Client(args[0]);
        System.out.println(client.getNodes());
        client.start(args[1]);
        while (true){
            Thread.sleep(5000);
        }
    }
}
