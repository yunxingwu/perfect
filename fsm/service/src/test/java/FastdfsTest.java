import com.star.perfect.fsm.common.FastdfsManager;
import org.csource.common.MyException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.TestClass;

import java.io.IOException;
import java.util.Objects;

/**
 * Created by  伍运星  on   2016/1/19.
 */

public class FastdfsTest {
    @Test
    public void test(){
        System.out.println("aaaa");
    }

    @Test
    public void upload() throws MyException {
        FastdfsManager manager = new FastdfsManager();
        String localName = "C://Users/Administrator/Desktop/yizhifu/readme.txt";
        manager.upload(localName);
    }
    @Test
    public  void download() throws IOException, MyException {
        FastdfsManager manager = new FastdfsManager();
        manager.download();
    }
}
