package callback;

/**
 * Created by  伍运星  on   2016/2/29.
 */

public class Local implements CallBack {
    private Remote remote;
    Local(Remote remote){
        this.remote = remote;
    }
    public void doExecute() {
        System.out.println("do local method");
    }
    public void doRemote() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                remote.remoteMethod(Local.this);
            }
        });
        thread.start();
        Thread.sleep(2000);
        System.out.println("aaa");
    }

    public static void main(String[] args) throws InterruptedException {
        Local local = new Local(new Remote());
        System.out.println(local.hashCode());
        local.doRemote();
    }
}
