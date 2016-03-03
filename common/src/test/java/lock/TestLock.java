package lock;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by  伍运星  on   2016/3/2.
 */

public class TestLock {
    final Lock lock = new ReentrantLock();

    public void testlock(){
        new Thread(new Runnable() {
            public void run() {
                dosomething();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                dosomething();
            }
        }).start();
    }

    public void dosomething(){
        if (lock.tryLock()) {
            try {

//                lock.lock();
                System.out.println(Thread.currentThread().getName() + "获得锁，执行任务..SOC.");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "释放锁...");
                lock.unlock();  //释放锁
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"获取锁失败");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        TestLock testLock = new TestLock();
        testLock.testlock();
    }
}
