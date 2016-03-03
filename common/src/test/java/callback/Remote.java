package callback;

/**
 * Created by  伍运星  on   2016/2/29.
 */

public class Remote{
    public void remoteMethod(CallBack callBack){
        System.out.println("do remote method");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(callBack.hashCode());
        callBack.doExecute();
    }
}
