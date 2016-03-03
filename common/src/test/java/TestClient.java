import org.junit.Test;

/**
 * Created by  伍运星  on   2016/2/3.
 */

public class TestClient {
    @Test
    public void test1(){
        ContextImpl context = new ContextImpl();
        context.init();
        ContextImpl context1 = new ContextImpl();
        context1.init();
    }
}
