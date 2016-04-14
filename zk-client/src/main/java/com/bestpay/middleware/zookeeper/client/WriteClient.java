package com.bestpay.middleware.zookeeper.client;

import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;


/**
 * Created by  伍运星  on   2016/3/15.
 */

public class WriteClient {
    private final static Logger logger = LoggerFactory.getLogger(WriteClient.class);
    private  ZkClient zkClient;
    private  String node ;

    WriteClient(String[] args){
        zkClient = new ZkClient(args[0]);
        node = args[1];
        create();
    }

    public  void create(){
        if (!zkClient.exists(node)) {
            logger.info("create node "+node);
            zkClient.createEphemeral(node);
//            zkClient.createPersistent(node);
//            node = "/zktest";
        }else {
            logger.info("node "+node+" is exists");
        }
    }
    public List<String> getNodes(){
        return  zkClient.getChildren("/");
    }
    public void write() throws InterruptedException {
        if (zkClient.exists(node)) {
            for (int i = 0; i < 100; i++) {
                ;zkClient.writeData(node, "test data " + i);
                logger.info("write test data "+i);
                Thread.sleep(5000);
            }
        }

    }
    public void start() throws IOException, InterruptedException {
        write();
    }

    public static void main(String[] args) throws Exception {
        WriteClient writeClient = new WriteClient(args);
//        Thread.sleep(20000);
////        System.out.println(writeClient.getNodes());
        writeClient.start();
    }
}
