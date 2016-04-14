#!bin/sh
cd 'dirname $0'
java -cp zk-client.jar com.bestpay.middleware.zookeeper.client.WriteClient  $*