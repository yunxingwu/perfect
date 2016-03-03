package thread;

import java.util.Objects;

/**
 * Created by  伍运星  on   2016/3/2.
 */

public class ThreadA {
    private Object object;
    public static void main(String[] args) {
        final Object object = new Object();
        new Thread(){
            public void run(){
                synchronized (object){
//                    System.out.println("aaa");
                    try {
                        while (true){
                            System.out.println("aaa");
                            object.notify();
                            object.wait();
                            Thread.sleep(5000);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                synchronized (object){
//                    System.out.println("bbb");
                    try {
                        while (true) {
                            System.out.println("bbb");
                            object.notify();
                            object.wait();
                            Thread.sleep(5000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
