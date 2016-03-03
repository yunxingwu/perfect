import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by  伍运星  on   2016/2/3.
 */

public class AbstractContext {
    private final Object object= new Object();
    public void init(){
        synchronized (this.object){
            System.out.println("run context!"+object.toString());
        }
    }

    public static void main(String[] args) {
       String str = "abc";
        String str1 = new String("abc");
        for (int i =3;i<3;i++){
            System.out.println("aaa");
        }
        ConcurrentHashMap map = new ConcurrentHashMap();
        Object o =map.put("1", "1");

    }
}
