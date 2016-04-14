import lombok.Getter;
import lombok.Setter;

/**
 * Created by  wuyunxing on   2016/4/12.
 */

public class Test {
    @Getter
    @Setter
    private  Main main;
    public void test(){
    }

    public static void main(String[] args) {
        new Test().getMain();
    }
}
