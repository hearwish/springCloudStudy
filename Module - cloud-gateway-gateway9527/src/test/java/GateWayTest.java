import org.junit.Test;

import java.time.ZonedDateTime;

/**
 * @ClassName GateWayTest
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/14 11:08 上午
 * @Version 1.0
 */
public class GateWayTest {
    @Test
    public  void ZoneDateTest() {
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }
}
